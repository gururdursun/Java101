package Donguler;

import java.util.Scanner;

/* Fibonacci */
public class FibonacciSerisi {
    public static void main(String[] args) {
        int n, n1 = 0, n2 = 1, n3;
        Scanner input = new Scanner(System.in);
        System.out.print("Eleman sayısını giriniz: ");
        n = input.nextInt();
        System.out.print(n1 + " " + n2 + " ");
        for (int i = 2; i < n; i++) {
            n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
        }
    }
}
