public class HeapSort{
    
    private int Index;//Contador de iteraciones
	
	public HeapSort(){
		this.Index = 0;
	}
    
    // Ordenacion por monticulos - HeapSort
    public void ordenacionMonticulos(int[] v) {
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
 
    private void hacerMonticulo(int[] v, int nodo, int fin) {
		        
        int izq = 2 * nodo + 1;
        int der = izq+1;
        int may;
        
        this.Index++;//Contador
        
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
	
	public int getIndex(){
		return this.Index;
	}
    
    public void restartIndex(){this.Index = 0;}
}
