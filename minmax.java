/*
Girilen Sayılardan Min ve Max Değerli Bulan Program
Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.

Senaryo
Kaç tane sayı gireceksiniz: 4
1. Sayıyı giriniz: 16
2. Sayıyı giriniz: -22
3. Sayıyı giriniz: -15
4. Sayıyı giriniz: 100
En büyük sayı: 100
En küçük sayı: -22
*/

package Giris;


import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {




            int N,sayi,tempSayi=0,tempSayi2=0;
            Scanner inp = new Scanner(System.in);
            System.out.println("Kaç tane sayı gireceksiniz:");
            N = inp.nextInt();

            for( int i =0; i< N ; i++){

                System.out.println((i+1) + " . Sayıyı giriniz:");
                sayi = inp.nextInt();

                if(sayi > tempSayi){
                    tempSayi =sayi;
                }
                if(sayi<tempSayi2){
                    tempSayi2 =sayi;
                }


            }
            System.out.println("En büyük sayı:" + tempSayi );
            System.out.println("En küçük sayı:" + tempSayi2 );






    }
}
