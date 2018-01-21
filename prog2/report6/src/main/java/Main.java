import java.util.Scanner;

public class Main extends Iroha {
    public static void main(String[] args) {
        String botname = "いろは";

        System.out.println(botname + ": せんぱーい、やばいですやばいですぅ");
        String input;
        Scanner in = new Scanner(System.in);

        int x = 0;
        while (true) {
            ++x;

            System.out.println("[入力待ち]");
            input = in.nextLine();

            kaiwa(input, botname);

            if (input.equals("じゃあな")) {
                break;
            }
        }

        System.out.println("今日は" + x + "ポイント稼げたみたいですねー、せーんぱい♪");
    }
}
