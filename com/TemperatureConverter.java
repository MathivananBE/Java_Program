package com;

public class TemperatureConverter {

	
	public static double CelsiusToFahrenheit(double a) {
		return (a*9/5)+32;
	}
	
	public static double FahrenheitToCelsius(double a) {
		return (a-32)*5/9;
	}

	public static void main(String[] args) {
		double c=37;
		double f=98.6;
		
		System.out.println(CelsiusToFahrenheit(c));
		
		System.out.println(FahrenheitToCelsius(f));
	
	}
}
