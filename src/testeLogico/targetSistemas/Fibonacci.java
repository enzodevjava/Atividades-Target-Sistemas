package testeLogico.targetSistemas;

import java.util.Scanner;

public class Fibonacci {

        public static boolean isFibonacci(int numero) {
            if (numero < 0) return false;

            int a = 0, b = 1;


            if (numero == a || numero == b) return true;


            while (b <= numero) {
                int next = a + b;
                a = b;
                b = next;

                if (b == numero) return true;
            }

            return false;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite um número para verificar se pertence a sequência de Fibonacci: ");
            int numero = scanner.nextInt();

            if (isFibonacci(numero)) {
                System.out.println(numero + " Pertence à sequência de Fibonacci. :)");
            } else {
                System.out.println(numero + " Não pertence à sequência de Fibonacci. :(");
            }

            scanner.close();
        }
    }

