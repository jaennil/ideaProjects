class Stack<T>{
    private static final int DEFSIZE = 16;
    private Object[] array;
    private int head;
    public Stack(int capacity) {
        array = new Object[capacity];
        head = 0;
    }
    public Stack() {
        this(DEFSIZE);
    }
    //Пуст ли стек?
    public boolean empty() {
        return head == 0;
    }
    //Сделать стек пустым.
    public void clear() {
        head = 0;
    }
    //Добавить элемент на вершину стека.
    public void push(T val) throws Exception {
        array[head++] = val;
    }
    //Удалить элемент с вершины стека.
    public T pop() throws Exception {
        return (T)array[--head];
    }
    //Получить вершину стека.
    public T top() throws Exception {
        return (T)array[head - 1];
    }
}