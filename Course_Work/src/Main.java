public class Main {
    public static void main(String[] args) {
        Program prog =  new Program();
        prog.setState(ProgState.UNKNOWN);
        Supervisor supervisor = new Supervisor(prog);
        Demon demon = new Demon(prog);
        Thread supervThread = new Thread(supervisor);
        Thread demonThread = new Thread(demon);
        Thread progg = new Thread(prog);
        progg.start();
        supervThread.start();
        demonThread.setDaemon(true);
        demonThread.start();
    }
}