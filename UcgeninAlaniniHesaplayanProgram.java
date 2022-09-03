/*Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.
import java.util.Scanner;
public class DikUcgendeHipotenusBulanProgram {
    public static void main(String[] args) {
        double hipotenus ;
        Scanner input = new Scanner(System.in);
        System.out.print("İlk Kenarın Uzunluğunu Giriniz: ");
        int a = input.nextInt();
        System.out.print("İkinci Kenarın Uzunluğunu Giriniz: ");
        int b = input.nextInt();
        hipotenus = Math.sqrt((a*a + b*b));
        System.out.println("Hipotenüs Uzunluğu: " + hipotenus);
    }
}

Ödev
Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
Formül
Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
𝑢 = (a+b+c) / 2
Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
*/
import java.util.Scanner;
public class UcgeninAlaniniHesaplayanProgram{
    public static void main(String[] args) {
     double u,Alan;
     Scanner input = new Scanner (System.in);
        System.out.print("1. Kenar Uzunluğunu Giriniz: ");
        float a = input.nextFloat();
        System.out.print("2. Kenar Uzunluğunu Giriniz: ");
        float b = input.nextFloat();
        System.out.print("3. Kenar Uzunluğunu Giriniz: ");
        float c = input.nextFloat();
        u = (a+b+c)/2;
        Alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.print("Üçgenin Alanı: " +Alan);
    }
}














