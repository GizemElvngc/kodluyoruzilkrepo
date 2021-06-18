/*
Dik Üçgende Hipotenüs,Cevre ve Alan Bulan Program

Formül
Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

𝑢 = (a+b+c) / 2

Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
*/

package Giris;

import java.util.Scanner;

import static java.lang.StrictMath.sqrt;

public class Baslangic {
    public static void main(String[] args) {


        int a,b;
        double c;
        double  u , ucgenCevre , ucgenAlan  ;

        Scanner inp = new Scanner(System.in);
        System.out.println("a kenarinin degerini giriniz ");
         a = inp.nextInt();

        System.out.println("b kenarinin degerini giriniz");
         b = inp.nextInt();


         c = Math.sqrt((a*a)+(b*b));
         System.out.println("Hipotenüs :" + c);
         double toplam = 0;
         toplam = a+b+c;
         u = toplam/2;
         ucgenCevre = u*2;
         ucgenAlan = 1;
         ucgenAlan = sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Uçgenin cevresi" + ucgenCevre);
        System.out.println("Ucgenin alani" + ucgenAlan);

    }


}
