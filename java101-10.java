/*
Sınıfı Geçme Durumu
Java koşullu ifadeler ile kullanıcının not durumuna göre sınıfı geçme durumunu hesaplayan program yapımı.

Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik

Geçme Notu : 55

İster
Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
*/
package Giris;

import java.util.Scanner;


public class Baslangic {
    public static void main(String[] args) {

        int mat, fizik, kimya, turkce, muzik ,toplam = 0 ,count = 0;
        Scanner inp = new Scanner(System.in);


            System.out.println("Mat notunuzu giriniz ");
             mat = inp.nextInt();
              if(mat >= 0 && mat <=100){
                  toplam += mat;
                  count++;
              }
        System.out.println("Notlarinizin toplami" + toplam);
            System.out.println("fizik notunuzu giriniz ");
             fizik = inp.nextInt();
              if(fizik >= 0 && fizik <=100){
                  toplam += fizik;
                  count++;
             }

        System.out.println("Notlarinizin toplami" + toplam);
            System.out.println("kimya notunuzu giriniz ");
             kimya = inp.nextInt();
              if(kimya  >= 0 && kimya  <=100){
                  toplam += kimya ;
                  count++;
              }
        System.out.println("Notlarinizin toplami" + toplam);
            System.out.println("turkce notunuzu giriniz ");
              turkce = inp.nextInt();
               if(turkce  >= 0 && turkce  <= 100){
                  toplam += turkce ;
                  count++;
              }
        System.out.println("Notlarinizin toplami" + toplam);
            System.out.println("muzik notunuzu giriniz ");
               muzik = inp.nextInt();
                if(muzik  >= 0 && muzik  <= 100){
                  toplam += muzik ;
                    count++;
              }


        System.out.println("Notlarinizin toplami" + toplam);
        double ortalama = toplam / count;
        System.out.println("Ortalamaniz " + ortalama);

        String state = ortalama > 55 ? "Gecti" : "Kaldi";
        System.out.println(state);


    }
}
