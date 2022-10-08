package Metotlar;

import java.util.Scanner;

public class GelismisHesapMakinesi {
    static double addition(double a, double b) {
        System.out.println("Toplam: " + (a + b));
        return a + b;
    }

    static double substraction(double a, double b) {
        System.out.println("Fark: " + (a - b));
        return a - b;
    }

    static double multiplication(double a, double b) {
        System.out.println("Çarpım: " + (a * b));
        return a * b;
    }

    static double division(double x, double y) {
        System.out.println("Bölüm: " + (x / y));
        return x / y;
    }

    static double exp(double a, double b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println("Üslü Sayı: " + result);
        return result;
    }

    static double fact(double a) {
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        System.out.println(a + " nın " + "Faktöriyeli: " + result);
        return result;
    }

    static double mod(double a, double b) {
        System.out.println("Mod: " + (a % b));
        return a % b;
    }

    static void rect(double a, double b) {
        double area = a * b;
        double perimeter = 2 * (a + b);
        System.out.println("Alanı: " + area);
        System.out.println("Çevresi: " + perimeter);
    }

    public static void main(String[] args) {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\n5-Üs Alma\n6-Faktöriyel Hesaplama\n7-Mod Alma\n8-Dikdörtgen Çevre/Alan Hesaplama\n0-Çıkış");
            System.out.print("Yapacağınız işlemi seçiniz: ");
            int select = input.nextInt();
            if (select == 0) {
                System.out.println("Güle Güle");
                break;
            }
            if (select == 6) {
                System.out.print("Sayıyı giriniz: ");
                double a = input.nextInt();
                fact(a);
            } else {
                System.out.print("İlk sayıyı giriniz: ");
                double a = input.nextInt();
                System.out.print("İkinci sayıyı giriniz: ");
                double b = input.nextInt();
                switch (select) {
                    case 1:
                        addition(a, b);
                        break;
                    case 2:
                        substraction(a, b);
                        break;
                    case 3:
                        multiplication(a, b);
                        break;
                    case 4:
                        division(a, b);
                        break;
                    case 5:
                        exp(a, b);
                        break;
                    case 7:
                        mod(a, b);
                        break;
                    case 8:
                        rect(a, b);
                        break;
                    default:
                        System.out.print("Geçersiz ifade.Tekrar deneyin.");
                }
            }

        }
    }
}
