package org.example;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static String binarynum ="";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        integerToBinary(num);
        System.out.println(binarynum);

        input.nextLine();

        System.out.println("Enter a binary number: ");
        String binaryNum = input.nextLine();
        binaryToInteger(binaryNum);
    }


    public static void integerToBinary(int num) {

        System.out.println("Before recursion: n = " + num);
        if (num == 0) {
            System.out.println("idk done");
            return;
        }
        integerToBinary(num/2);
        binarynum += num%2 ;
        System.out.println("After recursion: n = " + num + ", remainder = " + (num % 2));
    }

    public static void binaryToInteger(String binary) {
        char[] numbers = binary.toCharArray();
        int sum = 0;
        for (int i = numbers.length-1; i>=0; i--) {
            int digit = Character.getNumericValue(numbers[i]);
            sum += digit * (int)Math.pow(2, numbers.length - 1 - i);
            }
        System.out.println(sum);
    }
}
