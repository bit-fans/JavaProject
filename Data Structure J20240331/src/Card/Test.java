package Card;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        CardGame cardGame=new CardGame();
        List<Card> ret=cardGame.make();
        System.out.println(ret);

        System.out.println("洗牌：");
        cardGame.shuffle(ret);
        System.out.println(ret);

        System.out.println("揭牌：");
        List<List<Card>> hand = cardGame.getCard(ret);
        for (int i = 0; i < hand.size(); i++) {
            System.out.println("第 "+(i+1)+" 个人的牌："+hand.get(i));
        }

        System.out.println("剩下的牌：");
        System.out.println(ret);


    }
}
