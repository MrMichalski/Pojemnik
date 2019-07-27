public class Durszlak extends Pot {
    private int holes;

    public Durszlak(int capacity, int uszy, int holes) {
        super(capacity, uszy);
        this.holes = holes;
    }

    @Override
    public boolean closeable() {
        return !super.closeable();
    }

    public String cos() {
        return super.dupa();
    }
}
