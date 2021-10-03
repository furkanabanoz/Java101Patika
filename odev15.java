import java.util.Scanner;

public class odev15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int dogumYili;

        System.out.printf("Doğum yılınızı giriniz : ");
        dogumYili= input.nextInt();

        int cinZodyagi=dogumYili%12;

        if (cinZodyagi==0)
        {
            System.out.printf("Çin Zodyağı Burcunuz :  Maymun");
        }
        else if (cinZodyagi==1)
        {
            System.out.printf("Çin Zodyağı Burcunuz :  Horoz");
        }
        else if (cinZodyagi==2)
        {
            System.out.printf("Çin Zodyağı Burcunuz :  Köpek");
        }
        else if (cinZodyagi==3)
        {
            System.out.printf("Çin Zodyağı Burcunuz :  Domuz");
        }
        else if (cinZodyagi==4)
        {
            System.out.printf("Çin Zodyağı Burcunuz :  Fare");
        }
        else if (cinZodyagi==5)
        {
            System.out.printf("Çin Zodyağı Burcunuz :  Öküz");
        }
        else if (cinZodyagi==6)
        {
            System.out.printf("Çin Zodyağı Burcunuz :  Kaplan");
        }
        else if (cinZodyagi==7)
        {
            System.out.printf("Çin Zodyağı Burcunuz :  Tavşan");
        }
        else if (cinZodyagi==8)
        {
            System.out.printf("Çin Zodyağı Burcunuz :  Ejderha");
        }
        else if (cinZodyagi==9)
        {
            System.out.printf("Çin Zodyağı Burcunuz :  Yılan");
        }
        else if (cinZodyagi==10)
        {
            System.out.printf("Çin Zodyağı Burcunuz :  At");
        }
        else if (cinZodyagi==11)
        {
            System.out.printf("Çin Zodyağı Burcunuz :  Koyun");
        }
        else
            System.out.printf("Veri Hatalı Girilmiştir !");
    }
}
