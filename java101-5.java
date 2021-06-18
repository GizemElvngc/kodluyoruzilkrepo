*/
Dairenin Alanını ve Çevresini Hesaplayan Program
Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

Alan Formülü : π * r * r;

Çevre Formülü : 2 * π * r;

İster
Yarıçapı r, merkez açısısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

𝜋 sayısını = 3.14 alınız.

Formül : (𝜋 * (r*r) * 𝛼) / 360
*/

package Giris;

import java.util.Scanner;


public class Baslangic {
    public static void main(String[] args) {

        double alan , cevre , daireDilimAlani;
        float pi = 3.14f;
        Scanner inp = new Scanner(System.in);
        System.out.println("yaricapi giriniz ");
        int r = inp.nextInt();
        alan = pi*r*r;
        cevre = pi*r*2;
        System.out.println("Dairenin alani " + alan);
        System.out.println("Dairenin cevresi " + cevre);
        System.out.println("daire dilim olcusunu giriniz ");
        int a = inp.nextInt();

        daireDilimAlani = (pi*(r*r)*a)/360;
        System.out.println("Daire diliminin alani " + daireDilimAlani);

    }
}
