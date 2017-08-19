
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kusevic.ljetnizadatak.model;

import java.math.BigDecimal;

/**
 *
 * @author Tomislav
 */
public class Racun extends EntitekSifra {

    private String brojRacuna, datumOtvaranja, datumZatvaranja, stanjeRacuna;

    public String getBrojRacuna() {
        return brojRacuna;
    }

    public void setBrojRacuna(String brojRacuna) {
        this.brojRacuna = brojRacuna;
    }

    public String getDatumOtvaranja() {
        return datumOtvaranja;
    }

    public void setDatumOtvaranja(String datumOtvaranja) {
        this.datumOtvaranja = datumOtvaranja;
    }

    public String getDatumZatvaranja() {
        return datumZatvaranja;
    }

    public void setDatumZatvaranja(String datumZatvaranja) {
        this.datumZatvaranja = datumZatvaranja;
    }

    public String getStanjeRacuna() {
        return stanjeRacuna;
    }

    public void setStanjeRacuna(String stanjeRacuna) {
        this.stanjeRacuna = stanjeRacuna;
    }

}
