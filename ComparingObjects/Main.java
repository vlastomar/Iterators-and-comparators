package ComparingObjects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        Scanner scan = new Scanner(System.in);

        List<Person> persons = new ArrayList<>();
        String line = "";
        while (!(line = read.readLine()).equals("END")){
            String[] word = line.split("\\s+");
            String name = word[0];
            String age = word[1];
            String town = word[2];
            Person person = new Person(name, age, town);
            persons.add(person);
        }

        int sumEqual = 0;
        int sumNotEqual = 0;
        int number = Integer.parseInt(read.readLine());
        if (number <= persons.size()){
            Person person = persons.get(number - 1);
            for (int i = 0; i < persons.size() ; i++) {
                if (i != number - 1){
                   int comp =  person.compareTo(persons.get(i));
                   if (comp == 0){
                       sumEqual++;
                   }else {
                       sumNotEqual++;
                   }
                }
            }
        }

        if (sumEqual == 0){
            System.out.println("No matches");
        }else{
            System.out.println(String.format("%d %d %d", sumEqual + 1, sumNotEqual, persons.size()));
        }

    }
}
