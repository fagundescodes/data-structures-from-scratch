package datastructures;

public class MyArray<T> {
  private Object[] data;
  private int size;
  private static final int CAPACITY = 10;

  public MyArray() {
    this.data = new Object[CAPACITY];
    this.size = 0;
  }

  @SuppressWarnings("unchecked")
  public T get(int index) {
    if (index >= 0 && index < size) {
      return (T) data[index];
    }
    return null;
  }

  public void push(T item) {
    data[size] = item;
    size++;
  }

  @SuppressWarnings("unchecked")
  public T pop() {
    if (size == 0) {
      throw new RuntimeException("Empty list");
    }
    T lastItem = (T) data[size - 1];
    size--;
    return lastItem;
  }

  @SuppressWarnings("unchecked")
  public T delete(int index) {
    T item = (T) data[index];
    for (int i = index; i < size - 1; i++) {
      data[i] = data[i + 1];
    }
    data[size - 1] = null;
    size--;
    return item;

  }

}
