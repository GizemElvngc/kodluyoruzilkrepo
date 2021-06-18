/*
Taksimetre Programı
Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

Taksimetre KM başına 2.20 TL tutmaktadır.

Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.

Taksimetre açılış ücreti 10 TL'dir.
*/
package Giris;

import java.util.Scanner;


public class Baslangic {
    public static void main(String[] args) {

        int acilis = 10;
        float kmTutar = 2.20f;

        Scanner inp = new Scanner(System.in);
        System.out.println("Gidilecek mesafeyi giriniz ");
        float mesafe = inp.nextFloat();
        if(mesafe > 0) {
            if ((mesafe * kmTutar) <= 10) {

                System.out.println("Ödenecek tutar 20 TL");
            } else {

                System.out.println("Ödenecek tutar " + (acilis + (mesafe * kmTutar)));
            }

        }

    }
}
