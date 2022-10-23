
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner inpt=new Scanner(System.in);

    int sifre;
    int islem;
    int miktar;
    int bakiye;

    System.out.println("ATM Hoşgeldiniz");
    System.out.print("Lütfen 4 haneli şifrenizi giriniz:");
    sifre= inpt.nextInt();
        Kullanıcı user=new Kullanıcı(sifre);
        System.out.printf("Hoşgeldiniz %s %s ",user.getAd(),user.getSoyAd());
        System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz:");
        System.out.println("(1)-Para Yatırma\n(2)-Para Çekme\n(3)-Bakiye Sorgulama\n(4)-Çıkış ");
        islem= inpt.nextInt();
        while(islem!=4) {
            switch (islem) {
                case 1:
                    System.out.print("LÜtfen Yatırmak istediğiniz miktarı giriniz:");
                    miktar = inpt.nextInt();
                    bakiye = user.getBakiye();
                    bakiye += miktar;
                    user.setBakiye(bakiye);
                    break;
                case 2:
                    System.out.println("Lütfen çekmek istediğiniz miktarı giriniz:");
                    miktar = inpt.nextInt();
                    bakiye = user.getBakiye();
                    bakiye -= miktar;
                    user.setBakiye(bakiye);
                    System.out.println(bakiye);
                    break;
                case 3:
                    System.out.printf("Hesabınızda bulunan toplam para miltarı=%d\n", user.getBakiye());
                    break;
                default:
                    System.out.println("Lütfen geçerli bir işlem kodu giriniz...");
                    break;

            }
            System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz:");
            System.out.println("(1)-Para Yatırma\n(2)-Para Çekme\n(3)-Bakiye Sorgulama\n(4)-Çıkış ");
            islem= inpt.nextInt();

        }

    }
}