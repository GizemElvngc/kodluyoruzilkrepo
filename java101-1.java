//Not Ortalamas─▒ Hesaplayan Program

package Giris;
import java.util.Scanner;
public class Baslangic {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.println("Mat notunuzu giriniz ");
        int mat = inp.nextInt();
        System.out.println(mat);

        System.out.println("fizik notunuzu giriniz ");
        int fizik = inp.nextInt();
        System.out.println(fizik);

        System.out.println("kimya notunuzu giriniz ");
        int kimya = inp.nextInt();
        System.out.println(kimya);

        System.out.println("turkce notunuzu giriniz ");
        int turkce = inp.nextInt();
        System.out.println(turkce);

        System.out.println("tarih notunuzu giriniz ");
        int tarih = inp.nextInt();
        System.out.println(tarih);

        System.out.println("muzik notunuzu giriniz ");
        int muzik = inp.nextInt();
        System.out.println(muzik);
        int toplam = 0;
        toplam = mat + fizik + kimya + turkce + tarih + muzik;
        System.out.println(toplam);

        double ortalama = toplam / 6;
        System.out.println(ortalama);

        String state = ortalama > 60 ? "Gecti" : "Kaldi";
        System.out.println(state);

    }
}
