package Donguler;
import java.util.Scanner;
public class DortveBesinKatlariniYazdiranProgram {
    public static void main(String[] args) {
        int sayi;
        Scanner input=new Scanner(System.in);
        System.out.print("Sayı giriniz:");
        sayi=input.nextInt();

        System.out.print("4'ün katları:");
        for(int i=1 ; i<=sayi ;i *= 4){
            System.out.print(i+" ");
        }

        System.out.print("\n5'in katları:");
        for(int k=1 ; k<=sayi ;k *= 5){
            System.out.print(k+" ");
        }
    }
}