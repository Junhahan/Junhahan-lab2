import java.util.Random;
public class TypeA extends Thing {
    
    public TypeA(int row, int col) {
        super(row, col);
    }
    @Override
    public void maybeTurn(Random rand) {
        int i = DotChaser.rand.nextInt(3);
        if (i == 1) {
            rightTurn();
        } else if (i == 2) {
            leftTurn();
        }
        super.step();
    }
}