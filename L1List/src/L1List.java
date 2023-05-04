public class L1List<T>{
    private Node<T> first, last; //Ссылки на первый и последний узлы.
    private int size;
    public L1List(){
        first = last = null;
        size = 0;
    }
    //Добавить элемент в конец списка.
    public void append(Node<T> node){
        node.next = null;
        if(first == null) //Первый элемент.
            first = node;
        if(last != null)
            last.next = node;
        last = node;
        size++;
    }
    public int find(Node<T> node) {
        Node<T> current = first;
        for (int i = 0; i < size; i++) {
            if (current == node) {
                return i;
            }
            current = current.next;
        }
        return -1;
    }

    public Node<T> find(int index) {
        Node<T> current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    public void insert(Node<T> node, int location) {
        if (location > size) {
            System.out.println("Insert location is bigger than list size");
            return;
        } else if (location < 0) {
            System.out.println("Location must be positive number or zero");
            return;
        }
        Node<T> current = first;
        if (location == 0) {
            node.next = first;
            first = node;
        } else {
            for (int i = 0; i < location - 1; i++) {
                current = current.next;
            }
            node.next = current.next;
            current.next = node;
        }
        recalculateLast();
        size++;
    }

    public void remove(int location) {
        if (location >= size) {
            System.out.println("Remove location is bigger than list size");
            return;
        }
        if (location < 0) {
            System.out.println("Location must be positive number or zero");
            return;
        }
        if (location == 0) {
            first = first.next;
            size--;
            return;
        }
        Node<T> current = first;
        for (int i = 0; i < location - 1; i++) {
            current = current.next;
        }
        current.next = current.next.next;
        size--;
    }

    public void print() {
        Node<T> current = first;
        for (int i = 0; i < size; i++) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }

    public int getSize() {
        return size;
    }

    public Node<T> getFirst() {
        return first;
    }

    public Node<T> getLast() {
        return last;
    }

    public void recalculateLast() {
        Node<T> current = first;
        while (current.next != null) {
            current = current.next;
        }
        last = current;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
