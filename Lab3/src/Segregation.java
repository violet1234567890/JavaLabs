import java.util.Collection;

public class Segregation {
    public static void segregate(Collection<? extends Chordates> first,
              Collection<? super CommonHedgehog> second, Collection<? super Manul> third,
              Collection<? super Lynx> fourth) throws TechException {
        try {
            for(Chordates chor : first) {
                if(chor instanceof Hedgehogs) {
                    second.add((CommonHedgehog) chor);
                } else if (chor instanceof Manul) {
                    third.add((Manul) chor);
                } else if (chor instanceof Lynx) {
                    fourth.add((Lynx) chor);
                }
            }
        } catch (Exception err) {
            throw new TechException("An error occurred \n" + err.getMessage());
        }

    }
}
