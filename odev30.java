import java.util.Scanner;

public class odev30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bakiye=1500;

        int select;
        for (int i=0;i<3;i++){
            System.out.println("Kullanıcı adı :  ");
            String userName=input.nextLine();
            System.out.println("Şifre : ");
            String password=input.nextLine();
            if(userName.equals("patika")&&(password.equals("dev123"))){
                do{System.out.println("Merhaba, xXx bankasına hoşgeldiniz!");
                    System.out.println("=====================\nlütfen yapmak istediğiniz işlemi seçiniz");
                    System.out.println("1- para yatırma");
                    System.out.println("2- para çekme");
                    System.out.println("3- bakiye sorgulama");
                    System.out.println("4- çıkış");
                    System.out.println("=====================");
                    select=input.nextInt();
                    switch (select){
                        case 1:
                            System.out.println("Yatırmak istediğiniz miktarı giriniz ");
                            int addMoney= input.nextInt();
                            bakiye=bakiye+addMoney;
                            break;
                        case 2:
                            System.out.println("Çekmek istediğiniz miktarı giriniz ");
                            int removeMoney=input.nextInt();
                            if (removeMoney>bakiye)
                                System.out.println("Bakiye yetersiz");
                            else
                                bakiye=bakiye-removeMoney;
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : "+ bakiye);
                            break;
                    }
                }

                while (select!=4);
                System.out.println("Tekrar görüşmek üzere");
                    break;




            }
            else{
                System.out.println("Hatalı kullanıcı adı veya şifre. Kalan Hak:"+(3-(i+1)));
                switch (i){
                    case 2:
                        System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz");
                        break;

                }
            }

        }
    }
}
