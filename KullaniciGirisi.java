/*Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
 eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre
 ile aynı olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana "Şifre oluşturulamadı,
 lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.*/
package KosulluIfadelerveKodBloklari;
import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName,password;
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı Adı Giriniz: ");
        userName = input.nextLine();
        System.out.print("Şifre Giriniz: ");
        password= input.nextLine();

        if(userName.equals("patika") && password.equals("Java123")) {
            System.out.print("Kullanıcı girişi gerçekleşti.");
        } else{
                String answer;
                System.out.println("Bilgileriniz yanlış. Şifrenizi sıfırlamak istiyor musunuz? (evet/hayır)");
                answer = input.nextLine();
                if(answer.equals("evet")){
                    String newPassword;
                    System.out.print("Yeni Şifreniz: ");
                    newPassword = input.nextLine();
                    if(newPassword.equals(password) || newPassword.equals("Java123")){
                        System.out.println("Şifre oluşturulamadı.");
                    }else{
                        System.out.println("Şifre oluşturuldu.");
                    }
                }else{
                    System.out.println("Giriş yapılamadı.");
                }
              }


    }
}
