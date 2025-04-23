public class GameApp {

    public static void main(String[] args) {
        
        Character char1 = new Knight();
        char1.attack();
        char1.defend();

        System.out.println();

        Character char2 = new Wizard();
        char2.attack();
        char2.defend();

        System.out.println();

        Character char3 = new Archer();
        char3.attack();
        char3.defend();

    }

}