import java.util.Scanner;

public class odev4 {
    public static void main(String[] args){

        Scanner input=new Scanner(System.in);

        double mesafe,ucret=10;
        System.out.println("Gidilen mesafe kaç km : ");
        mesafe= input.nextDouble();

        double kmBasınaUcret=2.20,MinimunTutar=20;

        ucret=ucret+(kmBasınaUcret*mesafe);


        if(ucret<20)
        {
            ucret=20;
            System.out.println("ödenecek tutar : "+ucret);

        }

        else if (ucret>=20)
        {
            System.out.println("ödenecek ücret : "+ucret);

        }
        else
        {
            System.out.println("taksiye binmeniz gerekmekte ücret ödeyebilmeniz için !!");
        }



    }
}
