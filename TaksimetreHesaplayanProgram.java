/*Taksimetre Programı
Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir.*/
import java.util.Scanner;
public class TaksimetreHesaplayanProgram {
    public static void main(String[] args) {
    double odenecekPara;
    Scanner input = new Scanner(System.in);
        System.out.print("Gidilen mesafeyi giriniz: ");
        double x = input.nextDouble();
        odenecekPara = x*2.2 + 10;
        System.out.print(odenecekPara >= 20 ? "Ödenecek Tutar: " + odenecekPara : "Ödenecek Tutar: " + 20);
    }
}
