package StrategyPatternS;

import java.util.Comparator;

public class Person implements Comparable<Person>{
   private String name;
   private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
public static class NameClass implements Comparator<Person>
{

    @Override
    public int compare(Person o1, Person o2) {
        int first = o1.name.length();
        int second = o2.name.length();
        int res = Integer.compare(first, second);
        if (res == 0){
            String oneS = o1.name.toLowerCase();
            String twoS = o2.name.toLowerCase();
            int one = oneS.charAt(0);
            int two = twoS.charAt(0);
            return Integer.compare(one, two);
        }else {
            return res;
        }

    }
}

public static class AgeClass implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
        int res = Integer.compare(o1.age, o2.age);
        return res;
    }
}

    @Override
    public int compareTo(Person o) {
       return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
