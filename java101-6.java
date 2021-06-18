/*
Vücut Kitle İndeksi Hesaplama
Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıda ki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

Formül
Kilo (kg) / Boy(m) * Boy(m)

Çıktısı
Lütfen boyunuzu (metre cinsinde) giriniz : 1,72
Lütfen kilonuzu giriniz : 105
Vücut Kitle İndeksiniz : 35.49215792320173
*/

package Giris;

import java.util.Scanner;


public class Baslangic {
    public static void main(String[] args) {

        double vki;
        Scanner inp = new Scanner(System.in);

        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz :");
        float boy = inp.nextFloat();

        System.out.println("Lütfen kilonuzu giriniz : ");
        int kilo = inp.nextInt();

        vki = kilo/(boy*boy);
        System.out.println("Vücut Kitle İndeksiniz :" + vki);

    }
}
