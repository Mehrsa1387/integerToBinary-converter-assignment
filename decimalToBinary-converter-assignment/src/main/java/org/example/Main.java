package org.example;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        integerToBinary(num);
    }



    public static void integerToBinary(int num) {
        System.out.println("Before recursion: n = " + num);
        if (num == 0) {
            System.out.println("idk done");
            return;
        }
        integerToBinary(num/2);

    }
}