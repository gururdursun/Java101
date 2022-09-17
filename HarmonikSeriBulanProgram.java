package Donguler;

import java.util.Scanner;

public class HarmonikSeriBulanProgram {
    public static void main(String[] args) {
        int number;
        double n = 1, total = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        number = input.nextInt();
        while (n <= number) {
            total += (1 / n);
            n++;
        }
        System.out.println("Harmonik seri toplamı: " + total);
    }
}
