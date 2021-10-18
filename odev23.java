import java.util.Scanner;

public class odev23 {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz :");
        int n = klavye.nextInt();

        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");

        }
        for (int satir = 0; satir < n; satir++) {
            System.out.print("  ");
            for (int sutun = 0; sutun < satir; sutun++) {
                System.out.print(" ");
            }

            for (int sutun = n; sutun > satir; sutun--) {
                System.out.print("*");
            }

            for (int sutun = n-1; sutun > satir; sutun--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        }



}
