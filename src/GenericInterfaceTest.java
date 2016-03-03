/**
 * Created by dperera on 3/03/16.
 */
public class GenericInterfaceTest implements DemoInterface<String, Integer> {

    @Override
    public Integer doSomeOperation(String t) {
        return null;
    }

    @Override
    public String doReverseOperation(Integer t) {
        return null;
    }
}
