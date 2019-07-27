public abstract class Container {

    private int capacity;

    public Container(int capacity) {
        this.capacity = capacity;
    }

    public abstract boolean closeable();


    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String dupa() {
        return "dupa";
    }


}
