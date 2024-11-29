package ejerciciosArrays;
import java.util.Scanner;

public class AriketaArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System .in);
		String[]a= {"Juan", "Ekain", "Iker", "Alex", "Izaro"};
		int menu,cant=0;
		String nombre;
		boolean enc = false;
		System.out.println("Elige una opcion");
		System.out.println("1.Salir");
		System.out.println("2.Mostrar Lista");
		System.out.println("3.Pedir un nombre y contar las veces que aparece");
		System.out.println("4.Pedir un nombre y ver si existe");
		System.out.println("5.Eliminar.Pedir un nombre y en el lugar de ese nombre introducir “null”.");
		menu = teclado.nextInt();
		switch (menu) {
			case 1: 
				System.out.println("Hasta la vista!");
				break;
			case 2:
				for (int i = 0; i<=a.length-1;i++) {
					System.out.println(a[i]);
				}
				break;
			case 3:
				System.out.println("Escribe un nombre:");
				nombre = teclado.next();
				for (int i=0; i<a.length;i++) {
					if (nombre.equalsIgnoreCase(a[i])) {
						cant++;
					}
				}
				System.out.println("Ese nombre esta " +cant +" veces" );

				break;
			case 4:
				System.out.println("Escribe el nombre a comprobar:");
				nombre = teclado.next();
				for (int i = 0; i<a.length && !enc; i++) {
					if (nombre.equals(a[i])) {
						enc=true;
					}
				}
				if (enc) {
					System.out.println("El nombre existe");
				}
				else {
					System.out.println("El nombre no existe");
				}
					
				break;
			case 5:
				System.out.println("Escribe el nombre a eliminar:");
				nombre = teclado.next();
				for (int i = 0; i<a.length && !enc; i++) {
					if (nombre.equals(a[i])) {
						enc=true;
						a[i]=null;
					}
				}
				if (enc) {
					System.out.println("El nombre ha sido borrado");
				}
				else {
					System.out.println("El nombre no existe");
				}
				break;
			default:
				System.out.println("ERROR! El caracter introducido no es valido");
		}
		
		
		
		teclado.close();
	}

}
