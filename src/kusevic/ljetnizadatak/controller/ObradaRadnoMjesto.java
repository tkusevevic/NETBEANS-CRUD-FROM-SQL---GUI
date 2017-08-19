/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kusevic.ljetnizadatak.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import kusevic.ljetnizadatak.model.RadnoMjesto;

/**
 *
 * @author Tomislav
 */
public class ObradaRadnoMjesto {

    private Connection con;
    private ResultSet rs;
    private PreparedStatement stat;

    public ObradaRadnoMjesto() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/banka", "edunova", "edunova");
        } catch (ClassNotFoundException | SQLException e) {

        }

    }

    public void zatvoriVezu() {
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ObradaRadnoMjesto.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ArrayList<RadnoMjesto> getRadnaMjesta() {
        ArrayList<RadnoMjesto> radnaMjesta = new ArrayList<>();
        try {
            stat = con.prepareStatement("SELECT * FROM radno_mjesto");
            rs = stat.executeQuery();
            RadnoMjesto mjesto;
            while (rs.next()) {
                mjesto = new RadnoMjesto();
                mjesto.setOdjel(rs.getString("odjel"));
                mjesto.setNaziv(rs.getString("naziv"));
                mjesto.setSifra(rs.getInt("sifra"));
                radnaMjesta.add(mjesto);

            }
            rs.close();
            stat.close();
        } catch (SQLException ex) {
            Logger.getLogger(ObradaRadnoMjesto.class.getName()).log(Level.SEVERE, null, ex);
        }

        return radnaMjesta;
    }
    
    public void unosRadnogMjesta(RadnoMjesto mjesto){
        try {
            stat = con.prepareStatement("INSERT INTO radno_mjesto (odjel,naziv) VALUES (?,?)");
            stat.setString(1, mjesto.getOdjel());
            stat.setString(2, mjesto.getNaziv());
            stat.execute();
        } catch (SQLException ex) {
            System.out.println("GREŠKA");
        }
       
    }
    
    public void promjenaRadnogMjesta(RadnoMjesto mjesto){
        try {
            stat = con.prepareStatement("UPDATE radno_mjesto SET naziv=?, odjel =? WHERE sifra=?");
            stat.setString(1, mjesto.getNaziv());
            stat.setString(2, mjesto.getOdjel());
            stat.setInt(3, mjesto.getSifra());
            stat.execute();
        } catch (SQLException sQLException) {
        }
        
    }
    
    public void obrisiRadnoMjesto(RadnoMjesto mjesto){
        try {
            stat = con.prepareStatement("DELETE FROM radno_mjesto WHERE SIFRA=?");
            stat.setInt(1, mjesto.getSifra());
            stat.execute();
        } catch (SQLException e) {
        }
    }
    
    
    
    

}
