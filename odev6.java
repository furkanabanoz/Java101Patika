import java.util.Scanner;
public class odev6 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        double boy,kilo;
        System.out.println("lütfen boy(metre) giriniz : ");
        boy=input.nextDouble();
        System.out.println("kilonuzu giriniz : ");
        kilo=input.nextDouble();

        double sonuc;
        sonuc=(kilo/(boy*boy));

        System.out.print("Vücut kitle indeksiniz : "+sonuc);


    }
}
