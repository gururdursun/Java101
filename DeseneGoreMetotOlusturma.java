package Metotlar;
/*Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın. Her çıkarma işlemi sırasında ekrana
son değeri yazdırın. Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin. Yine her ekleme işleminde sayının son
 değerini ekrana yazdırın.
 N Sayısı : 16
Çıktısı : 16 11 6 1 -4 1 6 11 16
 */

import java.util.Scanner;

public class DeseneGoreMetotOlusturma {
    static void desen(int N) {
        System.out.print(N + " ");
        if (N > 0) {
            desen(N - 5);
            System.out.print(N + " ");
        }
    }

    public static void main(String[] args) {
        int N;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        N = input.nextInt();
        desen(N);
    }
}
