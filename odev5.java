import java.util.Scanner;
public class odev5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        double MAO,pi=3.14,r;
        System.out.println("yarıçapı giriniz : ");
        r=input.nextDouble();
        System.out.printf("merkez açısının ölçüsünü giriniz : ");
        MAO=input.nextDouble();

        double sonuc=((pi*(r*r)*MAO)/360);

        System.out.println("sonuc : "+sonuc);
    }
}