package ListyIteratorPack;

import java.util.Iterator;
import java.util.List;

public class ListyItrator implements Iterable<String>{

    private List<String> listString;
    private int index;

    public ListyItrator(String... elements){
        this.listString = List.of(elements);
        this.index = index;
    }

    public boolean hasNext(){
        return this.index < this.listString.size() - 1 ;
    }

    public boolean move(){
        if (hasNext()){
            index++;
            return true;
        }else {
            return false;
        }

    }

    public void print(){
        if (listString.isEmpty()){
            System.out.println("Invalid Operation!");
        }else {
            System.out.println(this.listString.get(this.index));
        }

    }
    public List<String> getListString() {
        return this.listString;
    }

    public void setListString(List<String> listString) {
        this.listString = listString;
    }

    public int getIndex() {
        return this.index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void PrintAll(){
        for(String element : listString){
            System.out.print(String.format("%s ", element));
        }
        System.out.println();
    }


   @Override
    public  Iterator<String> iterator() {
        return new Iterator<String>() {
    @Override
    public boolean hasNext() {
        return ListyItrator.this.hasNext();
    }

    @Override
    public String next() {
     return listString.get(index);
    }

        };
    }


}
