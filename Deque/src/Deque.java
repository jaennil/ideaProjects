public class Deque<T> {
    private final static int DEFSIZE = 16;
    private Object[] array;
    private int size, head, tail;
    public Deque(int capacity) {
        array = new Object[capacity];
        clear();
    }
    public Deque(){
        this(DEFSIZE);
    }
    // Пуст ли дек?
    boolean empty() {
        return size == 0;
    }
    // Сделать дек пустым.
    void clear() {
        size = 0;
        head = tail = 0;
    }
    // Добавить число в начало дека.
    void pushFront(int val) {

    }
    // Добавить число в конец дека.
    void pushBack(int val) {

    }
    // Удалить первый элемент дека.
    int popFront() throws Exception {

    }
    // Удалить последний элемент дека.
    int popBack() throws Exception {

    }
    // Получить первый элемент дека (не удаляя его).
    int front() throws Exception {

    }
    // Получить последний элемент дека (не удаляя его).
    int back() throws Exception {

    }
}
