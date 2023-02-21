public class Desviacion {
    
        public static void main(String[] args){

                double[] fila = {1,2,3,4,5,6,7,8,9,10};
                
              System.out.println("La desviacion tipica de los numeros de la fila es " + desviacion(fila));

                ;

        }

        
        public static double mediaAritmetica(double[] fila, int i){
                if(i == 0){
                        return fila[0];
                }else{
                        return fila[i] + mediaAritmetica(fila, i-1); 

                }
        }
        public static double sumaCuadrados(double[] fila, int i){
            
                if(i == 0){
                        return fila[0];
                    }else{
                        return fila[i]*fila[i] + sumaCuadrados(fila, i-1);
                }
        }

        public static double varianza(double[] fila){
        
        double sumaCuadrados = sumaCuadrados(fila, fila.length-1);
        double media = mediaAritmetica(fila, fila.length-1)/fila.length; 
                
        return sumaCuadrados / fila.length - media*media;

        }

        public static double desviacion(double[] fila){
           
                double varianza= varianza(fila);
                return Math.sqrt(varianza);

        }
}
