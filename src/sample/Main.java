package sample;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input coffee cost (UAH) and press Enter");
    int coffeeCost = sc.nextInt();

    System.out.println("Input quantity cups and press Enter");
    int cups = sc.nextInt();
    int totalSum;

    totalSum = coffeeCost * cups;

    System.out.println(totalSum + " UAH");
  }

}
