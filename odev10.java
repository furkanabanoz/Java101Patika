import java.util.Scanner;
public class odev10 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);


        int matematik,fizik,turkce,kimya,muzik;
        double ortalama;

        System.out.println("matematik notunuzu giriniz : ");
        matematik=input.nextInt();

        System.out.println("fizik notunuzu giriniz : ");
        fizik=input.nextInt();

        System.out.println("turkce notunuzu giriniz : ");
        turkce=input.nextInt();

        System.out.println("kimya notunuzu giriniz : ");
        kimya=input.nextInt();

        System.out.println("muzik notunuzu giriniz : ");
        muzik=input.nextInt();


        ortalama=(matematik+kimya+fizik+muzik+turkce)/5;


        if (ortalama>100 || ortalama<0)
        {
            System.out.println("Ortalamanız hesaplanamadı bir hata bulunmaktadır tekrar deneyiniz !!");
        }
        else if(ortalama>=55)
        {
            System.out.println("Tebrikler bir üst sınıfa geçtiniz :)");
            System.out.println("Ortalamanız : "+ortalama);
        }
        else
        {
            System.out.println("Malesef Başaramadınız :(");
            System.out.println("Ortalamanız : "+ortalama);
        }






    }
}
