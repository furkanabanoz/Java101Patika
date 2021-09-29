import java.util.Scanner;

public class odev13 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        String ay;
        int gun;
        System.out.printf("doğduğunuz ayı giriniz:");
        ay=input.next();

        System.out.printf("doğduğunuz gün : ");
        gun= input.nextInt();

        if(ay.equals("ocak"))
        {
            if(gun<22)
                System.out.printf("oglak burcusunuz");
            else
                System.out.printf("kova burcusunuz");
        }
        else if(ay.equals("subat"))
        {
            if(gun<19)
                System.out.printf("kova burcusunuz");
            else
                System.out.printf("balık burcusunuz");
        }
        else if(ay.equals("mart"))
        {
            if(gun<20)
                System.out.printf("balık burcusunuz");
            else
                System.out.printf("koc burcusunuz");
        }
        else if(ay.equals("nisan"))
        {
            if(gun<20)
                System.out.printf("koc burcusunuz");
            else
                System.out.printf("boga burcusunuz");
        }
        else if(ay.equals("mayis"))
        {
            if(gun<21)
                System.out.printf("boga burcusunuz");
            else
                System.out.printf("ikizler burcusunuz");
        }
        else if(ay.equals("haziran"))
        {
            if(gun<22)
                System.out.printf("ikizler burcusunuz");
            else
                System.out.printf("yengec burcusunuz");
        }
        else if(ay.equals("temmuz"))
        {
            if(gun<22)
                System.out.printf("yengec burcusunuz");
            else
                System.out.printf("aslan burcusunuz");
        }
        else if(ay.equals("agustos"))
        {
            if(gun<22)
                System.out.printf("aslan burcusunuz");
            else
                System.out.printf("basak burcusunuz");
        }
        else if(ay.equals("eylul"))
        {
            if(gun<22)
                System.out.printf("basak burcusunuz");
            else
                System.out.printf("terazi burcusunuz");
        }
        else if(ay.equals("ekim"))
        {
            if(gun<22)
                System.out.printf("terazi burcusunuz");
            else
                System.out.printf("akrep burcusunuz");
        }
        else if(ay.equals("kasim"))
        {
            if(gun<21)
                System.out.printf("akrep burcusunuz");
            else
                System.out.printf("yay burcusunuz");
        }
        else if(ay.equals("aralik"))
        {
            if(gun<21)
                System.out.printf("yay burcusunuz");
            else
                System.out.printf("oğlak burcusunuz");
        }
        else
            System.out.printf("hatali giriş yaptınız !!");
    }
}
