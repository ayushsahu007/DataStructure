package Basic;

import java.util.Scanner;

public class BuzzNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number  ");
        int n = sc.nextInt();
        int digit = n%10;
        if (digit == 7 || n % 7 ==0 ){
            System.out.println("Number is Buzz");
        }else
            System.out.println("Number is not Buzz");
    }
}
