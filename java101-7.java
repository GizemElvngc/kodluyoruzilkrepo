/*
Manav Kasa Programı
Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

Meyveler ve KG Fiyatları

Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL
*/

package Giris;

import java.util.Scanner;


public class Baslangic {
    public static void main(String[] args) {

        float pearPrice = 2.14f , applePrice = 3.67f , tomatoPrice= 1.11f , bananaPrice = 0.95f , eggplantPrice= 5 , toplamTutar;

        Scanner inp = new Scanner(System.in);
        System.out.println("Armut Kaç Kilo ? :");
        float pearW  = inp.nextFloat();
        System.out.println("Elma Kaç Kilo ? :");
        float appleW = inp.nextFloat();
        System.out.println("Domates Kaç Kilo ? :");
        float tomatoW = inp.nextFloat();
        System.out.println("Muz Kaç Kilo ? :");
        float bananaW = inp.nextFloat();
        System.out.println("Patlıcan Kaç Kilo ? :");
        float eggplantW = inp.nextFloat();

        toplamTutar = (pearPrice*pearW)+(applePrice*appleW)+(tomatoPrice*tomatoW)+(bananaPrice*bananaW)+(eggplantPrice*eggplantW);
        System.out.println("Toplam Tutar :" + toplamTutar + "TL");
    }
}
