
//Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.


package Giris;


import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {

        int n,k;

        Scanner inp = new Scanner(System.in);
        System.out.println("Üssü alinacak sayi:");
        n = inp.nextInt();
        System.out.println("Üs olacak sayi:");
        k = inp.nextInt();
        int i ,total =1;
        for( i=0 ; i<k ;i++){

         total *=n;
        }

        System.out.println(total);



    }
}
