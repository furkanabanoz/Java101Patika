import java.util.Scanner;

public class odev17 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);


        int k,sum=0,count=0;
        System.out.printf("Sayı giriniz : ");
        k=input.nextInt();

        for (int i = 0; i <=k ; i++) {
            if((i%3==0)&&(i%4==0))
            {
                System.out.println(String.valueOf(i));
                count++;
                sum+=i;

            }
        }
        System.out.printf("Ortalaması : "+sum/count);
    }
}
