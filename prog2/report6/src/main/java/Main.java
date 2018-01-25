import java.util.Scanner;

public class Main extends Iroha {
    public static void main(String[] args) {
        String botname = "いろは";
        //登場人物

        System.out.println(botname + ": せんぱーい、やばいですやばいですぅ");
        String input;
        Scanner in = new Scanner(System.in);

        int x = 0;
        while (true) {
            ++x;

            System.out.println("[入力待ち]");
            input = in.nextLine();
            //入力受け取り

            kaiwa(input, botname);

            if (input.equals("じゃあな")) {
                break;
                //会話終了
            }
        }

        System.out.println("今日は" + x + "ポイント稼げたみたいですねー、せーんぱい♪");
    }
}
