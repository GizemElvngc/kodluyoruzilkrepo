//Hava Sıcaklığına Göre Etkinlik Önerme
package Giris;

import java.util.Scanner;


public class Baslangic {
    public static void main(String[] args) {

            int sicaklik;
            Scanner inp = new Scanner(System.in);

            System.out.println("Sicaklik Giriniz : ");
            sicaklik = inp.nextInt();

            if (sicaklik<5){
                System.out.println("Kayak yapabilirsiniz");
            }
            else if (sicaklik >= 5 && sicaklik <=25){
                System.out.println("Pikniğe Gidebilirsiniz");
                if(sicaklik >= 10 && sicaklik <= 25){
                    System.out.println("Sinemaya Gidebilirsiniz");
                }
            }
            else{
            System.out.println("Yüzmeye Gidebilirsiniz");
            }

    }
}
