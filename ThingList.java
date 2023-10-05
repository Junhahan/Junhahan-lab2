
import java.util.LinkedList;
import java.util.Random;

public class ThingList extends LinkedList<Thing> {
    private class Node {
        private Thing data;
        private Node next;

        public Node(Thing data) {
            this.data = data;
            this.next = null;

        }
    }
    public void addThing(Thing thing) {
        this.add(thing);
    }
    public void printAll() {
        for (Thing t : this) {
            System.out.println(t);
        }
    }

    public void moveAll(Random rand) {
        for (Thing thing : this) {
            thing.maybeTurn(rand);
            thing.step();
        }
    }
    public void addAll(Thing[] things) {
        for(Thing thing : things) {
            add(thing);
        }
    }
}