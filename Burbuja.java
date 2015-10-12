public class Burbuja{
    
    private int Index;//Contador de iteraciones
	
	public Burbuja(){
		this.Index = 0;
	}
	
    public void burbuja(int [] A){
        int i, j, aux;
        
        for(i=0;i<A.length-1;i++)
            for(j=0;j<A.length-i-1;j++){
                
                this.Index++;//Contador
                
                if(A[j+1]<A[j]){
                    aux=A[j+1];
                    A[j+1]=A[j];
                    A[j]=aux;
                }
            }
    }
    
    public int getIndex(){
        return this.Index;
    }
    
    public void restartIndex(){this.Index = 0;}

}
