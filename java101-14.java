/* Uçak Bileti Fiyatı Hesaplama
Uçak Bileti Fiyatı Hesaplayan Program
Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
İpucu
Normal Tutar = Mesafe * 0.10 = 1500 * 0.10 = 150 TL
Yaş İndirimi = Normal Tutar * Yaş İndirim Oranı = 150 * 0.10= 15 TL
İndirimli Tutar = Normal Tutar – Yaş İndirimi = 150 – 15 = 135 TL
Gidiş Dönüş Bilet İndirimi = İndirimli Tutar * 0.20 = 135 * 0.20 = 27 TL
Toplam Tutar = (135-27)* 2 = 216 TL
Senaryolar
Senaryo 1
Mesafeyi km türünden giriniz : 1500
Yaşınızı giriniz : 20
Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): 2

Toplam Tutar = 216 TL
Senaryo 2
Mesafeyi km türünden giriniz : -500
Yaşınızı giriniz : 1
Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): 77

Hatalı Veri Girdiniz !
Senaryo 3
Mesafeyi km türünden giriniz : 200
Yaşınızı giriniz : 35
Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): 1

Toplam Tutar = 20.0 TL
*/
package Giris;


import java.util.Scanner;


public class Baslangic {
    public static void main(String[] args) {

        double mesafe, kmUcret = 0.10, toplam = 0, yasIndirimi, indirimliTutar, ggIndirimi, toplamTutar;
        int yas, yolculukTip;

        Scanner inp = new Scanner(System.in);

        System.out.println("Mesafeyi km türünden giriniz :  ");
        mesafe = inp.nextDouble();

        System.out.println("Yaşınızı giriniz :");
        yas = inp.nextInt();

        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        yolculukTip = inp.nextInt();

        toplam = mesafe*kmUcret;


        if (yas>0 && mesafe>0 && (yolculukTip==1 || yolculukTip==2)) {

            if (yas < 12) {
                yasIndirimi = toplam * 0.5;
                System.out.println("Yaş İndirimi" + yasIndirimi);
                indirimliTutar = toplam - yasIndirimi;
                System.out.println("İndirimli Tutar" + indirimliTutar);
                if (yolculukTip == 2) {
                    ggIndirimi = indirimliTutar*0.2;
                    System.out.println("Gidiş Dönüş Bilet İndirimi"+ggIndirimi);
                    toplamTutar = (indirimliTutar - ggIndirimi)*2;
                    System.out.println("Ödemeniz gereken indirimli fiyat: " + toplamTutar);
                }

            } else if (yas >= 12 && yas <= 24) {

                yasIndirimi = (toplam * 0.1);
                System.out.println("Yaş İndirimi" + yasIndirimi);
                indirimliTutar = toplam - yasIndirimi;
                System.out.println("İndirimli Tutar" + indirimliTutar);
                if (yolculukTip == 2) {
                    ggIndirimi = (indirimliTutar * 0.2);
                    System.out.println("Gidiş Dönüş Bilet İndirimi" + ggIndirimi);
                    toplamTutar = (indirimliTutar - ggIndirimi) * 2;
                    System.out.println("Ödemeniz gereken indirimli fiyat: " + toplamTutar);
                }
            }else if (yas >=25 && yas <65) {
                    toplam = mesafe*kmUcret;
                    System.out.println("Toplam Tutar!" + toplam);

                    if (yolculukTip == 2) {
                        System.out.println("Toplam Tutar!" + toplam*2);
                    }
            } else {

                yasIndirimi = (toplam * 0.3);
                System.out.println("Yaş İndirimi" + yasIndirimi);
                indirimliTutar = toplam - yasIndirimi;
                System.out.println("İndirimli Tutar" + indirimliTutar);
                if (yolculukTip == 2) {
                    ggIndirimi = (indirimliTutar*0.2);
                    System.out.println("Gidiş Dönüş Bilet İndirimi"+ggIndirimi);
                    toplamTutar = (indirimliTutar - ggIndirimi)*2;
                    System.out.println("Ödemeniz gereken indirimli fiyat: " + toplamTutar);
                }

            }
        }else {
            System.out.println("Hatali veri girdiniz !");
        }


    }
}
