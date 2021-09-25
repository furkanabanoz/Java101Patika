import java.sql.SQLOutput;
import java.util.Scanner;

public class odev2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tutar;
        System.out.print("Lütfen tutarı giriniz : ");
        tutar = input.nextDouble();

        if (tutar>1000)
        {

            double KDV=0.08;
            double kdvli=(KDV*tutar)+tutar;
            double sonuc=(kdvli-tutar);

            System.out.println("KDV'siz Fiyat : " + tutar);
            System.out.println("KDV'li Fiyat : "+ kdvli);
            System.out.println("KDV tutarı : "+ sonuc);

        }
        else if (tutar>0) {


            double KDV=0.18;
            double kdvli=(KDV*tutar)+tutar;
            double sonuc=(kdvli-tutar);

            System.out.println("KDV'siz Fiyat : " + tutar);
            System.out.println("KDV'li Fiyat : "+ kdvli);
            System.out.println("KDV tutarı : "+ sonuc);
        }
        else
        {
            System.out.println("Bir Yanlışlık bulunmaktadır... Tekrar deneyiz");
        }
    }
}

