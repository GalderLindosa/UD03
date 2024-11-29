package ejerciciosArrays;
import java.util.Scanner;
public class TiendaDeLibros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String[]a = new String [20];
		int[]b = new int [20];
		String salir, libro;
		int menu;
		boolean enc=false;
		a[0]="Nada";
		a[1]="Tímidamente de la oscuridad a la luz";
		a[2]="Pajaros a golpes";
		a[3]="Caperucita Roja";
		a[4]="12 cuentos clasicos";
		a[5]="Pepe y Mila";
		a[6]="Enojaos";
		a[7]="En casa vacia";
		a[8]="123";
		a[9]="Dia Negro";
		a[10]="El Hobbit";
		a[11]="Calle Judia";
		b[0]=15;
		b[1]=12;
		b[2]=15;
		b[3]=25;
		b[4]=19;
		b[5]=17;
		b[6]=25;
		b[7]=13;
		b[8]=11;
		b[9]=18;
		b[10]=28;
		b[11]=35;
		System.out.println("1.- Mostrar el título de todos los libros.\r\n"
				+ "2.- Mostrar el título y el precio de todos los libros.\r\n"
				+ "3.- Mostrar el precio de un libro.\r\n"
				+ "4- Introducir un nuevo libro.\r\n"
				+ "5.- Eliminar un libro.\r\n"
				+ "6.- Modificar el precio de un libro.\r\n"
				+ "7.- Modificar el título de un libro.\r\n"
				+ "8.- Salir del programa");
		menu = teclado.nextInt();
		switch (menu) {
			case 1:
				for (int i = 0; i<=a.length-1;i++) {
					if (a[i]!=null) { 
						System.out.println(a[i]);
					}
					
				}
				break;
			case 2:
				for (int i = 0; i<a.length;i++) {
					if (a[i]!=null) { 
						System.out.println("El precio del libro "+a[i]+" es "+b[i]+"€");
					}
				}
				break;
			case 3:
				System.out.println("¿Cual es el titulo del libro?");
				libro = teclado.nextLine();
				teclado.nextLine();
				for (int i = 0; i<a.length && !enc; i++) {
					if (libro.equalsIgnoreCase(a[i])) {
						enc=true;
					}
					if (enc) {
						System.out.println("El precio del libro "+a[i]+" es "+b[i]+"€" );
					}
					
				}
				if (!enc) {
					System.out.println("No tenemos ese libro");
				}
				
				break;
			case 4:
				break;
			case 5:
				break;
			case 6: 
				break;
			case 7: 
				break;
			case 8: 
				System.out.println("Hasta la proxima!");
				break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		teclado.close();
		
	}

}
