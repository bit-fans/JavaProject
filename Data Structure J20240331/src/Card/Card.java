package Card;

public class Card {
    public String suit;//花色
    public int num; //点数

    public Card(String suit, int num) {
        this.suit = suit;
        this.num = num;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit='" + suit + '\'' +
                ", num=" + num +
                '}';
    }
}
