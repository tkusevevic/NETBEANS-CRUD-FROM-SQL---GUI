/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kusevic.ljetnizadatak.controller;

/**
 *
 * @author Tomislav
 */
public class Provjera {
    public static boolean provjeriJelText(String op) {
		char niz[] = op.toCharArray();
		for (char n : niz) {
			if (!Character.isLetter(n))
				return false;
		}
		return true;

	}
    
    
    //nece se koristiti u testnoj verziji kako bi se mogao unositi random oib
    public static boolean provjeriJelOib(String oib) {

        if (oib.length() != 11)
            return false;

        try {
            Long.parseLong(oib);
        } catch (NumberFormatException e) {
            return false;
        }

        int a = 10;
        for (int i = 0; i < 10; i++) {
            a = a + Integer.parseInt(oib.substring(i, i+1));
            a = a % 10;
            if (a == 0)
                a = 10;
            a *= 2;
            a = a % 11;
        }
        int kontrolni = 11 - a;
        if (kontrolni == 10)
            kontrolni = 0;

        return kontrolni == Integer.parseInt(oib.substring(10));
    }
    
    
}
