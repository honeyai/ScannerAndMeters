package com.practice;
import java.util.Scanner;

public class ScannerHW {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Input the first number: ");
    int number1 = scanner.nextInt();
    System.out.println("Input the second number: ");
    int number2 = scanner.nextInt();
    System.out.println("You numbers were " + number1 + " and " + number2 + ". " + "This is their product: ");
    System.out.println(number1 * number2);

  }
}