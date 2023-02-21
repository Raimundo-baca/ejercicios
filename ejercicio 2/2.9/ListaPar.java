import java.util.ArrayList;

public class ListaPar {
    public static void main(String [] args) {
        int[] lista = {1,2,3,4,5,6,7,8,9,10};
        ArrayList pares = new ArrayList();
        System.out.println("Los numeros pares de esta lista son " + listaPar(lista, 0, pares));
    }

    public static ArrayList listaPar(int[]lista, int i, ArrayList pares){
      
    if ( i== lista.length-1){
        if(lista[i] % 2 == 0){
            pares.add(lista[i]);
            return pares;
        }
        return pares;

    }else{
            if(lista[i]%2 == 0){
                pares.add(lista[i]);
                return listaPar(lista, i+1, pares);
            }else{
                return listaPar(lista, i+1, pares);
            }
    
    }

}
}