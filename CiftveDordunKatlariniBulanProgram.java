package Donguler;
import java.util.Scanner;
public class CiftveDordunKatlariniBulanProgram {
    public static void main(String[] args) {
        int num,total=0;
        Scanner input=new Scanner(System.in);

        do {
            System.out.print("Sayı Giriniz: ");
            num = input.nextInt();
            if(num%4!=0){
                if(num !=2){
                    continue;
                }
            }
            total +=num;
        }while(num%4==0 || num ==2);
        System.out.println("Toplam: "+total);
    }
}
