/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vigenerova.sifra;

import java.util.Scanner;

/**
 *
 * @author Jiri
 */
public class VigenerovaSifra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");

        System.out.println("Zadejte text k zasifrovani:");
        String text = sc.nextLine().toLowerCase();

        System.out.println("Zadejte heslo:");
        String pass = sc.nextLine().toLowerCase();
        int posun = 0;
        String zprava = "";
        int passLength = pass.length();
        int x = 0;
// cyklus projíždějící jednotlivé znaky
        for (char c : text.toCharArray()) {
            posun = (pass.charAt(x)) - 96;
            
            
            
            x = x + 1;

            if (x == (pass.length())) {
                x = 0;

            }

            int i = (int) c;
            
            i += posun;
            if (i > 122) {
                i = i - 26;
            }
            char znak = (char) i;
            zprava += znak;
// kontrola přetečení
            
        }
        System.out.println(zprava);
    }
}
