package sample;

public class Homework2_3 {
	public static void main (String[] args) {
		double pricePerLitre = 1.2;
		int distance = 100;
		int consuption = 8;
		int finalDistance = 120;
		double fuelPrice;
		double finalFuelPrice;
		fuelPrice = consuption * pricePerLitre;
		finalFuelPrice = fuelPrice * finalDistance / distance;
		System.out.println("Для поездки в соседний город нужно заправить машину на сумму - " + finalFuelPrice + " $");
	}
}
