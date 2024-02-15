import java.lang.reflect.Method;

public class ExecuteMethods {
    public static void execute(String name, Object ...args) throws TechException {
        Magician mag = new Magician();
        try {
            Class<?>[] types = new Class<?>[args.length];
            for (int i = 0; i < args.length; i++) {
                types[i] = args[i].getClass();
            }
            Method met = Magician.class.getDeclaredMethod(name, types);
            met.setAccessible(true);
            int count = met.getAnnotation(DoNTimes.class).num();
            for (int i = 0; i < count; i++) {
                met.invoke(mag, args);
            }
         } catch(Exception error) {
            throw new TechException("There is an error " + error.getMessage());
        }
    }
}
