/*Dairenin Alanını ve Çevresini Hesaplayan Program
Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.
Alan Formülü : π * r * r;
Çevre Formülü : 2 * π * r;

import java.util.Scanner;
public class DaireDilimininAlaniniBulanProgram {
    public static void main(String[] args) {
    double area,perimeter;
    Scanner input = new Scanner(System.in);
        System.out.print("Yarıçap uzunluğunu giriniz: ");
        double radius = input.nextDouble();
        area = radius*radius*3.14;
        perimeter = 2*radius*3.14;
        System.out.println("Dairenin Alanı: " + area);
        System.out.println("Dairenin Çvresi: " + perimeter);
    }
}
Ödev
Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
𝜋 sayısını = 3.14 alınız.
Formül : (𝜋 * (r*r) * 𝛼) / 360
*/
import java.util.Scanner;
public class DaireDilimininAlaniniBulanProgram {
    public static void main(String[] args) {
    double radius,angle,area,pi=3.14;
    Scanner input = new Scanner(System.in);
        System.out.print("Yarıçap uzunluğunu giriniz: ");
        radius = input.nextDouble();
        System.out.print("Merkez açının ölçüsünü giriniz: ");
        angle = input.nextDouble();
        area = (pi*radius*radius*angle)/360;
        System.out.print("Daire diliminin alanı: " +area);
    }
}