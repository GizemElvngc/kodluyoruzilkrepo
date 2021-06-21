//Java ile iki sayının EBOB ve EKOK değerlerini "While Döngüsü" kullanarak yazınız. ** EKOK = (n1*n2) / EBOB **

package Giris;


import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {




            int n1 , n2;
            Scanner inp = new Scanner(System.in);
            System.out.println("n1 sayisini giriniz(n1<n2 kosuluyla):");
            n1 = inp.nextInt();

            System.out.println("n2 sayisini giriniz");
            n2 = inp.nextInt();

            int i = 1,ebob =1;

            while(i <= n1){
                if(n1 % i == 0 && n2 % i ==0 ) {
                    ebob = i;
                }
                i++;
            }


            int j=1;
            while( j <= (n1*n2)){

                if(j % n1 == 0 && j % n2 ==0 ) {
                    System.out.println("EKOK = "+ j);
                    break;
                }
                j++;
            }

        System.out.println((n1*n2)/ebob);

    }
}
