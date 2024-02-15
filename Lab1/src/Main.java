import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero();
        try {
            hero.move(null);
        } catch (TechException error) {
            System.err.println(error.getMessage());
        }
        try (Scanner in = new Scanner(System.in)) {
            while (in.hasNextLine()) {
                String way = in.nextLine();
                try
                {
                    switch (way) {
                        case "Walk":
                            WaysToMove walk =  new WalkByFeet();
                            hero.move(walk);
                            break;
                        case "Fly":
                            WaysToMove fly =  new FlyByPlane();
                            hero.move(fly);
                            break;
                        case "Ride":
                            WaysToMove ride = new RideByHorse();
                            hero.move(ride);
                            break;
                        case "Sail":
                            WaysToMove sail =  new SailOnAShip();
                            hero.move(sail);
                            break;
                        default:
                            System.out.println("Incorrect way to move");
                            break;
                    }
                }
                catch (TechException error)
                {
                    System.err.println(error.getMessage());
                }

            }
        }
    }
}