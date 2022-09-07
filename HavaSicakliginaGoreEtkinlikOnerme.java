package KosulluIfadelerveKodBloklari;
import java.util.Scanner;
public class HavaSicakliginaGoreEtkinlikOnerme {
    public static void main(String[] args) {
        int heat;
        Scanner inp = new Scanner(System.in);
        System.out.print("Hava sıcaklığını giriniz: ");
        heat = inp.nextInt();
        if(heat<5){
            System.out.println("Kayak yapmaya gidebilirsiniz.");
        } else if (15 >= heat) {
            System.out.println("Sinemaya gidebilirsiniz.");
        } else if (25 >= heat) {
            System.out.println("Piknik yapmaya gidebilirsiniz.");
        }else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}
