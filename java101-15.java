/*
Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
*/
package Giris;


import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {

        int n,toplam =0,count=0;
        double sonuc;
        Scanner inp = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        n = inp.nextInt();

     for(int i =1; i<= n ;i++){

         if( i%3==0 && i%4 ==0){
             System.out.println("sayi"+i);
             toplam += i;
             count++;
            }
        }

        sonuc = toplam/count;
        System.out.println("sonuc" + sonuc);

    }
}
