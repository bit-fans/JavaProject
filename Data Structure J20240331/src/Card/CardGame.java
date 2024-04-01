package Card;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;



public class CardGame {
    public String[] cardSuit={"♥","♣","♦","♠"};//具体花色

   //创造牌
    public List<Card> make(){
        List<Card> cardList=new ArrayList<Card>();
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 13; j++) {
                Card card=new Card(cardSuit[i],j);
                cardList.add(card);

            }
        }
        return cardList;
    }

    //洗牌
    public void shuffle(List<Card> cardList) {
        Random random = new Random();
        for (int i = cardList.size() - 1; i > 0; i++) {
            int index = random.nextInt(i);
            swap(cardList, i, index);
        }
    }

        public static void swap(List<Card> cardList,int i,int j){
            Card tmp=cardList.get(i);
            cardList.set(i,cardList.get(j));
            cardList.set(j,tmp);
        }


        //发牌
        public List<List<Card>> getCard(List<Card> cardList){

            List<List<Card>> hand = new ArrayList<>();
            List<Card> hand1=new ArrayList<>();
            List<Card> hand2=new ArrayList<>();
            List<Card> hand3=new ArrayList<>();

            hand.add(hand1);
            hand.add(hand2);
            hand.add(hand3);

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 3; j++) {
                    Card card=cardList.remove(0);
                    hand.get(j).add(card);
                }

            }
            return hand;
        }
    }


