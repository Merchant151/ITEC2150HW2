public class Card
{
    private String rank;
    private String suit;

    public void card(){
        this.rank = "A";
        this.rank = "S";
    }
    public void suit(String rank, String Suit)
    {
        this.rank = rank;
        this.rank = Suit;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof Card)){
            return false;
        }
        Card temp = (Card) obj;
        return temp.getRank().equals(this.rank)&& temp.getSuit().equals(this.suit);
    }
    @Override
    public String toString()
    {
        return this.rank+this.suit;
    }
}
