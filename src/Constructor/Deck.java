package Constructor;

public class Deck {
    private int numberOfCards;
    private int averageElixir;
    private String letterQuality;
    private int letterLevel;

    public Deck(int numberOfCards, int averageElixir, String letterQuality, int letterLevel) {
        this.numberOfCards = numberOfCards;
        this.averageElixir = averageElixir;
        this.letterQuality = letterQuality;
        this.letterLevel = letterLevel;
    }

    public int getNumberOfCards() {
        return numberOfCards;
    }

    public void setNumberOfCards(int numberOfCards) {
        this.numberOfCards = numberOfCards;
    }

    public int getAverageElixir() {
        return averageElixir;
    }

    public void setAverageElixir(int averageElixir) {
        this.averageElixir = averageElixir;
    }

    public String getLetterQuality() {
        return letterQuality;
    }

    public void setLetterQuality(String letterQuality) {
        this.letterQuality = letterQuality;
    }

    public int getLetterLevel() {
        return letterLevel;
    }

    public void setLetterLevel(int letterLevel) {
        this.letterLevel = letterLevel;
    }
    public void moving(){

    }
}
