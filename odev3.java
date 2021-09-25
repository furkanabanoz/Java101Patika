import java.util.Scanner;

public class odev3 {
    public static void main(String[] orgs){
        int birinciKenar,IkınciKenar,UcuncuKenar;
        int u,cevre,alan;
        Scanner input= new Scanner(System.in);

        System.out.println("birinci kenar giriniz : ");
        birinciKenar=input.nextInt();
        System.out.println("ikinci kenar giriniz : ");
        IkınciKenar=input.nextInt();
        System.out.println("üçüncü kenar giriniz : ");
        UcuncuKenar=input.nextInt();

        u=(birinciKenar+IkınciKenar+UcuncuKenar)/2;
        cevre=2*u;
        alan=u*(u-birinciKenar)*(u-IkınciKenar)*(u-UcuncuKenar);
        alan*=alan;

        System.out.println("alan : " +alan);

    }

}
