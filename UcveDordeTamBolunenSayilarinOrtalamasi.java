package Donguler;
import java.util.Scanner;

public class UcveDordeTamBolunenSayilarinOrtalamasi {
    public static void main(String[] args) {
        int num,average,total=0,numofnum=0;
        Scanner input= new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        num= input.nextInt();
        for(int i=0; i<=num; i++){
            if ((i%3==0) && (i%4==0) ){
                total += i;
                numofnum++;
            }
        }
        average= total/numofnum;
        System.out.println(num+" kadar olan 3 ve 4'e tam bölünen sayıların ortalaması "+ average+" dır.");
    }
}
