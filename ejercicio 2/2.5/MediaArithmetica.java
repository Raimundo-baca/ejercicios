public class MediaArithmetica {
   
   public static void main(String[] args){
      
    int[] fila = {1,2,3,4,5,6,7,8,9,10};
    int size = fila.length;
    System.out.println("La media aritmetica de los numeros de la fila es " + mediaAritmetica(fila , size-1)/size);

   } 

    public static double mediaAritmetica(int[] fila, int i){
        
         if(i == 0){
              return fila[0];
         }else{
              return fila[i] + mediaAritmetica(fila, i-1) ;

        }

    }
}