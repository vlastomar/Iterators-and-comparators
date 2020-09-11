package ComparingObjects;

public class Person implements Comparable<Person>{
    private String name, age , town;

    public Person(String name, String age, String town) {
        this.name = name;
        this.age = age;
        this.town = town;
    }


    @Override
    public int compareTo(Person o) {
        if (this.name.equals(o.name) && this.age.equals(o.age) && this.town.equals(o.town)){
            return 0;
        }else{
            return 1;
        }

    }
}
