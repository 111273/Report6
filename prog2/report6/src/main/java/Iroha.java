public class Iroha extends Auto {

    public static void kaiwa(String input ,String botname) {
        Auto auto = new Auto();


        if (input.equals("まかせろ")) {
            System.out.println(botname + ":わぁー頼れるぅー、そういうことなら次もお願いしますね♪");
        } else if (input.equals("しりあい")) {
            //複数の解答パターン持ち
            int num0 = (int)(Math.random()*2);
            switch(num0) {
                case 0:
                    System.out.println(botname + ":先輩、お知り合いいたんですか？");
                    break;
                case 1:
                    System.out.println(botname + ":先輩の知り合いって......変な人多いですよね");
                    break;
            }
        } else if (input.equals("がんばれ")){
            System.out.println(botname+":いきなり人任せですか......。先輩が考えてくれると思ってたんですけど......");
        } else if (input.equals("かだい")) {
            System.out.println(botname + ":せんぱーい、これ私がやらないといけないんですかね〜");
        } else if (input.equals("たんじょうび")) {
            System.out.println(botname + ":雪ノ下先輩、１月三日がお誕生日だったんですねー。ちなみに私は４月１６日ですよ、先輩");
        } else if (input.equals("じゃあな")) {
            System.out.println(botname + ":もう行っちゃうんですかー？");
        } else if (input.equals("コマンド")) {
            System.out.println("コマンド一覧\n" + "まかせろ\n" + "しりあい\n" + "がんばれ\n" + "かだい\n" + "たんじょうび\n" + "じゃあな");
        }else if (input.equals(auto())){
            System.out.println(botname + "先輩？");
        }else{
            int num = (int)(Math.random()*3);
            //不特定の単語に対してランダムに返答
            switch(num){
                case 0:
                    System.out.println(botname + ":は？な、なんですか口説いてるんですかごめんなさい無理です。好きな人がいるので");
                    break;
                case 1:
                    System.out.println(botname + ":なんですか傷心に付け込んで口説いてるんですかごめんなさいまだちょっと無理です");
                    break;
                case 2:
                    System.out.println(botname +":ちょ、なんですかその手。ポイント稼ぎですか？うわぁ・・・");
                    break;
                    }
        }
    }
}
