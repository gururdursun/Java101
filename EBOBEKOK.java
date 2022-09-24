package Donguler;

import java.util.Scanner;

public class EBOBEKOK {
    public static void main(String[] args) {
        int number1, number2, i = 1, ebob = 1, ekok;
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        number1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz:");
        number2 = input.nextInt();
        

        while (i <= number1 && i <= number2) {
            if (number1 % i == 0 && number2 % i == 0) {
                ebob = i;
            }
            i++;
        }
        System.out.println(number1 + " ve " + number2 + " sayılarının ebobu: " + ebob);
        System.out.print(number1 + " ve " + number2 + " sayılarının ekoku: " + (number1 * number2) / ebob);
    }
}
