import java.util.Scanner;

public class Calculadora {
	
	private static float resultado=0;
	
	
	
	public static void main(String[] args) {
		gestorMenu();	
	}
	
	
	
	public static void gestorMenu() {
		
		Scanner entrada = new Scanner (System.in);
		int repetir=0;	int i=0;
		do {
			
			int opcion = menu();
			
			do {
	
				i++;
				System.out.print("\n NUMERO : ");	float n = entrada.nextFloat();
			
				switch(opcion) {
			
				case 1: suma(n);
				
					break;
			
				case 2: resta(n);
			
					break;
				
				case 3: multiplicacion(n);
			
					break;
			
				case 4: division(n);
			
					break;
				
				default: repetir = 1;
			
				}
			
			}while(i<2);
			
			System.out.print("\n EL RESULTADO ES: " +resultado);
			
		}while(continuar().equals("s")|| repetir == 1);	
		
		
		System.out.println("\n\n HASTA LUEGO !! \n\n");
		entrada.close();
		
	
	}
	
	
	
	
	
	
	public static int menu () {
		
		int opcion=0;
		
		System.out.println("\n------------------OPERACIÓN-------------------------");
		
		Scanner entrada = new Scanner (System.in);
		
		do {
			
			System.out.println("\n 1. SUMA"
					+ "\n 2. RESTA"
					+ "\n 3. MULTIPLICACIÓN"
					+ "\n 4. DIVISIÓN");
			
			System.out.print("\n OPCIÓN: ");
			opcion=entrada.nextInt();
			
			
		}while (opcion<1 || opcion>4);
		
		return opcion;
	}
	
	
	
	
	
	
	
	public static void suma (float n) {
		
		resultado = resultado + n;
	}
	
	
	
	
	public static void resta (float n) {
		
		resultado = resultado - n;
	}
	
	
	
	
	public static void multiplicacion (float n) {
		
		resultado = resultado * n;
	}
	
	
	
	
	public static void division (float n) {
		
		resultado = resultado / n;
	}
	
	
	
	
	
// METODO PARA PREGUNTAR SI SE DESEA CONTINUAR LA EJECUCUCION DEL PROGRAMA.	
	
	public static String continuar(){
		
		Scanner entrada = new Scanner (System.in);
		String opcion=null;
		
		System.out.println("\n\n-----------------------------------------------");
		System.out.print("DESEA REALIZAR ALGUNA OPERACIÓN MAS? (S/N): ");
		opcion = entrada.nextLine();
		System.out.println("-----------------------------------------------");
		
		opcion = opcion.toLowerCase();
		
		return opcion;
	}
}
