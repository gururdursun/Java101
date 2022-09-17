package Donguler;
import java.util.Scanner;
public class BasamakDegerlerininToplaminiBulanProgram {
    public static void main(String[] args) {
        int number,total=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        number= input.nextInt();

        while(number!=0){
            total+=number%10;
            number/=10;
        }System.out.println("Basamak değerleri toplamı: "+total);
    }
}
