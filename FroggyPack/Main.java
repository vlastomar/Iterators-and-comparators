package FroggyPack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        Lake lake = new Lake();
        String line = "";
        while (!(line = read.readLine()).equals("END")){
            String[] tokens = line.split(",\\s+");
            for (int i = 0; i < tokens.length ; i++) {
                lake.inputList(Integer.parseInt(tokens[i]));
            }
        }
        StringBuilder print = new StringBuilder();
        for (Integer integer : lake) {
           print.append(integer +", ");
        }
        print.deleteCharAt(print.length() - 1);
        print.deleteCharAt(print.length() - 1);
        System.out.println(print);
    }
}
