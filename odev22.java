import java.util.Scanner;

public class odev22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;

        System.out.printf("lutfen bir sayi giriniz : ");
        sayi= input.nextInt();

        int temp,toplam=0;


        while (sayi>0)
        {
            temp=sayi%10;
            sayi=sayi/10;
            toplam+=temp;

        }
        System.out.println("\n\n\ntoplam = "+toplam);
    }
}
