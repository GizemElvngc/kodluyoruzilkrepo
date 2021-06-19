//Videodaki hesap makinesini switch-case kullanarak yapınız.

package Giris;

import java.util.Scanner;


public class Baslangic {
    public static void main(String[] args) {

        int n1,n2,select;

        Scanner inp = new Scanner(System.in);
        System.out.println("İlk sayiyi giriniz");
        n1 = inp.nextInt();
        System.out.println("İkinci sayiyi giriniz");
        n2 = inp.nextInt();

        System.out.println(" 1-Toplama\n 2-Cikarma\n 3-Çarpma \n 4-Bölme");
        System.out.println("Seçiminiz");
        select = inp.nextInt();
        System.out.println(select);

        switch (select) {
            case 1:
                System.out.println(n1+n2);
                break;
            case 2:
                System.out.println(n1-n2);
                break;
            case 3:
                System.out.println(n1*n2);
                break;
            case 4:
                System.out.println((double)n1/n2);
                break;
            default:
                System.out.println("1-4 arasinda seçim yapabilirsiniz");
        }
    }
}
