/**
 * 
 */
package arquivos;

import java.util.Scanner;

/**
 * @author Fernando
 * 
 */
public class ClasseScan {

    /**
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("Digite alguma coisa");

        Scanner scanner = new Scanner(System.in);

        String texto = scanner.nextLine();

        System.out.println(texto);

    }

}
