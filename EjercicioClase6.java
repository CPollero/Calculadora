import java.util.Scanner;
public class EjercicioClase6 {
    public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String saborhelado; // Declararlo
		
		System.out.println("Cual es tu sabor de helado favorito?");
		
		saborhelado = scan.nextLine();
		
		System.out.println("tu sbaor elegido fue: " + saborhelado);
    }
}