import java.util.Scanner;
public class odev8 {
    public static void main(String[] args) {
        int n1,n2;
        double sonuc = 0;
        String islem;
        Scanner input = new Scanner(System.in);


        System.out.println("ilk sayiyi giriniz : ");
        n1=input.nextInt();
        System.out.println("ikinici sayiyi giriniz : ");
        n2=input.nextInt();

        System.out.println("islemi giriniz : ");
        islem=input.next();

        switch (islem){
            case "*":{
                sonuc=n1*n2;
                break;
            }
            case "/":{
                sonuc=n1/n2;
                break;
            }
            case "-":{
                sonuc=n1-n2;
                break;
            }
            case "+":{
                sonuc=n1+n2;
                break;
            }
            case "%":{
                sonuc=n1%n2;
                break;
            }
            default:{
                System.out.println("lütfen geçerli bir değer giriniz !!");
            }

        }

        System.out.println("Sonuc: "+ sonuc);

    }
}
