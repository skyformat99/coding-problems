package liugh.test_JavaDesignMode.行为模式.迭代器模式.iterator;

/**
 * 迭代器接口
 * 
 * @author liu yuning
 *
 * @param <T>
 */
public interface Iterator<T> {

    public T first();

    public T next();

    public boolean isDone();

    public T currentItem();

}
