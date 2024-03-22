public class Demon implements Runnable {
    Program prog;
    Demon(Program prog) {
        this.prog = prog;
    }
    @Override
    public void run() {
        ProgState newState;
        do
        {
            newState = ProgState.randomState();
            prog.setState(newState);
            try {
                Thread.sleep(10);
            } catch(InterruptedException err) {
                System.out.println("Interrupted");
            }
        } while(newState != ProgState.FATAL_ERROR);
    }
}
