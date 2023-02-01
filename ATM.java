package Giris;
import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        String userName,password;
        int bakiye=1500;

        int right=3;
        while(right > 0){
            System.out.print("Kullanıcı Adınızı Giriniz:");
            userName=inp.nextLine();
            System.out.print("Şifrenizi Giriniz:");
            password=inp.nextLine();
        int dongu=0;
        while(dongu==0){
            if((userName.equals("rheme")) && (password.equals("colormeblue"))){
            System.out.print("Başarıyla Giriş Yaptınız.\nBankamıza Hoşgeldiniz.");
            int m=0;
            while(m==0){
                System.out.println("\n 1-Para Çekme \n 2-Para Yatırma \n 3-Bakiye Sorgulama \n 4-Çıkış Yap " +
                        "\n Lütfen Yapmak İstediğiniz İşlemi Seçiniz:");

            int a= inp.nextInt();
        if( a == 1){
            System.out.print("Çekmek istediğiniz tutarı giriniz:");
            int tutar=inp.nextInt();
            bakiye-=tutar;
            System.out.println("Yeni Bakiye:"+ bakiye);
            }else if(a == 2){
                System.out.print("Yatırmak istediğiniz tutarı giriniz:");
                int tutar=inp.nextInt();
                bakiye+=tutar;
                System.out.println("Yeni Bakiye:"+ bakiye);
            }else if(a == 3){
            System.out.print("Güncel Bakiyeniz:"+bakiye);
            }else{
            System.out.print("Çıkış Yaptınız");
                dongu=1;
                right=0;
                m=1;
                }
            }
            } else{
                dongu=1;
                right--;
                if(right==0){
                    System.out.println("Hesabınız Bloke olmuştur.");
                }else{
                System.out.println("Hatalı Giriş Yaptınız,Lütfen Tekrar Deneyiniz.\n Kalan Deneme Hakkınız:"+right);
            }

            }
        }
    }
}
}