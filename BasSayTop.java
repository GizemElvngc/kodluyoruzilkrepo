/*
Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.

Örnek : 1643 = 1 + 6 + 4 + 3 = 14
*/
package Giris;


import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {


        int sayi,basValue,toplam = 0;
        Scanner inp = new Scanner(System.in);
        System.out.println(" sayi:");
        sayi = inp.nextInt();



         while(sayi != 0){

             basValue = sayi % 10;
             toplam += basValue;
             sayi /= 10;

         }
        System.out.println("Basamak degerlerinin toplami : "+toplam);


         /*
        int a , count = 0,birler;
        Scanner inp = new Scanner(System.in);
        System.out.println(" sayi:");
        a = inp.nextInt();



        Basamak sayisi bulma islemi
        2451 /10 = 245
        245 /10 = 24
        24 /10 =2
        2/10 = 0
        4


        while(a != 0){
            count++;
            a /= 10;
            System.out.println(a);
        }
        System.out.println("count :"+ count);


        int sub = 2 , sup = 5, result = 1;

        for(int i = 0; i<= sup ; i++){

           result*=sub;
        }
        System.out.println(result);
*/


    }
}
