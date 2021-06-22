/*
Recursive Metotlar ile Üslü Sayı Hesaplama
Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini "Recursive" metot kullanarak yapan programı yazınız.

Senaryo

Taban değeri giriniz :2
Üs değerini giriniz : 0
Sonuç : 1
Taban değeri giriniz : 2
Üs değerini giriniz : 3
Sonuç : 8
Taban değeri giriniz : 5
Üs değerini giriniz : 3
Sonuç : 125
*/
package Giris;

import  java.util.Scanner;

public class Baslangic {

    static int usAlma(int taban , int us) {

        if (us==0)
            return 1;
        else if(taban==1)
            return 1;
        else
            return taban*usAlma(taban,us-1);
    }
    public static void main(String[] args) {

        int taban, us;
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        taban = scan.nextInt();
        System.out.print("Üs değerini giriniz :");
        us = scan.nextInt();

        System.out.println(usAlma(taban,us));


    }
}
