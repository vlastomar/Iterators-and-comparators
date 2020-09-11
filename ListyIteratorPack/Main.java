package ListyIteratorPack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ListyItrator list = null;

        String input = scan.nextLine();
        while (!"END".equals(input)){
            String[] token = input.split("\\s+");
            String[] elements = Arrays.copyOfRange(token,1,token.length);
            String command = token[0];
            switch (command){
                case "Create":
                   // list = new ListyItrator(Arrays.stream(token).skip(1).toArray(String[]::new)); - tova raboti
                    list = new ListyItrator(elements);
                    break;
                case "Move":
                    System.out.println(list.move());
                    break;
                case "Print":
                    list.print();
                    break;
                case "HasNext":
                    System.out.println(list.hasNext());
                    break;
                case "PrintAll":
                    list.PrintAll();
                    break;
            }


            input = scan.nextLine();
        }
    }
}
