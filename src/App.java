import classes.Map;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("App Running!");
        System.out.println();
        Map m1 = new Map("1", "Evan", 20);
        m1.afficheGrille();
        System.out.println();
        m1.agranditGrille(10);
        m1.afficheGrille();
    }
}
