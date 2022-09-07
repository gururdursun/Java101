package KosulluIfadelerveKodBloklari;
import java.util.Scanner;
public class SayilariBuyuktenKucugeSiralama {
    public static void main(String[] args) {
        int a,b,c;

        Scanner input= new Scanner(System.in);

        System.out.print("1.Sayıyı giriniz: ");
        a= input.nextInt();
        System.out.print("2.Sayıyı giriniz: ");
        b= input.nextInt();
        System.out.print("3.Sayıyı giriniz: ");
        c= input.nextInt();

        if(a>b && a>c){
            if(b>c){
                System.out.println("Sıralama: " +(a)+">"+(b)+">"+(c));
            }else{
                System.out.println("Sıralama: " +(a)+">"+(c)+">"+(b));
            }
        }else if (b>a && b>c) {
            if(a>c){
                System.out.println("Sıralama: " +(b)+">"+(a)+">"+(c) );
            }else{
                System.out.println("Sıralama: " +(b)+">"+(c)+">"+(a));
            }
        }else{
            if(b>a){
                System.out.println("Sıralama: " +(c)+">"+(b)+">"+(a) );
            }else {
                System.out.println("Sıralama: " +(c)+">"+(a)+">"+(b));
            }
        }
    }
}
