package imtihon.bir;

public class Counter {
    private int count;
    public synchronized  void increamt(){
        ++count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
