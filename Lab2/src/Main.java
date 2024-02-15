public class Main {
    public static void main(String[] args) {
        try {
            MagicType type = new MagicType("water");
            ExecuteMethods.execute("prediction", 45, type);
            System.out.println("\n");
            ExecuteMethods.execute("magicBall", "blue", 20);
            System.out.println("\n");
            ExecuteMethods.execute("askForMoney");
            System.out.println("\n");
            ExecuteMethods.execute("coolPrediction", 34);
            System.out.println("\n");
            ExecuteMethods.execute("lifeLine", 23665.5, 38, true);
            System.out.println("\n");
            ExecuteMethods.execute("tarotDivination", 32);
            System.out.println("\n");
            ExecuteMethods.execute("tarotDivination");
            System.out.println("\n");
            ExecuteMethods.execute("coolPrediction", null);
            ExecuteMethods.execute("jghsb", 45);
            ExecuteMethods.execute("coolPrediction");
        } catch (TechException error)
        {
            System.err.println(error.getMessage());
        }
    }
}