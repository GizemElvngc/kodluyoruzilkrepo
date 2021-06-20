package Giris;


import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {

        double result = 0;
        Scanner inp = new Scanner(System.in);
        System.out.println("N sayısını giriniz :");
        double n = inp.nextInt();


        while (n > 0) {
            result += (1 / n);
            n--;
        }

        System.out.println(result);


    }
}
