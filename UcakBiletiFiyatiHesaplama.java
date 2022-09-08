package KosulluIfadelerveKodBloklari;
import java.util.Scanner;

public class UcakBiletiFiyatiHesaplama {
    public static void main(String[] args) {
        int km,age,tripType;
        double total,withdiscount,agediscount,tripTypediscount;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafe: ");
        km = input.nextInt();
        System.out.print("Yaşınız: ");
        age = input.nextInt();
        System.out.print("Yolculuk tipi (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        tripType = input.nextInt();

        total = 0.1*km;

        if(km>0 && age>0 && (tripType==1 || tripType==2)){
            if(age<12){
                agediscount= total*0.5;
                switch (tripType){
                    case 1:
                        System.out.println("Toplam Tutar: " + total + "TL");
                        break;
                    case 2:
                        tripTypediscount = agediscount*0.2;
                        agediscount -= tripTypediscount;
                        System.out.println("Toplam Tutar: " +agediscount*2 + "TL");
                        break;
                    }
            } else if (12<age && age<=24) {
                agediscount= total*0.1;
                total-=agediscount;
                switch (tripType){
                    case 1:
                        System.out.println("Toplam Tutar: " + total + "TL");
                        break;
                    case 2:
                        tripTypediscount=total*0.2;
                        withdiscount=total-tripTypediscount;
                        System.out.println("Toplam Tutar: " +withdiscount*2 + "TL");
                        break;
                    }
            } else if (age>25 && age<=65) {
                switch (tripType){
                    case 1:
                        System.out.println("Toplam Tutar: " + total + "TL");
                        break;
                    case 2:
                        tripTypediscount=total*0.2;
                        total-=tripTypediscount;
                        System.out.println("Toplam Tutar: " +total*2 + "TL");
                        break;
                    }
            }else{
                agediscount= total*0.3;
                total-=agediscount;
                switch (tripType){
                    case 1:
                        System.out.println("Toplam Tutar: " + total + "TL");
                        break;
                    case 2:
                        tripTypediscount=total*0.2;
                        total-=tripTypediscount;
                        System.out.println("Toplam Tutar: " +total*2 + "TL");
                        break;
                    }
            }
        }else{
            System.out.println("Hatalı veri girdiniz.");
        }
    }
}
