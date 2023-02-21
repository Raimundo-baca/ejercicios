
    public class SumaFila {
    
        public static void main(String[] args){
          
        int[] fila = {1,2,3,4,5,6,7,8,9,10};         
        int size = fila.length;
        System.out.println("La suma de los numeros de la fila es " + sumaFila(fila , size-1));
        
        }


        public static int sumaFila(int[] fila, int i){
           
            if(i == 0){
                return fila[0];
            }else{
                return fila[i] + sumaFila(fila, i-1);
        }
    }
}
