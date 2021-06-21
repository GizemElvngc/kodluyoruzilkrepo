/*Fibonacci Serisi Nedir ?
Fibonacci serisi, her sayının kendinden önceki ile toplanması sonucu oluşan bir sayı dizisidir. Bu şekilde devam eden bu dizide sayılar birbirleriyle oranlandığında altın oran ortaya çıkar, yani bir sayı kendisinden önceki sayıya bölündüğünde altın orana gittikçe yaklaşan bir dizi elde edilir.

Fibonacci dizisi, 0'dan başlar ve sonsuza kadar. Her rakam, bir önceki rakamla toplanır. Elde edilen sonuç rakamın sağ tarafına yazılır. Fibonacci dizisinin ilk on sayısı şu şekildedir:

9 Elemanlı Fibonacci Serisi : 0 1 1 2 3 5 8 13 21 34*/

package Giris;

import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {

        int n1=0,n2=1,n3,i;

        Scanner inp = new Scanner(System.in);
        System.out.println("Sayi girin ");
        float sayi = inp.nextFloat();

        for(i=2;i<sayi;++i)
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }




    }
}
