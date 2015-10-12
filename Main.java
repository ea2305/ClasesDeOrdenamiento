import java.util.Random;

public class Main{
	
	public static void main(String []argv){
		
		Random random = new Random(1654);
		HeapSort Heap = new HeapSort();
		Burbuja Bubble = new Burbuja();
		Quicksort sort = new Quicksort();
		
		int [] A = new int [1000];
		
		//Peor caso de prueba
		for(int i = 0 ; i < 1000 ; i++)
			A[i] = 1000 - i;

		System.out.println("\nPeor de los casos de pruebas:::::::::::::::");	

		Heap.ordenacionMonticulos(A);
		System.out.println("Heapsort Iteraciones : " + Heap.getIndex());
		Heap.restartIndex();
		
		Bubble.burbuja(A);
		System.out.println("Burbuja Iteraciones : " + Bubble.getIndex());
		Bubble.restartIndex();
		
		sort.sort(A);
		System.out.println("Quicksort Iteraciones : " + sort.getIndex());
		sort.restartIndex();

		//Caso aleatorio de prueba
		for(int i = 0 ; i < 1000 ; i++){
			
			int a = random.nextInt(1000);
			//int a = (int)Math.random()*1000;
			//System.out.print(", " + a);
			A[i] = a;	
		}		

		System.out.println("\nCaso Aleatorio de pruebas:::::::::::::::");	

		Heap.ordenacionMonticulos(A);
		System.out.println("Heapsort Iteraciones : " + Heap.getIndex());
		Heap.restartIndex();
		
		Bubble.burbuja(A);
		System.out.println("Burbuja Iteraciones : " + Bubble.getIndex());
		Bubble.restartIndex();
		
		sort.sort(A);
		System.out.println("Quicksort Iteraciones : " + sort.getIndex());
		sort.restartIndex();
		
		//Mejor caso de prueba
		for(int i = 0 ; i < 1000 ; i++)
			A[i] = i;

		System.out.println("\nMejor de los casos de pruebas:::::::::::::::");	

		Heap.ordenacionMonticulos(A);
		System.out.println("Heapsort Iteraciones : " + Heap.getIndex());
		Heap.restartIndex();
		
		Bubble.burbuja(A);
		System.out.println("Burbuja Iteraciones : " + Bubble.getIndex());
		Bubble.restartIndex();
		
		sort.sort(A);
		System.out.println("Quicksort Iteraciones : " + sort.getIndex());
		sort.restartIndex();
							
	}
}