/*
N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

Java ile kombinasyon hesaplayan program yazınız.

Kombinasyon formülü
C(n,r) = n! / (r! * (n-r)!)
*/
package Giris;


import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {

        int n,r;
        double kombinasyon ;
        Scanner inp = new Scanner(System.in);
        System.out.println("Eleman Sayisini Giriniz :");
        n = inp.nextInt();
        System.out.println("Seçim Sayisini Giriniz :");
        r = inp.nextInt();

        int total = 1, total2 = 1, total3 = 1;

        for(int i=1 ; i<= n; i++){
            total*=i;
        }

        for(int i=1 ; i<= r; i++){
            total2*=i;
        }

        for(int i=1; i<=(n-r); i++){
            total3 *= i;
        }


        kombinasyon = (double)(total / (total2 * total3));
        System.out.println("Kombinasyon değeri :" + kombinasyon);





    }
}
