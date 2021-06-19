/*
Kullanıcı Girişi
Java koşullu ifadeler ile kullanıcı adı ve şifreyi kontrol eden program yapımı.

İster
Eğer kullanıcı adı yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği
ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre
oluşturuldu" yazan programı yazınız.
EK
5 şifre giriş hakkı
*/
package Giris;

import java.util.Scanner;


public class Baslangic {
    public static void main(String[] args) {

        String userName, password;
        int count = 5;
        Scanner inp = new Scanner(System.in);
        System.out.println(" Kullanici Adinizi Giriniz :");
        userName = inp.nextLine();
        System.out.println(" Şifrenizi Giriniz :");
        password = inp.nextLine();
        while(count!=0) {
            if (!(userName.equals("patika"))) {
                System.out.println("Şifrenizi sifirlamak ister misiniz?(E/H)");
                String cevap = inp.nextLine();
                if (cevap.equals("E")) {
                    System.out.println("yeni şifrenizi giriniz");
                    count -= 1;
                    String password2 = inp.nextLine();
                    if (password.equals(password2)) {
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz!!!");
                    } else {
                        System.out.println("Şifre oluşturuldu");
                    }
                }
            }
        }
            if (userName.equals("patika") && password.equals("java123")) {
                System.out.println("Giriş Yaptiniz ! ");
            } else {
                System.out.println("Bilgileriniz Yanlis");
            }





    }
}
