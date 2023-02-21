import java.util.Scanner;

//este programa suma los numeros de 0 a n
public class Suma {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long num;
        do {
            System.out.println("Introduce un numero");
            num = sc.nextInt(); 
        }while (num <= 0);
           System.out.println("la suma de 1 hasta " + num + " es " + Suma1N(num));
        sc.close();
    }    

    public static long Suma1N(long n){
           if(n == 1) { //caso base
              return 1;
           } else {
              return n + Suma1N(n-1);
           }
    }



}
