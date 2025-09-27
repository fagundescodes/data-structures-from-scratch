package datastructures;

public class MyArray<T> {
  private Object[] data;
  private int size;
  private static final int CAPACITY = 10;

  public MyArray() {
    this.data = new Object[CAPACITY];
    this.size = 0;
  }

  public T get(int index) {
    return (T) data[index];
  }

  public void push(T item) {
    data[size] = item;
    size++;
  }

}
