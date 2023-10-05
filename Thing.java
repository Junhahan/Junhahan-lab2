import java.util.Random;

abstract class Thing extends DotChaser {
    protected int row;
    protected int col;
    protected int dir;
    protected int timeSinceLast;
    protected char lab = 'r';
    
    public Thing(int row, int col) {
        this.row = row;
        this.col = col;
        this.dir = 0;
    }
    public abstract void maybeTurn(Random rand);

    public void rightTurn() {
        dir = (dir + 1) % 4;
    }
    
    public void leftTurn() {
        dir = (dir + 3) % 4;
    }

    public void step() {
        final int[] dc = {0, 1, 0, -1}, dr = {1, 0, -1, 0};
        row += dr[dir];
        col += dc[dir];
    }
    public String toString() {
        return row + " " + col + " " + lab;
    }
}