import java.util.Scanner;

public class odev29 {
    public static void main(String[] args) {
       int value=(int)(Math.random()*101);
       Scanner input =new Scanner(System.in);
       int[] getNumberArr=new int[5];
       int n=5;
        for (int i = 0; i < getNumberArr.length; i++) {
            System.out.printf("kalan hakkiniz "+(n--)+ " lutfen tahmininizi yaziniz : ");
            getNumberArr[i]=input.nextInt();
            if (getNumberArr[i]==value){
                System.out.println("kazandiniz!!!");
                break;
            }

            if (getNumberArr[i]>value){
                System.out.println("girdiginiz deger buyuk");
            }
            else if (getNumberArr[i]<value){
                System.out.println("girdiginiz deger kucuk");
            }

        }
        System.out.println("-----girdiginiz degerler-----");
        for(int i: getNumberArr){
            System.out.println(i+" ");
        }

        System.out.println("====tahmin edilmesi gereken sayi====\n\n"+value+"\n\n=====================================");

    }
}
