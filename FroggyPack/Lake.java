package FroggyPack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lake implements Iterable<Integer> {
private List<Integer> numbers;


public Lake(){
    this.numbers = new ArrayList<>();

}

public void inputList(int element){
    numbers.add(element);
    }

private final class numbersIter implements Iterator<Integer> {
    private int currentIndex = 0;

    @Override
    public boolean hasNext() {
        return this.currentIndex < numbers.size() ;
    }

    @Override
    public Integer next() {
        int number = numbers.get(currentIndex);
        currentIndex += 2;
        if (currentIndex >= numbers.size() && currentIndex % 2 == 0){
            currentIndex = 1;
        }
        return number;


    }
}



    @Override
    public Iterator<Integer> iterator() {
        return new numbersIter();
    }
}
