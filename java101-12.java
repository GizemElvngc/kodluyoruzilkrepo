/*
Sayıları Büyükten Küçüğe Sıralayan Program
İster
Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.
*/
package Giris;

import java.util.Scanner;


public class Baslangic {
    public static void main(String[] args) {

            int bir ,iki ,uc;
            Scanner inp = new Scanner(System.in);

            System.out.println("Birinci sayiyi giriniz: ");
            bir = inp.nextInt();

            System.out.println("İkinci sayiyi giriniz: ");
            iki = inp.nextInt();

            System.out.println("Ucuncu sayiyi giriniz: ");
            uc = inp.nextInt();

                    if(bir>iki && bir>uc){
                        System.out.println("en buyuk sayi 1.sayıdır");
                    }
                    else if(iki>bir && iki>uc) {
                        System.out.println("en buyuk ikinci sayidir");
                    }
                    else{
                        System.out.println("en buyuk ucuncu sayidir");
                    }


    }
}
