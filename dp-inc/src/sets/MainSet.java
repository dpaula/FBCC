/**
 * 
 */
package sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Fernando
 * 
 */
public class MainSet {

    /**
     * @param args
     */
    public static void main(String[] args) {

        String[] a = { "FERNANDO", "CARLA", "JOAO", "CARLA", "FERNANDO" };

        List<String> asList = Arrays.asList(a);

        System.out.println(asList);

        Set<String> set = new HashSet<>(asList);

        System.out.println(set);

    }

}
