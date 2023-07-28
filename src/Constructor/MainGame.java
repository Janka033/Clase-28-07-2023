package Constructor;

public class MainGame {
    public static void main(String[] args) {
        Character character = new Character("Valquiria",3000,200,4);
        Character miniGame = new Character("Minipekks",1000,900,4);
        Deck deck1 = new Deck(8,4,"Exotic",13);
        Sand sand = new Sand();
        Sand sand1 = new Sand("24");
        Sand sand2 = new Sand("25",300);


    }
}
