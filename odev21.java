import java.util.Scanner;

public class odev21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ust,alt,sonuc=1;

        System.out.println("alttaki sayiyi giriniz : ");
        alt=input.nextInt();
        System.out.println("ustunu giriniz : ");
        ust= input.nextInt();

        for (int i = 1; i <=ust; i++) {
            sonuc*=alt;
        }
        System.out.println("\n\n\nsonuc = "+sonuc);
    }
}
