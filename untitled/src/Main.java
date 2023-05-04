import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        while (true) {
            check();
        }
    }

    private static void check() throws Exception{
        char[] openBrackets = {'[','{','('};
        char[] closeBrackets = {']','}',')'};
        Scanner scanner = new Scanner(System.in);
        Stack stack = new Stack();
        System.out.print("Enter line: ");
        String line = scanner.nextLine();
        for (int i = 0; i < line.length(); i++) {
            char chr = line.charAt(i);
            if (contains(openBrackets, chr)) {
                stack.push(chr);
            } else if (contains(closeBrackets, chr)) {
                if (!stack.empty()) {
                    char top = stack.top();
                    if (index(closeBrackets, chr) == index(openBrackets, top)) {
                        stack.pop();
                    } else {
                        System.out.println("Wrong sequence");
                        return;
                    }
                }
                else {
                    System.out.println("Wrong sequence");
                    return;
                }
            }
        }
        if (stack.empty()) {
            System.out.println("Right sequence");
        } else {
            System.out.println("Wrong sequence");
        }
    }

    private static boolean contains(char[] array, char elem) {
        for (char c : array) {
            if (c == elem) {
                return true;
            }
        }
        return false;
    }

    private static int index(char[] array, char elem) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elem) {
                return i;
            }
        }
        return -1;
    }
}