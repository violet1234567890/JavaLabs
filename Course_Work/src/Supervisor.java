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
                    this.stopProg();
                    System.out.println("STOPPING");
                    prog.setState(ProgState.RUNNING);
                    System.out.println("RUNNING");
                    this.runProg();
                    break;
                case FATAL_ERROR:
                    System.out.println("FATAL ERROR");
                    this.terminateProg();
                    return;
            }
            try {
                Thread.sleep(5);
            } catch(InterruptedException err) {
                System.out.println("Interrupted");
            }
        }
    }
    public void terminateProg() {
        prog.isWorking = false;
    }
    public void stopProg() {
        prog.isStopped = true;
    }
    public void runProg() {
        prog.isStopped = false;
    }
}
