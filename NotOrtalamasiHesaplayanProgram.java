/* Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve
   ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
   Ödev
   aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana
   "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın. */
import java.util.Scanner;
public class NotOrtalamasiHesaplayanProgram{
    public static void main(String[] args) {
        float mat,fiz,kim,turk,tar,muzik,ort;
        Scanner input = new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz: ");
        mat = input.nextFloat();
        System.out.print("Fizik notunuzu giriniz: ");
        fiz = input.nextFloat();
        System.out.print("Kimya notunuzu giriniz: ");
        kim = input.nextFloat();
        System.out.print("Türkçe notunuzu giriniz: ");
        turk = input.nextFloat();
        System.out.print("Tarih notunuzu giriniz: ");
        tar = input.nextFloat();
        System.out.print("Müzik notunuzu giriniz: ");
        muzik = input.nextFloat();
        ort = (mat+fiz+kim+turk+tar+muzik) / 6 ;
        System.out.println("Ortalamanız: " + ort);
        System.out.print( (ort >=60) ? "Sınıfı Geçti" : "Sınıfta Kaldı");
    }
}                                                                                                   