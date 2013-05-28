/**
 * 
 */
package colecoes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Fernando
 * 
 */
public class MainColecoes {

    /**
     * @param args
     */
    public static void main(String[] args) {

        List<String> frutas = new ArrayList<>();

        frutas.add("BANANA");
        frutas.add("MAÇÃ");
        frutas.add("UVA");
        frutas.add("PERA");
        frutas.add("AÇAÍ");

        System.out.println(frutas);

        Collections.sort(frutas);
        System.out.println(frutas);

        System.out.println(Collections.binarySearch(frutas, "PERA"));

        Collections.reverse(frutas);
        System.out.println(frutas);

        Collections.shuffle(frutas);
        System.out.println(frutas);

        Collections.addAll(frutas, "QUIUI", "QUIUI");
        System.out.println(frutas);
        System.out.println(Collections.frequency(frutas, "QUIUI"));

        List<String> asList = Arrays.asList("AÇAÍ", "PERA");
        System.out.println(Collections.disjoint(frutas, asList));

    }

}
