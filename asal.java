//Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.

package Giris;



public class Baslangic {
    public static void main(String[] args) {

        int count = 0;
        for(int i = 2; i <= 100; i++)
        {
            int temp = 0;
            for (int j = 2; j < i; j++)
            {
                if (i % j == 0)
                {
                    temp = 1;
                    break;
                }
            }

            if(temp==0)
            {
                System.out.print(i+"\n");
                count++;
            }
        }

    }
}
