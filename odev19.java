import java.util.Scanner;

public class odev19 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int getNumber;
        System.out.printf("lutfen bir sayi giriniz : ");
        getNumber= input.nextInt();

        for (int i = 1; i <getNumber; i*=4) {
            System.out.println(""+i);
        }

        System.out.println("\n\n\n");
        for (int i = 1; i <getNumber; i*=5) {
            System.out.println(""+i);
        }
    }
}
