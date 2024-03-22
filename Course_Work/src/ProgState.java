import java.util.Random;

public enum ProgState {
    UNKNOWN,
    RUNNING,
    STOPPING,
    FATAL_ERROR;

    private static final Random rand = new Random();
    public static ProgState randomState()  {
        ProgState[] states = values();
        int ran = rand.nextInt(states.length);
        return states[ran];
    }
};

