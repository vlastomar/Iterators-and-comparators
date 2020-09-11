package StrategyPatternS;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Set<Person> name = new TreeSet<>(new Person.NameClass());
        Set<Person> age =  new TreeSet<>(new Person.AgeClass());

        int number = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < number ; i++) {
            String[] input = scan.nextLine().split("\\s+");
           String nameS = input[0];
           int ageS = Integer.parseInt(input[1]);
           Person person = new Person(nameS, ageS);
           name.add(person);
           age.add(person);
           
        }

        for (Person person : name) {
            System.out.println(String.format("%s %d", person.getName(), person.getAge()));
        }
       for (Person person : age) {
            System.out.println(String.format("%s %d", person.getName(), person.getAge()));
        }
    }
}
