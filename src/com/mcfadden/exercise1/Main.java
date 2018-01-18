package com.mcfadden.exercise1;
//Ean McFadden
//January 18, 2018
//Exercise 1
public class Main {

    public static void main(String[] args) {
        String cityName;
        cityName = "Columbus";

        int zipCode;
        zipCode = 43215;

        int [] highTemps = {32, 25, 27, 40, 45};
        float averageTemp = (highTemps[0] + highTemps[1] + highTemps[2] + highTemps[3] + highTemps[4]) / 5;

        System.out.println("City: " + cityName);
        System.out.println("Zip Code: " + zipCode);
        System.out.println("Average High Temperature: " + averageTemp + " degrees");

	// write your code here
    }
}
