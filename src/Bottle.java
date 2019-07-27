public class Bottle extends Container {

    private String label;

    public Bottle(String label, int capacity) {
        super(capacity);
        this.label = label;
    }

    @Override
    public boolean closeable() {
        return true;
    }
}
