import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> strings =  Stream.of("one", "two", "three", "four")
      .collect(Collectors.toList());


        // long count = strings.stream().peek(System.out::println)
        //     //.filter(s -> s.startsWith("t"))
        //     .count();
        // System.out.println("*****************");
        // System.out.println("count elements:" + count);


        ArrayList<String> list = new ArrayList<>();

        long count1 = strings.stream().map(s -> {
            list.add(s);
            return s.toUpperCase();
        }).count();

        System.out.println("count = " + count1);
        System.out.println("list = " + list);


    }
}