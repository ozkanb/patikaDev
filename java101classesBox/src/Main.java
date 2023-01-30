public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Tyson", 20, 120, 120, 30);
        Fighter f2 = new Fighter("Apollo", 25, 100, 100, 40);

        Match match = new Match(f1, f2, 85,120);
        match.run();

    }
}