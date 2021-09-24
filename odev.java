import java.util.Scanner;

public class ödev1 {
    public static void main(String[] args) {

        int mat,fizik,kimya,tarih,muzik,turkce;
        Scanner input=new Scanner(System.in);

        System.out.println("matematik notunuz : ");
        mat=input.nextInt();

        System.out.println("fizik notunuz : ");
        fizik=input.nextInt();

        System.out.println("kimya notunuz : ");
        kimya=input.nextInt();

        System.out.println("tarih notunuz : ");
        tarih=input.nextInt();

        System.out.println("turkce notunuz : ");
        turkce=input.nextInt();

        System.out.println("muzik notunuz : ");
        muzik=input.nextInt();

        int toplam;

        toplam=mat+fizik+kimya+tarih+muzik+turkce;

        double ort;

        ort = toplam / 6;

        if (ort>60)
        {
            System.out.println("Sınıfı geçti");
        }
        else
        {
            System.out.print("sınıfta kaldı");
        }





    }
}
