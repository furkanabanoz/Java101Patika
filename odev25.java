import java.util.Scanner;

public class odev25 {
    public static void main(String[] args) {
        int n;
        double sum=0;
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen n degerini giriniz");
        n=input.nextInt();
        int[] arr=new int[n];
        for (double i=1;i<=n;i++){
            sum+=(1/i);
            System.out.println(sum);
        }


    }
}
