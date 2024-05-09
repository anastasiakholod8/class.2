public class Personnel {

    private int cooks;
    private int waiters;
    private int guards;

    public int getCooks() {
        return cooks;
    }

    public void setCooks(int cooks) {
        this.cooks = cooks;
    }

    public int getWaiters() {
        return waiters;
    }

    public void setWaiters(int waiters) {
        this.waiters = waiters;
    }

    public int getGuards() {
        return guards;
    }

    public void setGuards(int guards) {
        this.guards = guards;
    }

    public Personnel(int cooks, int waiters, int guards) {
        this.cooks = cooks;
        this.waiters = waiters;
        this.guards = guards;
    }
    void findAmount(){
        System.out.println("У ресторані працює "  +(waiters+guards+cooks) +" людей");
    }
}