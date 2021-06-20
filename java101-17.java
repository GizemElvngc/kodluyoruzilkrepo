/*
Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
*/
package Giris;


import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {

        int n;
        Scanner inp = new Scanner(System.in);
        System.out.println("Sayi Giriniz :");
        n = inp.nextInt();
/*
        for(int i =1 ; i<= n ; i*=4 , i*=5){

            System.out.println("4 ün kuvvetleri : " + i);
            System.out.println("5 in kuvvetleri : " + i);
        }
*/

        for(int i =1 ; i<= n ; i++){
            if(i%4==0 && i%5==0)
                System.out.println("4 ve 5 'in kuvvetleri : " + i);

        }
    }
}
