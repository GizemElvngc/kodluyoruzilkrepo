package Giris;

import  java.util.Scanner;

public class Baslangic {

     static int asalMi(int sayi, int i) {


        if (i == 1) {

            return 1;

        }else if(sayi % i == 0) {

            return 0;

        }else{
             return asalMi(sayi,i-1);
        }
    }



    public static void main(String[] args) {

        int sayi,i,kosul;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı Giriniz :  ");
        sayi = inp.nextInt();


            for(i=2;i<=sayi;i++)
            {
                kosul = asalMi(i,i/2);
                if(kosul==1)
                {
                    System.out.println("sayısı ASALDIR !" + i);
                }
                
            }





    }
}
