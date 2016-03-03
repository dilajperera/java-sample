import java.util.ArrayList;
import java.util.List;

/**
 * Created by dperera on 3/03/16.
 */
public class WildCardGenericTest {

    //unbound wildcards
    List<?> list1 = new ArrayList<Long>();

    //upper bounded wildcards
    List<? extends Number> list2 = new ArrayList<Integer>();

    //lower bounded wildcards
    List<? super Integer> list3 = new ArrayList<Number>();

}
