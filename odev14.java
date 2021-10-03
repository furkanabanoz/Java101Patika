import java.util.Scanner;

public class odev14 {
    public static void main(String[] args) {
        int mesafe,yas,yolculukTipi;
        double yasIndirimi,mesafeUcret=0.10,ucret,indirimliUcret;
        Scanner input = new Scanner(System.in);


        System.out.printf("lütfen mesafeyi giriniz(km) : ");
        mesafe=input.nextInt();
        if(mesafe>0)
        {
            ucret=mesafe*mesafeUcret;

            System.out.printf("Lütfen yaşınızı giriniz : ");
            yas = input.nextInt();
            if (yas>0)
            {
                System.out.printf("Yolculuk tipini seçiniz (1 = Tek Yön , 2 = Gidiş Dönüş)");
                yolculukTipi=input.nextInt();
                if ((yolculukTipi==1)||(yolculukTipi==2))
                {
                    if (yolculukTipi==1)
                    {
                        if (yas<12)
                        {
                            ucret =ucret-(ucret*(1/2));
                            System.out.printf("\n\nToplam tutar : %2f TL",ucret);
                        }
                        else if ((yas>=12)&&(yas<=24))
                        {
                            indirimliUcret =(ucret*(10/100));
                            ucret=ucret-indirimliUcret;
                            System.out.printf("\n\nToplam tutar : %2f TL",ucret);
                        }
                        else
                        {
                            System.out.printf("\n\nToplam tutar : %2f TL",ucret);
                        }



                    }
                    else if(yolculukTipi==2)
                    {
                        if (yas<12)
                        {
                            ucret =(2*ucret)-((2*ucret)*(1/2));
                            System.out.printf("\n\nToplam tutar : %2f TL",ucret);
                        }
                        else if ((yas>=12)&&(yas<=24))
                        {
                            ucret =ucret-(ucret*10/100);
                            indirimliUcret=ucret*20/100;
                            ucret=(ucret-indirimliUcret)*2;
                            System.out.printf("\n\nToplam tutar : %2f TL",ucret);
                        }
                        else if (yas>=65)
                        {
                            ucret=(2*ucret)-((2*ucret)*(20/100));
                            System.out.printf("\n\nToplam tutar : %2f TL",ucret);
                        }
                        else
                        {
                            ucret=(2*ucret);
                            System.out.printf("\n\nToplam tutar : %2f TL",ucret);
                        }

                    }
                }
                else
                    System.out.printf("Hatalı Veri Girdiniz !");


            }
            else
                System.out.printf("Hatalı Veri Girdiniz !");


        }
        else
        {
            System.out.printf("Hatalı Veri Girdiniz !");
        }




    }
}
