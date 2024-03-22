public class Supervisor implements Runnable {
    Program prog;
    ProgState currState;
    Supervisor(Program prog) {
        this.prog = prog;
    }
    @Override
    public void run() {
        while(currState != ProgState.FATAL_ERROR)
        {
            if (prog.isKnown)
            {
                continue;
            }
            currState = prog.getState();
            switch (currState)
            {
                case UNKNOWN:
                    System.out.println("UNKNOWN");
                    break;
                case RUNNING:
                    System.out.println("RUNNING");
                    break;
                case STOPPING:
                    System.out.println("STOPPING");
                    prog.setState(ProgState.RUNNING);
                    prog.isStopped = true;
                    System.out.println("RUNNING");
                    break;
                case FATAL_ERROR:
                    System.out.println("FATAL_ERROR");
                    prog.isWorking = false;
                    return;
            }
            try {
                Thread.sleep(5);
            } catch(InterruptedException err) {
                System.out.println("Interrupted");
            }
        }
    }
}
