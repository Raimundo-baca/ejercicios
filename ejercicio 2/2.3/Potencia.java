import java.util.Scanner;

public class Potencia {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long num;
        long exponente;
        do {
            System.out.println("Introduce un entero natural");
            num = sc.nextInt(); 
            System.out.println("Introduce su exponente");
            exponente = sc.nextInt();
        }while (num < 0 && exponente < 0);

            System.out.println(num + " elevado a " + exponente + " es " + PotenciaN(num,exponente));
        sc.close();
}

    public static long PotenciaN(long n, long e){
        if (e==0){
            return 1;
        }else if (e==1){
            return n;
        
        }else{
            return n * PotenciaN(n,e-1);
        }
    
    }

}
