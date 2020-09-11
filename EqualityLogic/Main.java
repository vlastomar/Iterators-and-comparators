package EqualityLogic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        Set<Person> treeS = new TreeSet<>();
        Set<Person> treeS2 = new TreeSet<>();
        Set<Person> hashS = new HashSet<>();

        String line = "";
        int number = Integer.parseInt(read.readLine());
        for (int i = 0; i < number; i++) {
            line = read.readLine();
            String[] tokens = line.split("\\s+");
            Person per = new Person(tokens[0], Integer.parseInt(tokens[1]));
            treeS.add(per);
            hashS.add(per);
            treeS2.add(per);
        }

        hashS = treeS2;
        System.out.println(treeS.size());
        System.out.println(hashS.size());

    }
}
