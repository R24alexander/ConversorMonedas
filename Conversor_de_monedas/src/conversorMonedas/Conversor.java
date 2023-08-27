package conversorMonedas;

import java.util.Scanner;

public class Conversor {

	public static void main(String[] args) {
		
		
	}
	
	static void convertir(double valorDolar, String pais) {
		Scanner leer = new Scanner(System.in);
		System.out.printf("Ingrese la cantidad de %s :", pais);
		double cantidadMoneda = leer.nextDouble();
		
		double dolares = cantidadMoneda / valorDolar;
		
		dolares = (double) Math.round(dolares * 100d)/100;
		
		System.out.println("Tines $" + dolares + " Dolares");
	}
}
