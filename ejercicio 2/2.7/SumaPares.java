import java.util.Scanner;

public class SumaPares {
   
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
        long num;
        System.out.println("Introduce un numero");
        num= sc.nextInt();
        
        if (num < 2){
            System.out.println("El numero debe ser mayor o igual que 2");
        }else{
        System.out.println("La suma de los numeros pares de 0 hasta " + num + " es " + sumaPares(num));
        sc.close();
        }
    }
    

    public static long sumaPares(long num){
        if (num == 2){ 
            return 2;

         } else if(num%2 != 0){
            return sumaPares(num-1);
         }else{
            return num + sumaPares(num-1);
         }
    }
}
