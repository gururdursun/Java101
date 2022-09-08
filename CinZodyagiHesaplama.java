package KosulluIfadelerveKodBloklari;
import java.util.Scanner;
public class CinZodyagiHesaplama {
    public static void main(String[] args) {
        int year,mod;
        Scanner input=new Scanner(System.in);

        System.out.print("Doğum yılınız: ");
        year= input.nextInt();

        mod= year%12;

        switch (mod){
            case 0:
                System.out.println("Çin Zodyağı burcunuz: Maymun");
                break;
            case 1:
                System.out.println("Çin Zodyağı burcunuz: Horoz");
                break;
            case 2:
                System.out.println("Çin Zodyağı burcunuz: Köpek");
                break;
            case 3:
                System.out.println("Çin Zodyağı burcunuz: Domuz");
                break;
            case 4:
                System.out.println("Çin Zodyağı burcunuz: Fare");
                break;
            case 5:
                System.out.println("Çin Zodyağı burcunuz: Öküz");
                break;
            case 6:
                System.out.println("Çin Zodyağı burcunuz: Kaplan");
                break;
            case 7:
                System.out.println("Çin Zodyağı burcunuz: Tavşan");
                break;
            case 8:
                System.out.println("Çin Zodyağı burcunuz: Ejderha");
                break;
            case 9:
                System.out.println("Çin Zodyağı burcunuz: Yılan");
                break;
            case 10:
                System.out.println("Çin Zodyağı burcunuz: At");
                break;
            case 11:
                System.out.println("Çin Zodyağı burcunuz: Koyun");
                break;
            default:
                System.out.println("Geçerli ifade girmediniz.");
        }
    }
}
