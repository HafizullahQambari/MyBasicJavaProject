package com.syntax.class19;

import java.util.Scanner;

public class Parent
{
    public static void main(String[] args)
    {
        float AvgMPG = 0;
        int MilesDriven = 0;
        int totalTrips = 0;
        int GallonsUsed = 0;
        int totalMilesPerGallon = 0;
        int MilesPerGallon = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Miles Driven or -1 to quit:  ");
        MilesDriven = input.nextInt();

        System.out.println("Enter Gallons used to fill tank or -1 to quit:  ");
        GallonsUsed = input.nextInt();

        while ( MilesDriven != -1)
        {
            MilesPerGallon = MilesDriven / GallonsUsed;
            System.out.println("Miles Per Gallon for this trip:  "           +MilesPerGallon);

            totalMilesPerGallon = MilesPerGallon + totalMilesPerGallon;

            totalTrips = totalTrips + 1;

            System.out.println("Enter Miles Driven or -1 to quit:  ");
            MilesDriven = input.nextInt();

            System.out.println("Enter Gallons used to fill tank or -1 to quit:  ");
            GallonsUsed = input.nextInt();
        }
    if (totalTrips != 0)
    {
      System.out.println("Number of trips taken:  "+ totalTrips);

      AvgMPG = (float) totalMilesPerGallon / totalTrips;

      System.out.println("Total Miles Per Gallon for all trips is :"             +totalMilesPerGallon);               
      System.out.println("Average Miles Per Gallon Per Trip is :"  +AvgMPG);

            }
            else
            System.out.println("No data entered");



    }    
}