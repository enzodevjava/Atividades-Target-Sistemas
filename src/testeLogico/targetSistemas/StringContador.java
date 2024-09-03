package testeLogico.targetSistemas;

import java.util.Scanner;

public class StringContador {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();

        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == 'a' || c == 'A') {
                count++;
            }
        }

        System.out.println("A letra a/A aparece " + count + " vez na string.");

        scanner.close();
    }
}