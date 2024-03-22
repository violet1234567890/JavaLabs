public class Program implements Runnable {
    public ProgState state;
    public volatile boolean isKnown = true;
    public volatile boolean isWorking = true;
    public volatile boolean isStopped = false;
    public synchronized void setState(ProgState state) {
        while (!this.isKnown) {
            try {
                wait();
            }
            catch (InterruptedException e) {};
        }
        this.isKnown =  false;
        this.state = state;
        if(state == ProgState.STOPPING)
        {
            this.isStopped = true;
        }
        notify();
    }

    public synchronized ProgState getState() {
        this.isKnown = true;
        return this.state;
    }
    public synchronized void doSomething() {
        if(isStopped) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        else {
            int a = 10 * 14;
            notify();
        }
    }
    @Override
    public void run() {
        for(int i = 0; i < 10000; i++) {
            doSomething();
            if (!isWorking)
            {
                return;
            }
        }
    }
}
