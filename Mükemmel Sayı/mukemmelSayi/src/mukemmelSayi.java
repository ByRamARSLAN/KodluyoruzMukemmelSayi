import java.util.Scanner;

public class mukemmelSayi {

    public static void main(String[] args){

        int number, total = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz : ");
        number = input.nextInt();

        if (number == 1){
            System.out.println(number + " Sayısı mükemmel sayı değildir");
        }

        for (int i = 1; i < number; i++){
            if(number % i == 0){
                total += i;
            }
        }
        if (total == number){
            System.out.println(number + " Sayısı mükemmel sayıdır.");
        }else {
            System.out.println(number + " Sayısı mükemmel sayı değildir.");
        }
    }
}
