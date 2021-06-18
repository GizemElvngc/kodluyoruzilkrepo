*/
KDV Tutarı Hesaplayan Program

KDV'siz Fiyat = 10;

KDV'li Fiyat = 11.8;

KDV tutarı = 1.8;

İster
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
*/

package Giris;

import java.util.Scanner;
public class Baslangic {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.println("Para girisi yapiniz ");
        int para = inp.nextInt();
        if(para > 0 && para <= 1000) {
            float yeniPara = para * 0.18f;
            float kdvli = para + yeniPara;
            System.out.println("KDV'siz fiyat " + para);
            System.out.println("KDV'li fiyat " + kdvli);
        }
        if(para > 1000){
            float yeniPara = para * 0.8f;
            float kdvli = para + yeniPara;
            System.out.println("KDV'siz fiyat " + para);
            System.out.println("KDV'li fiyat " + kdvli);
        }



    }
}
