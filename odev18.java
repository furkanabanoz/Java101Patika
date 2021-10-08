import java.util.Scanner;

public class odev18 {
    public static void main(String[] args) {
        int getNumber,sum =0;

        do {
            Scanner input = new Scanner(System.in);
            System.out.printf("lutfen sayi giriniz : ");
            getNumber= input.nextInt();
            if (getNumber%2==0)
            {
                if (getNumber%4==0)
                    sum+=getNumber;
            }

        }
        while (getNumber%2==0);
        {
            System.out.printf("girilen sayilarin toplami : %d dir",sum);

        }
    }

}
