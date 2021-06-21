/*
Mükemmel Sayı Nedir ?
Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir.

Senaryolar
Bir sayı giriniz: 28
28 Mükemmel sayıdır
Bir sayı giriniz: 1
1 Mükemmel sayı değildir.
Bir sayı giriniz: 496
496 Mükemmel sayıdır
*/
package Giris;


import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {




            int N,toplam =0;
            Scanner inp = new Scanner(System.in);
            System.out.println("Bir sayı giriniz:");
            N = inp.nextInt();


            for( int i = 1; i < N ; i++){

                if(N%i == 0){

                    toplam +=i;
                }

            }
            if(toplam == N) {
                System.out.println(N + " Mükemmel sayıdır");
            }else{
                System.out.println(N + " Mükemmel sayı değildir");
            }


    }
}
