package Metotlar;

import java.util.Scanner;

public class RecursiveileUsHesaplama {
    static int us(int a, int b) {
        if (b == 0) {
            return 1;
        }
        return a * us(a, b - 1);
    }

    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        a = input.nextInt();
        System.out.print("Üs değeri giriniz :");
        b = input.nextInt();
        System.out.print("Sonuç: " + us(a, b));

    }
}
