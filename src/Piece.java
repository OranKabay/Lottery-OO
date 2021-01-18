import java.util.Random;

public class Piece {
    private int _val;

    public int get_val() {
        return _val;
    }

    public void set_val(int _val) {
        this._val = _val;
    }

    public Piece() {
    }

    public Piece(int _maxVal) {
        Random rand = new Random();
        this._val = rand.nextInt(_maxVal) + 1;
    }

    @Override
    public String toString() {
        return _val + " ";
    }
}