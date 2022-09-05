import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
       int n1,n2,operation;
       double result;
       Scanner inp = new Scanner(System.in);
        System.out.print("1.Sayıyı Giriniz: ");
        n1 = inp.nextInt();
        System.out.print("2.Sayıyı Giriniz: ");
        n2 = inp.nextInt();
        System.out.println("1.Toplama\n2.Çıkarma\n3.Çarpma\n4.Bölme");
        System.out.println("Seçiminiz: ");
        operation = inp.nextInt();
        switch(operation){
            case 1:
                result=n1+n2;
                System.out.println("Cevap: " +result);
                break;
            case 2:
                result=n1-n2;
                System.out.println("Cevap: " +result);
                break;
            case 3:
                result=n1*n2;
                System.out.println("Cevap: " +result);
                break;
            case 4:
                System.out.println(n2!=0 ? "Cevap: " + n1/n2 : "Bir sayının sıfıra bölümü belirsizdir.");
                break;
            default:
                System.out.println("Geçerli ifade girmediniz. Tekrar deneyiniz.");
        }
    }
}
