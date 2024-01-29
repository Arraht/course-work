package program.object.counter;

public class Counter {
    private int id;

    public Counter(int id) {
        this.id = id;
    }

    public int getId() {
        this.id++;
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}