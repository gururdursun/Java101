package Donguler;

import java.util.Scanner;

public class KombinasyonHesaplayanProgram {
    public static void main(String[] args) {
        int n, r, diff, combination, factorialn = 1, factorialr = 1, factorialdiff = 1;
        Scanner inp = new Scanner(System.in);

        System.out.print("N elemanlı kümenin eleman sayısını giriniz: ");
        n = inp.nextInt();
        System.out.print("R elemanlı grupların eleman sayısını giriniz: ");
        r = inp.nextInt();
        diff = n - r;

        for (int i = 1; i <= n; i++) {
            factorialn *= i;
        }
        for (int i = 1; i <= r; i++) {
            factorialr *= i;
        }
        for (int i = 1; i <= diff; i++) {
            factorialdiff *= i;
        }
        combination = factorialn / (factorialr * factorialdiff);
        System.out.println("C(" + n + "," + r + ") : " + combination);

    }
}
