import java.util.Scanner;
public class odev7 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        double armutf=2.14,elmaf=3.67,domatesf=1.11,muzf=0.95,patlicanf=5,toplamFiyat;
        double armut,elma,domates,muz,patlican;
        System.out.println("armut kac kilo : ");
        armut= input.nextDouble();
        System.out.println("elma kac kilo : ");
        elma= input.nextDouble();
        System.out.println("domates kac kilo : ");
        domates= input.nextDouble();
        System.out.println("muz kac kilo : ");
        muz= input.nextDouble();
        System.out.println("patlıcan kac kilo : ");
        patlican= input.nextDouble();

        toplamFiyat=armut*armutf+elma*elmaf+domates*domatesf+muz*muzf+patlican*patlicanf;

        System.out.print("Toplam tutar : "+toplamFiyat+ " TL");


    }
}
