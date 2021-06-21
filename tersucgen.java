/*
Ters Üçgen Yapımı
Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak, yıldızlar(*) ile ekrana ters üçgen çizen programı yazın.

Örnek
Basamak Sayısı : 10

 *******************
  *****************
   ***************
    *************
     ***********
      *********
       *******
        *****
         ***
          *
   */

package Giris;


import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {


        Scanner klavye = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz :");
        int n = klavye.nextInt();


        for(int i = n; i >= 1; --i) {
            for(int k = 1; k<= n - i; ++k ){
                System.out.print("  ");
            }

            for(int j=i; j <= 2 * i - 1; ++j) {
                System.out.print("* ");
            }

            for(int j = 0; j < i - 1; ++j) {
                System.out.print("* ");
            }

            System.out.println(" ");
        }



    }
}
