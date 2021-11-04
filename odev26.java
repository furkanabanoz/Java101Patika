import java.util.Scanner;
import java.util.Arrays;

public class odev26 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("lutfen istediginiz degeri giriniz: ");
        int value=input.nextInt();

        System.out.println("lutfen dizinizin kac elemanli olacagini giriniz");
        int n=input.nextInt();

        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            System.out.println("lutfen dizinizin "+(i+1)+ ". elemanini giriniz : ");
            arr[i]=input.nextInt();
        }
        Arrays.sort(arr);//kucukten buyuge siralama
        int min,max;
        for (int i=0;i<n;i++){
            if(value==arr[i]){
                min=arr[i-1];
                max=arr[i+1];
                System.out.println("Girilen sayıdan küçük en yakın sayı : "+min);
                System.out.println("Girilen sayıdan buyuk en yakın sayı : "+max);
                break;
            }
            else{
                if(arr[i]<value){
                    if (arr[i+1]<arr[i]){
                        min=arr[i];
                    }
                }
                if(arr[i]>value){
                    if (arr[i+1]>arr[i]){
                        max=arr[i];
                    }
                }

            }
        }

        for (int i : arr){
            System.out.print(i+", ");
        }




    }
}
