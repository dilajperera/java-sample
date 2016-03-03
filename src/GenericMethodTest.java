import java.util.ArrayList;
import java.util.List;

/**
 * Created by dperera on 3/03/16.
 */
public class GenericMethodTest {

    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        GenericMethodTest.countAllOccurrences(list,1);
    }

    /**
     * Generic methods are much similar to generic classes. They are different only in one aspect that scope of type
     * information is inside method (or constructor) only. Generic methods are methods that introduce their own
     * type parameters.
     * @param list
     * @param item
     * @param <T>
     * @return
     */
    public static <T> int countAllOccurrences(List<T> list, T item) {
        int count = 0;
        if (item == null) {
            for ( T listItem : list )
                if (listItem == null)
                    count++;
        }
        else {
            for ( T listItem : list )
                if (item.equals(listItem))
                    count++;
        }
        return count;
    }

}
