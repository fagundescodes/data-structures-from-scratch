package datastructures;

public class MyArrayList<T> {
  private Object[] data;
  private int size;
  private int capacity;
  private static final int DEFAULT_CAPACITY = 10;

  public MyArrayList() {
    this.capacity = DEFAULT_CAPACITY;
    this.data = new Object[capacity];
  }

  public int size() {
    return this.size;
  }

  public void set(int index, T value) {
    this.data[index] = value;
  }

  @SuppressWarnings("unchecked")
  public T get(int index) {
    return (T) this.data[index];
  }

}
