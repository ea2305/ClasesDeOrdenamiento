public class Heapsort{
    
    static int Top = 1000;
    static int Iteracion = 0;
    //static Integer [] A = new Integer[Top];
    static int [] A = new int[Top];
    static Quicksort qs = new Quicksort();
    
    public static void main(String []argv){
        
        for(int u = 0  ; u < Top ; u++)
            A[u] = (Top - 1) - u;
            
        ordenacionMonticulos(A);
        //burbuja(A);
        //qs.sort(A);
                    
        for(int i = 0 ; i < A.length ; i++)
            System.out.print("\t, " + A[i]);
            
        System.out.println("\nRendimiento : " + Iteracion);           
        //System.out.println("\nRendimiento : " + qs.Contador);
    }
    
    public static void burbuja(int [] A){
        int i, j, aux;
        
        for(i=0;i<A.length-1;i++)
            for(j=0;j<A.length-i-1;j++){
                
                Iteracion++;
                
                if(A[j+1]<A[j]){
                    aux=A[j+1];
                    A[j+1]=A[j];
                    A[j]=aux;
                }
            }
    }
    
    // Ordenacion por monticulos - HeapSort
    public static void ordenacionMonticulos(int[] v) {
        final int N = v.length;
        
        for(int nodo = N/2; nodo>=0; nodo--) 
            hacerMonticulo(v, nodo, N-1);
            
        for(int nodo = N-1; nodo>=0; nodo--) {    
            int tmp = v[0];
            v[0]    = v[nodo];
            v[nodo] = tmp;
            hacerMonticulo(v, 0, nodo-1);
        }
    }
 
    public static void hacerMonticulo(int[] v, int nodo, int fin) {
        
        
        
        int izq = 2*nodo+1;
        int der = izq+1;
        int may;
        Iteracion++;//Contador
        if(izq>fin) return;
        
        if(der>fin) may=izq;
        else may= v[izq]>v[der]?izq:der;
        
        if(v[nodo] < v[may]) {
            int tmp = v[nodo];
            v[nodo] = v[may];
            v[may]  = tmp;
            hacerMonticulo(v, may, fin);
        }
	
    }
}
