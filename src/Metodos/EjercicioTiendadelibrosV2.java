package Metodos;
import java.util.Scanner;
public class EjercicioTiendadelibrosV2 {
	static void myMethod0() {
		Scanner teclado = new Scanner(System .in);
		String[] objlib= new String[50];
		int menu,salir=0,nuevoP = 0;
		boolean encontrado;
		String opcion,si,no,librob,nuevoN;
		si = "Si";
		no = "No";
		objlib [0] = "Cuaderno";
	    objlib [1] = "Bolígrafo";
	    objlib [2] = "Lapiz";
	    objlib [3] = "goma";
	    objlib [4] = "Estuche";
	    int[] prec= new int[50];
	    prec [0] = 5;
		prec [1] = 3;
		prec [2] = 2;
		prec [3] = 1;
		prec [4] = 7;
	  }
	static void myMethod2(String []objlib) {
		Scanner teclado = new Scanner(System .in);
		String opcion,si,no,librob,nuevoN;
		int menu,salir=0,nuevoP = 0, k=0;
	for (int i=0;i<objlib.length;i++) {
    	System.out.println(objlib[i] + "");
    	}
  do {
    	System.out.println("¿Quieres continuar en el programa? SI / NO");
    	opcion=teclado.next();
    	if (opcion.equalsIgnoreCase(si)) {
    	} if (opcion.equalsIgnoreCase(no)) {
    		
    		System.out.println("Adios");
    		salir ++;
    	
    	}
	
	static void myMethod7() {
	    System.out.println("¡Adios!");
	  }
	static void myMethod1(String []objlib) {
		Scanner teclado = new Scanner(System .in);
		String opcion,si,no,librob,nuevoN;
		si = "Si";
		no = "No";
		int menu,salir=0,nuevoP = 0, k=0;
		int[] prec= new int[50];
        do {

            if ((objlib[49]) != null) {
               System.out.println("Tienes muchos libros en la tienda, elimina un artículo.");
               do {
                   System.out.println("¿Quieres continuar en el programa? SI / NO");
                   opcion=teclado.next();
                   if (opcion.equalsIgnoreCase(si)) {
                   } if (opcion.equalsIgnoreCase(no)) {

                       System.out.println("Adios");
                       salir ++;
                   }
                   } while (!opcion.equalsIgnoreCase(si) && !opcion.equalsIgnoreCase(no));
            }
               if ((objlib[k]) == null) {
                      System.out.println("¿Cuál es el nombre del artículo?");
                      nuevoN=teclado.next();
                      objlib [k] = nuevoN;
                      System.out.println("¿Cuál es el precio?");
                      nuevoP=teclado.nextInt();
                      prec [k] = nuevoP;
                      System.out.println("El precio del nuevo artículo llamado " + objlib[k] + " es " + prec[k] + " euros");
                      k = 50;
                   }

                k++;
                } while (k <objlib.length);
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System .in);
		String[] objlib= new String[50];
		int menu,salir=0,nuevoP = 0;
		boolean encontrado;
		String opcion,si,no,librob,nuevoN;
		objlib [0] = "Cuaderno";
	    objlib [1] = "Bolígrafo";
	    objlib [2] = "Lapiz";
	    objlib [3] = "goma";
	    objlib [4] = "Estuche";
	    
	    int[] prec= new int[50];
	    prec [0] = 5;
		prec [1] = 3;
		prec [2] = 2;
		prec [3] = 1;
		prec [4] = 7;
		do {
			System.out.println("--------Menu-------");
			System.out.println("1.Añadir artículos y precios");
			System.out.println("2.Mostrar productos de la tienda");
			System.out.println("3.Obtener el precio de un producto");
			System.out.println("4.Obtener el IVA de un producto");
			System.out.println("5.Modificar el precio de un producto");
			System.out.println("6.Eliminar un producto");
			System.out.println("7.Salir");	
			menu=teclado.nextInt();
			switch(menu) {
			case 1:
				myMethod1(objlib);
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
									
				break;
			case 5:
				
				break;
			case 6:
				
				break;
			case 7:
				myMethod7();
			default:
				System.out.println("¡¡ERROR!! Elija una opcion del menu.");
				break;
		}
	}while(menu!=1);
	teclado.close();
}

}