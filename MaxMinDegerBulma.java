package Donguler;

import java.util.Scanner;

public class MaxMinDegerBulma {
    public static void main(String[] args) {
        int sayiadedi, sayi, enbuyuk = 0, enkucuk = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz: ");
        sayiadedi = input.nextInt();
        for (int i = 1; i <= sayiadedi; i++) {
            System.out.print(i + ".Sayıyı giriniz: ");
            sayi = input.nextInt();
            if (i == 1) {
                enbuyuk = sayi;
                enkucuk = sayi;
            } else {
                if (sayi > enbuyuk) {
                    enbuyuk = sayi;
                } else if (sayi < enkucuk) {
                    enkucuk = sayi;
                }
            }

        }
        System.out.println("En büyük sayı: " + enbuyuk);
        System.out.print("En küçük sayı: " + enkucuk);

    }
}
