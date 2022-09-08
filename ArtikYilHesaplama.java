package KosulluIfadelerveKodBloklari;
import java.util.Scanner;
public class ArtikYilHesaplama {
    public static void main(String[] args) {
        int year,mod1,mod2,mod3;

        Scanner input = new Scanner(System.in);
        System.out.print("Yıl giriniz: ");
        year= input.nextInt();
        mod1 = year%4;
        mod2 = year%100;
        mod3 = year%400;

        if(!(mod2==0)){
            if(mod1==0){
                System.out.println(year+" bir artık yıldır.");
            }else{
                System.out.println(year+ " bir artık yıl değildir.");
            }
        }else{
            if(mod3==0){
                System.out.println(year+" bir artık yıldır.");
            }else {
                System.out.println(year+ " bir artık yıl değildir.");
            }
        }
    }
}
