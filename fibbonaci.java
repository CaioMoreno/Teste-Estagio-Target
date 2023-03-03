import java.util.Scanner;

public class fibbonaci {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int num = sc.nextInt();

        int ant1 = 0; 
        int ant2 = 1; 
        int fib = 0; 

        while (fib < num) {
            fib = ant1 + ant2;
            ant1 = ant2;
            ant2 = fib;
        }

        if (fib == num) {
            System.out.println(num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(num + " não pertence à sequência de Fibonacci.");
        }
        sc.close();
    }
}
