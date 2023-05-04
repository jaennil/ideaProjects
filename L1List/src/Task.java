import java.util.Objects;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        L1List<String> list = new L1List<>();
        String line = "";
        while (Objects.equals(line = scanner.nextLine(), "quit") == false) {
            String[] lineSplit = line.split(" ");
            if (lineSplit.length == 1) { // alt+tab case
                String[] split = lineSplit[0].split("\\+");
                if (Objects.equals(split[0], "Alt")) {
                    if (list.getSize() == 0) {
                        System.out.println("There are no opened programs");
                        continue;
                    }
                    if (Objects.equals(split[1], "Delete")) {
                        list.remove(0);
                    } else if (Objects.equals(split[1], "Tab")) {
                        int tab_amount = split.length-1;
                        int positionInList = tab_amount%list.getSize();
                        Node<String> chose = list.find(positionInList);
                        list.remove(positionInList);
                        list.insert(chose, 0);
                    } else {
                        System.out.println("Wrong command");
                        continue;
                    }
                } else {
                    System.out.println("Wrong command");
                    continue;
                }
            } else {
                if (Objects.equals(lineSplit[0], "Run")) {
                    String program = "";
                    for (String string : slice(lineSplit, 1, lineSplit.length)) {
                        program += string + " ";
                    }
                    list.insert(new Node<>(program), 0);
                } else {
                    System.out.println("Wrong command");
                    continue;
                }
            }
            if (list.isEmpty()) {
                System.out.println("Currently there are no opened apps");
            }
            else {
                System.out.println(list.getFirst().value);
            }
        }
    }

    public static String[] slice(String[] array, int start, int end) {
        String[] result = new String[end-start];
        System.arraycopy(array, start, result, 0, result.length);
        return result;
    }

    public static void print(String[] array) {
        for (String string : array) {
            System.out.print(string + " ");
        }
        System.out.println();
    }
}
