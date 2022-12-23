public class Main {
    public static void main(String[] args) {
        Mage mag1 = new Mage("Mefisto",170,220, "ice");
        Mage mag2 = new Mage("Hendolf",170,220, "ice");

        mag1.getInfo();

        String winner = mag1.fight(mag2);
        System.out.println(winner);
    }
}