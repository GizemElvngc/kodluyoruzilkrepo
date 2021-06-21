//Projedeki ATM işlemlerini "Switch-Case" kullanarak yapınız.

package Giris;


import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {


        String username , password;
        int right = 3;
        Scanner inp = new Scanner(System.in);
        int balance = 1500,select;


        while(right>0){

            System.out.println("Kullanici Adiniz :");
            username = inp.nextLine();
            System.out.println("Parolaniz:");
            password = inp.nextLine();
            if(username.equals("patika")  &&  password.equals("dev123")){
                do {
                    System.out.println("Merhaba ,X Bankasina Hosgeldiniz!");

                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                      System.out.println("Lütfen yapmak istediginiz islemi seciniz");
                      select = inp.nextInt();

                      switch(select){
                          case 1:
                              System.out.println("Yatirmak İstediginiz Para Miktarini Giriniz");
                              int price = inp.nextInt();
                              balance += price;
                              break;
                          case 2:
                              System.out.println("Cekmek İstediginiz Para Tutarını Giriniz");
                              int price2 = inp.nextInt();
                              if (price2 > balance){
                                  System.out.println("Bakiyeniz yetersiz");
                              }else{
                                  balance -= price2;
                                  System.out.println("Kalan bakiye ve çekilen tutar"+balance+" "+price2);
                              }
                              break;
                          case 3:
                              System.out.println("Bakiyeniz : "+ balance);
                              break;

                          default:
                              System.out.println("Hatali giris yaptiniz");
                      }

                }while(select != 4);
                 break;
            }else{
                System.out.println("Hatali kullanici adi veya sifre .Tekrar deneyiniz");
                right--;
                if(right==0){

                    System.out.println("Hesabiniz bloke olmuştur");
                }else {
                    System.out.println("Kalan hakkınız : " + right);
                }
            }

        }






    }
}
