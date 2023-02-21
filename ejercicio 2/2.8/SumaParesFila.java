public class SumaParesFila {
    public static void main(String[] args) {
    
        int[] fila = {2,4,8};         
        int size = fila.length;
        System.out.println("La suma de los numeros pares de la fila es " + sumaParesFila(fila , size-1));

    }

    public static double sumaParesFila(int[] fila, int i){
      
     if(i==0){
        return fila[0];
    }else if (fila[i] % 2 == 0){ 
            return fila[i] + sumaParesFila(fila, i-1);

        } else {
            return (sumaParesFila(fila, i-1)) - 1;
       
         }
    }
}