package Iterator;

import java.util.*;


public class Randoms implements Iterable<Integer> {
    protected Random random;
    int min;
    int max;

    public Randoms(int min, int max) {
        //...
        random = new Random();
        this.min = min;
        this.max = max;
        }


    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>(){
            Randoms randomItem = new Randoms(min, max);

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                int index = randomItem.random.nextInt((max - min) + 1);
                return index += min;
            }
        };
    }
}
