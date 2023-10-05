import java.util.Random;
public class TypeB extends Thing {
    
    public TypeB(int row, int col) {
        super(row, col);
        this.lab = 'b';
    }
    @Override
    public void maybeTurn(Random rand) {
        timeSinceLast++;
        if (timeSinceLast == 10) {
            int i = DotChaser.rand.nextInt(3);
            timeSinceLast = 0;
            if (i == 1) {
                rightTurn();
            } else if (i == 2) {
                leftTurn();
            }
        }
        super.step();
    }
}