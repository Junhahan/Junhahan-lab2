import java.util.Random;

public class TypeC extends Thing {
    
    private int distanceMovedInCurrentDirection = 0;
    private int maxDistanceInCurrentDirection = 1;
    private int changesInDirection = 0;
    
    public TypeC(int row, int col) {
        super(row, col);
        this.lab = 'c';
    }
    @Override
    public void maybeTurn(Random rand) {
        // Occasionally disrupts the spiral pattern
        if(rand.nextInt(20) == 1) { // 1 in 20 chance to randomly turn
            if(rand.nextBoolean()) {
                rightTurn();
            } else {
                leftTurn();
            }
        }
    }
    public void move() {
        switch(dir) {
            case 0:  
                row--;
                break;
            case 1:
                col++;
                break;
            case 2:
                row++;
                break;
            case 3:
                col--;
                break;
        }    
        distanceMovedInCurrentDirection++;
        if (distanceMovedInCurrentDirection == maxDistanceInCurrentDirection) {
            rightTurn();       
            changesInDirection++;
            if (changesInDirection % 2 == 0) {
                maxDistanceInCurrentDirection++;
            }
            distanceMovedInCurrentDirection = 0;
        }
    }
}
