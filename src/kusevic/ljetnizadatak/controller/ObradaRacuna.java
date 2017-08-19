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
import kusevic.ljetnizadatak.model.Racun;

/**
 *
 * @author Tomislav
 */
public class ObradaRacuna {
    
    private Connection con;
    private PreparedStatement stat;
    private ResultSet rs;
    
    
    public void noviRacun(Racun r){
         try {
            stat=con.prepareStatement("INSERT INTO racun (broj_racuna,datum_otvaranja,stanje_racuna) VALUES (?,?,?)");
            stat.setString(1,r.getBrojRacuna());
            stat.setString(2, r.getDatumOtvaranja());
            stat.setString(3,r.getStanjeRacuna());
            stat.execute();
        } catch (SQLException ex) {
            System.out.println("GREŠKA");
        }
    }
    
    public void uplata(Racun r){
        try {
            stat=con.prepareStatement("UPDATE racun SET stanje_racuna=? WHERE sifra=?");
            stat.setString(1, r.getStanjeRacuna());
            stat.setInt(2, r.getSifra());
            stat.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(ObradaRacuna.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    
    public ObradaRacuna(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/banka","edunova","edunova");
        } catch (ClassNotFoundException | SQLException e) {
        }
        
    }
    
    public void zatvoriVezu(){
        try {
            con.close();
        } catch (SQLException ex) {
        }
    }
    
    public ArrayList<Racun> getRacuni(){
        ArrayList<Racun> racuni = new ArrayList<>();
        try {
            stat=con.prepareStatement("SELECT * FROM racun");
            rs=stat.executeQuery();
            Racun racun;
            while (rs.next()) {
                racun = new Racun();
                racun.setSifra(rs.getInt("sifra"));
                racun.setBrojRacuna(rs.getString("broj_racuna"));
                racun.setDatumOtvaranja(rs.getString("datum_otvaranja"));
                racun.setStanjeRacuna(rs.getString("stanje_racuna"));
                racuni.add(racun);
                
            }
            rs.close();
            stat.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(ObradaRacuna.class.getName()).log(Level.SEVERE, null, ex);
        }
        return racuni;
    }
    
    
  
    
}
