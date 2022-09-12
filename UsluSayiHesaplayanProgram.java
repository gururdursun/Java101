package Donguler;

import java.util.Scanner;

public class UsluSayiHesaplayanProgram {
    public static void main(String[] args) {
        int base, exp, result = 1;
        Scanner inp = new Scanner(System.in);

        System.out.print("Taban sayısını giriniz: ");
        base = inp.nextInt();
        System.out.print("Üssü giriniz: ");
        exp = inp.nextInt();

        for (int i = 1; i <= exp; i++) {
            result *= base;
        }
        System.out.println(base + " üzeri " + exp + " :" + result);

    }
}
