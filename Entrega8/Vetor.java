package ED.Entrega8;

public class Vetor implements IVetor {
    private int[] elements;
    private int size;
    private int capacity;

    public Vetor(int capacity) {
        this.capacity = capacity;
        this.elements = new int[capacity];
        this.size = 0;
    }

    @Override
    public void add(int number) {
        if (isFull()) {
            throw new IllegalStateException("The vector is full");
        }
        elements[size] = number;
        size++;
    }

    @Override
    public void remove(int number) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (elements[i] == number) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            for (int i = index; i < size - 1; i++) {
                elements[i] = elements[i + 1];
            }
            size--;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isFull() {
        return size == capacity;
    }

    @Override
    public boolean contains(int number) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == number) {
                return true;
            }
        }
        return false;
    }
}