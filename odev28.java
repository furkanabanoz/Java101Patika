import java.util.Scanner;
import java.util.Arrays;

public class odev28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("lutfen dizinin boyutunu giriniz : ");
        int size= input.nextInt();

        int[] arr=new int[size];
        System.out.println("Dizinin elemanlarini giriniz : ");
        for (int i=0;i<arr.length;i++){
            System.out.printf((i+1)+". elemani : ");
            arr[i]=input.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
