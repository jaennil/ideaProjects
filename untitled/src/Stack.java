class Stack{
    private static final int DEFSIZE = 16;
    private char[] array;
    private int head;

    public Stack(int capacity) {
        array = new char[capacity];
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
    public void push(char val) throws Exception {
        array[head++] = val;
    }

    //Удалить элемент с вершины стека.
    public char pop() throws Exception {
        return array[--head];
    }

    //Получить вершину стека.
    public char top() throws Exception {
        return array[head - 1];
    }

    public int size() {
        return head;
    }
