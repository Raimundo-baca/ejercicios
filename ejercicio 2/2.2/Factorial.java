import java.util.Scanner;

public class Factorial {
    

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("Introduce un numero");
            num = sc.nextInt(); 
        }
        while (num < 0);

            System.out.println("El factorial de " + num + " es " + Facto(num));
            sc.close();
        }
    
    public static long Facto(int n){

        if(n == 0){
            return 1;
        }else {
            return n * Facto(n-1);
        }
        
    }

}
