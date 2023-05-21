import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入多行文本，结束请输入一个空行：");

        StringBuilder input = new StringBuilder();
        String line;
        do {
            line = scanner.nextLine();
            input.append(line).append("\n");
        } while (!line.isEmpty());

        String output = insert(input.toString());

        System.out.println("处理结果如下：");
        System.out.println(output);
    }

    public static String insert(String input) {
        StringBuilder output = new StringBuilder();
        int i = 0;
        for (String line : input.split("\n")) {
            output.append("abc").append(i).append(":").append("\n").append(line).append("\n");
            i++;
        }
        return output.toString().replaceAll("jump ","jump "+"abc");
    }
}
