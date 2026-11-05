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

        int decimal = binaryToInteger(binaryNum);
        System.out.println(decimal);
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

    public static int binaryToInteger(String binary) {
        if (binary.length() == 0) {
            return 0;
        }

        int digit = Character.getNumericValue(binary.charAt(0));

        return digit * (int) Math.pow(2, binary.length() - 1)
                + binaryToInteger(binary.substring(1));
    }

}
