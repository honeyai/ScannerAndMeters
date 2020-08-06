package com.practice;

import java.text.DecimalFormat;
import java.util.Scanner;

public class InchesToMeters {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Feed me inches and I'll give you meters!");
    System.out.println("Inches please:");
    int inches = scanner.nextInt();
    double meter = toMeters(inches);
    DecimalFormat decimalFormat = new DecimalFormat("#.##");
    meter = Double.parseDouble((decimalFormat.format(meter)));
    System.out.print("Here are your meters! " + meter + "m.");

  }
  public static double toMeters(int inches){
    return inches / 39.37;
  }
}
