package Metotlar;
import java.util.Scanner;
public class RecursiveileFibonacci {
    static int Fibonacci(int number){
        int total=0;
        if(number==0){
            return 0;
        } else if (number==1) {
            return 1;
        }
        total=Fibonacci(number-1)+Fibonacci(number-2);
        return total;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Eleman sayısını giriniz: ");
        int number=input.nextInt();
        System.out.print(Fibonacci(number));
    }
}
