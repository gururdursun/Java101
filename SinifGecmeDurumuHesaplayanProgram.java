package KosulluIfadelerveKodBloklari;
import java.util.Scanner;

public class SinifGecmeDurumuHesaplayanProgram {
    public static void main(String[] args) {
        int maths,physics,turkish,chem,music,lessonNumber=0,addition = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        maths= input.nextInt();
        if(!(maths<0 || maths>100)){
            addition += maths;
            lessonNumber++;
        }

        System.out.print("Fizik notunuzu giriniz: ");
        physics= input.nextInt();
        if(!(physics<0 || physics>100)){
            addition += physics;
            lessonNumber++;
        }

        System.out.print("Türkçe notunuzu giriniz: ");
        turkish= input.nextInt();
        if(!(turkish<0 || turkish>100)){
            addition += turkish;
            lessonNumber++;
        }

        System.out.print("Kimya notunuzu giriniz: ");
        chem= input.nextInt();
        if(!(chem<0 || chem>100)){
            addition += chem;
            lessonNumber++;
        }

        System.out.print("Müzik notunuzu giriniz: ");
        music= input.nextInt();
        if(!(music<0 || music>100)){
            addition += music;
            lessonNumber++;
        }

        System.out.println("Ortalamanız: " + (addition/lessonNumber));

        if((addition/lessonNumber)<55){
            System.out.println("Sınıfta kaldınız.");
        }else{
            System.out.println("Sınıfı geçtiniz.");
        }

    }
}
