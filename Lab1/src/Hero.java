public class Hero
{
    public void move(WaysToMove way) throws TechException {
        try {
            System.out.println(way.OutWay());
        } catch(Exception error) {
            throw new TechException(error.getMessage() + '\n' + "Null Way");
        }
    }
}