/**
 * Created by dperera on 3/03/16.
 */
public interface DemoInterface<T1, T2> {
    T2 doSomeOperation(T1 t);
    T1 doReverseOperation(T2 t);
}
