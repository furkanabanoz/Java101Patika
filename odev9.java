import java.util.Scanner;
public class odev9 {
    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);

        String kullaniciAdi="furkanabnz",parola="123456";
        String girilenKullaniciAdi,girilenParola;

        System.out.println("lütfen kullanici adinizi giriniz : ");
        girilenKullaniciAdi=input.next();

        System.out.println("Şifrenizi giriniz : ");
        girilenParola=input.next();

        if(kullaniciAdi.equals(girilenKullaniciAdi) && parola.equals(girilenParola))
        {
            System.out.println("Hoş geldiniz");
        }
        else
        {
            System.out.println("girilen şifre veya kullanici adi yanliş");
            int secim;
            String yeniParola;
            System.out.println("şifrenizi degiştirmek ister misiniz evet ise '1' i tuslayiniz");
            secim=input.nextInt();

            if(secim==1)
            {
                System.out.println("Yeni sifrenizi giriniz : ");
                yeniParola= input.next();

                if (parola.equals(yeniParola))
                {
                    System.out.println("yeni girilen parola eski parolayla aynı olamaz!!");
                }
                else
                {
                    parola=yeniParola;
                    System.out.println("parolanız başarı ile değiştirildi.");

                }
            }

        }


    }
}
