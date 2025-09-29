package datastructures;

public class MyArray<T> {
  private Object[] data;
  private int size;

  public MyArray(int capacity) {
    if (capacity <= 0) {
      throw new IllegalArgumentException("Capacity not valid");
    }
    this.data = new Object[capacity];
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
    if (size == data.length) {
      throw new RuntimeException("Array is full");
    }
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
