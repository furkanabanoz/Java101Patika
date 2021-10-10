import java.util.Scanner;

public class odev20 {
    public static void main(String[] args) {
        int a,b;

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen sayilari giriniz (C(n,r) 'i siraylar giriniz);");
        a= input.nextInt();
        b= input.nextInt();

        int sonuc;

        sonuc=faktorial(a)/(faktorial(b)*faktorial(a-b));

        System.out.printf("\n\n\n sonuc = %d",sonuc);


    }
    public static int faktorial(int x)
    {
        int sonuc1=1;
        for (int i = 1; i <= x; i++) {
            sonuc1*=i;
        }
        return sonuc1;
    }
}
