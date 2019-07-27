public class Pot extends Container {

    private int uszy;

    public Pot(int capacity, int uszy) {
        super(capacity);
        this.uszy = uszy;
    }

    @Override
    public boolean closeable() {
        return false;
    }
}
