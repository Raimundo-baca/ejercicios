import java.util.ArrayList;
import java.util.Scanner;

public class ListaParN {
    
    public static void main(String[] args){

        int [] lista = {1,2,3,4,5,6,7,8,9,10};
        int num;
        int size = lista.length;
        ArrayList pares = new ArrayList();
        
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce un numero superior o igual a 2");
    num = sc.nextInt();
    sc.close();

    System.out.println("los numeros pares hasta " + num + " en la lista de numeros son " + listaParN(lista, size-1, pares, num));
    }

    public static ArrayList listaParN(int[] lista, int i, ArrayList pares, int num){
        if (i == 0){
            if(lista[i] % 2 == 0 && lista[i] <= num){
                pares.add(lista[i]);
                return pares;
            }
            return pares;
        }else{
            if(lista[i] % 2 == 0 && lista[i] <= num){
                pares.add(lista[i]);
                return listaParN(lista, i-1, pares, num);
            }else{
                return listaParN(lista, i-1, pares, num);
            }
        }
    }

}

