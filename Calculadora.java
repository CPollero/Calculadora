import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int X = 8; // Variable
		int Y = 3; // Variable
		int suma = X + Y;
		int resta = X - Y;
		int mult = X * Y;
		double div = X / Y;
		int mod = X % Y;
		System.out.println("Los resultados de las operaciones aritmeticas entre 3 y 8 son: \n Suma: " + suma + " \n Resta: " + resta + " \n Multiplicacion: " + mult + "\n Division: " + div + "\n Modulo: " + mod);
    }
}