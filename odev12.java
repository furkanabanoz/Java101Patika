import java.util.Scanner;

public class odev12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a,b,c,enk,enb;

        System.out.printf("birinci sayiyi giriniz :");
        a=input.nextInt();
        System.out.printf("ikinci sayiyi giriniz :");
        b=input.nextInt();
        System.out.printf("üçüncü sayiyi giriniz :");
        c=input.nextInt();

        if((a<b)&&(a<c))
        {
            if(b<c){
                System.out.printf("a < b < c");
            }
            else
            {
                System.out.printf("a < c < b");
            }

        }
        else if((b<a)&&(b<c))
        {
            if(a<c)
                System.out.printf("b < a < c");
            else
                System.out.printf("b < c < a");
        }
        else if((c<a)&&(c<b))
        {
            if(a<b)
                System.out.printf("c < a < b");
            else
                System.out.printf("c < b < a");
        }

    }
}
