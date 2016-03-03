import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GenericCollectionTest {

    public static void main(String[] args){

        /**
         * Generics add a way to specify concrete types to general purpose classes and methods that operated
         * on Object before. It sounds a bit abstract, so we will look at some examples using collections right away.
         *
         * principle 1 : type safe
         * principle 2 : type erasure - compiler removes the type of the generic
         */

        List<String> strings = new ArrayList<>();
        strings.add("a String");

        Set<String> set = new HashSet<>();
        set.add("a string");

    }

}
