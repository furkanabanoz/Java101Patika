import java.util.Scanner;
public class odev11 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double derece;

        System.out.println("Hava kaç derece : ");
        derece=input.nextDouble();

        if (derece<5)
        {
            System.out.println("Tam kayak yapmalık hava");
        }
        else if (derece<15)
        {
            System.out.println("Tam sinema yapmalık hava");
        }
        else if (derece<25)
        {
            System.out.println("Tam piknik yapmalık hava");
        }
        else
        {
            System.out.println("Tam yüzmeye gidilecek hava");
        }

    }
}
