package Metodos;
import java.util.Scanner;
public class ejerciciometodos {
	static void myMethod0() {
		
		int[] a= new int[10];
		int menu;
		double sum;
		for(int i=0;i<a.length;i++) {
			a[i]=(int)(Math.random() * 101);}
	}
	static void myMethod() {
	    System.out.println("¡Adios!");
	  }
	static void myMethod2(int[] a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
	}
	static void myMethod3(int[] a) { 
		int sum=0;
		for(int i=0;i<a.length;i++) {
			if (a[i]>sum) {
				sum=a[i];
			}
		}
		System.out.println(sum);
	}
	static void myMethod4(int[] a) {
		int sum=0;
		sum=a[0];
		for(int i=0;i<a.length;i++) {
			if (a[i]<sum) {
				sum=a[i];
			}
		}
		System.out.println(sum);
	}static void myMethod5(int[] a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println(sum/a.length);
	
	}static void myMethod6(int[] a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			a[i]=(int)(Math.random() * 101);
		}
		System.out.println("Los numeros han sido reasignados.");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System .in);
		int[] a= new int[10];
		int menu;
		double sum;
		for(int i=0;i<a.length;i++) {
			a[i]=(int)(Math.random() * 101);
		}
		do {
			System.out.println("--------Menu-------");
			System.out.println("1.Salir");
			System.out.println("2.Mostrar la suma");
			System.out.println("3.Mostrar el maximo");
			System.out.println("4.Mostrar el minimo");
			System.out.println("5.Mostrar la media");
			System.out.println("6.Rellenarlo de nuevo con números (formatear)");	
			menu=teclado.nextInt();
			sum=0;
			switch(menu) {
				case 1:
					myMethod();
					break;
				case 2:
					myMethod2(a);
					break;
				case 3:
					myMethod3(a);
					break;
				case 4:
					myMethod4(a);					
					break;
				case 5:
					myMethod5(a);
					break;
				case 6:
					myMethod6(a);
					break;
				default:
					System.out.println("¡¡ERROR!! Elija una opcion del menu.");
					break;
			}
		}while(menu!=1);
		teclado.close();
	}

}