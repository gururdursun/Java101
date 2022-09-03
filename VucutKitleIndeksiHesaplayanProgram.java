import java.util.Scanner;
public class VucutKitleIndeksiHesaplayanProgram {
    public static void main(String[] args) {
    double weight,height,result;
    Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        height = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz: ");
        weight = input.nextDouble();
        result = weight/(height*height);
        System.out.println("Vücut kitle indeksiniz: " + result);
    }
}
