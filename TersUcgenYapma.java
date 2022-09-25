package Donguler;

import java.util.Scanner;

public class TersUcgenYapma {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz: ");
        n = input.nextInt();

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * n - ((2 * i) + 1); j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
