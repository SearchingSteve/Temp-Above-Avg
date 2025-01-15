package edu.keyin.stephencrocker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of days ");
        int numDays = scanner.nextInt();

        double[] temps = new double[numDays];
        double tempSum = 0;
        for (int i = 0; i < numDays; i++){
            System.out.println("Please enter the temperature for the day " + i+1 + ": ");
            temps[i] = scanner.nextDouble();
            tempSum += temps[i];
        }
        double tempAvg = tempSum/numDays;
        System.out.println("The average temperature is " + tempAvg);

        int aboveAvgCount = 0;
        for (int i = 0; i < numDays; i++){
            if (temps[i] > tempAvg){
                aboveAvgCount++;
            }
        }
        System.out.println("The count of temperatures higher than the average is " + aboveAvgCount);
    }
}