import java.util.Scanner;

public class odev18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int getNumber,sum=0;

        System.out.printf("lutfen bir sayi giriniz ");
        getNumber=input.nextInt();

        while (getNumber%2==0)
        {
            if (getNumber%4==0)
            {
                sum += getNumber;
                System.out.printf("toplamlari : %d\n",sum);
            }
            System.out.printf("lutfen bir sayi giriniz ");
            getNumber=input.nextInt();
        }
        if (getNumber%2!=0)
        {
            System.out.println("\n\n\ntoplam = "+sum);
            System.out.println("program kapatiliyor...");
        }


    }

}
