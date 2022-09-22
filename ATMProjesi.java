package Donguler;

import java.util.Scanner;

public class ATMProjesi {
    public static void main(String[] args) {
        String userName, password;
        int select = 0, right = 3, balance = 1500;
        Scanner input = new Scanner(System.in);
        while (right > 0) {
            System.out.print("Kullanıcı adınızı giriniz: ");
            userName = input.nextLine();
            System.out.print("Şifrenizi giriniz: ");
            password = input.nextLine();
            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba Kodluyoruz bankasına hoş geldiniz!");
                do {
                    System.out.print("\n1-Para Yatırma \n2-Para Çekme \n3-Bakiye Sorgulama \n4-Çıkış Yap" + "\nLütfen yapmak istediğiniz işlemi seçiniz: ");

                    select = input.nextByte();
                    switch (select) {
                        case 1:
                            System.out.print("Para miktarı: ");
                            int price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Para miktarı:");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiyeniz yetersiz.");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.print("Bakiyeniz: " + balance);
                            break;
                    }
                } while (select != 4 && select > 0 || select < 4);
                System.out.println("Tekrar görüşmek üzere!");
                break;
            } else {
                right--;
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur.Lütfen bankanız ile iletişime geçiniz.");
                    break;
                }
                System.out.println("Hatalı kullanıcı adı veya şifre.Tekrar deneyiniz.");
                System.out.println("Kalan hakkınız: " + right);
            }

        }

    }
}
