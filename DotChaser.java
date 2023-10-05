
import java.util.Random;

public class DotChaser {
    public static Random rand = new Random(System.currentTimeMillis());

    public static void main(String[] args) {
        int N = 200;
        if (args.length != 0) {
            N = Integer.parseInt(args[0]);
        }
        
        ThingList list = new ThingList();
        int count = 0;

        while (true) {
            if (count % N == 0) {
                list.add(new TypeA(45, 50));
                list.add(new TypeB(55, 50));
                list.add(new TypeC(35,50));
            }
            
            list.printAll();
            System.out.println("done");
            System.out.flush();
            
            list.moveAll(rand);
            count++;
        }
    }
}