/*
Java'da döngüler kullanarak yıldızlar ile elmas yapınız.

    *
   ***
  *****
 *******
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

            for (int i = 0; i <= n/2 ; i++) {
            //soldaki bosluk
            for (int j = 0;j <= ((n/2) -i);j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i+ 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");

            }


            for (int i = n/2; i < n ; i++) {
                //soldaki bosluk
                for (int j = 0; j <=(i-(n/2)+1) ;j++) {
                    System.out.print(" ");
                }

                for (int k = (2 * (n-i) - 2); k >1 ; k--) {
                    System.out.print("*");
                }
                System.out.println(" ");

            }


    }
}
