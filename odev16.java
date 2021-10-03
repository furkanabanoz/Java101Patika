import java.util.Scanner;

public class odev16 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int yıl;
        System.out.printf("Yıl giriniz : ");
        yıl= input.nextInt();

        if(yıl%4==0)
        {
            /*if(yıl>100)
            {
                if(yıl%400==0)
                {
                    System.out.printf(yıl+" bir artık yıldır");
                }
            }*/
            System.out.printf(yıl+" bir artık yıldır");

        }
        else
            System.out.printf(yıl+" bir artık yıl değildir");

    }
}
