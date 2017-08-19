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



import kusevic.ljetnizadatak.model.Korisnik;

/**
 *
 * @author Tomislav
 */
public class ObradaKorisnik {
    
    private Connection con;
    private PreparedStatement stat;
    private ResultSet rs;
    
    public void unosKorisnika(Korisnik k){
        try {
            stat=con.prepareStatement("INSERT INTO korisnik (ime,prezime,oib,racun) VALUES (?,?,?,?)");
            stat.setString(1, k.getIme());
            stat.setString(2,k.getPrezime());
            stat.setString(3, k.getOib());
            stat.setString(4,k.getRacun());
            stat.execute();
        } catch (SQLException ex) {
            System.out.println("GREŠKA");
        }
        
     
        }
    
    public void promjenaKorisnika(Korisnik k){
        try {
            stat=con.prepareStatement("UPDATE korisnik SET ime=?,prezime=?,oib=?,racun=? WHERE sifra=? ");
            stat.setString(1, k.getIme());
            stat.setString(2,k.getPrezime());
            stat.setString(3,k.getOib());
            stat.setString(4, k.getRacun());
            stat.setInt(5, k.getSifra());
            stat.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ObradaKorisnik.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void obrisiKorisnika(Korisnik k){
        try {
            stat=con.prepareStatement("DELETE FROM korisnik WHERE racun=?");
            stat.setString(1,k.getRacun());
            stat.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ObradaKorisnik.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
        
    
    public ObradaKorisnik(){
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
    
    public ArrayList<Korisnik> getKorisnici(){
        ArrayList<Korisnik> korisnici = new ArrayList<>();
        try {
           stat = con.prepareStatement("SELECT * FROM korisnik");
            rs= stat.executeQuery();
            Korisnik korisnik;
            while(rs.next()){
                korisnik = new Korisnik();
                korisnik.setIme(rs.getString("ime"));
                korisnik.setPrezime(rs.getString("prezime"));
                korisnik.setOib(rs.getString("oib"));
                korisnik.setRacun(rs.getString("racun"));
                korisnici.add(korisnik);
            }
            rs.close();
            stat.close();
            
        } catch (Exception e) {
        }
        
        return korisnici;
    }
    
    
    
    
    
    
}
