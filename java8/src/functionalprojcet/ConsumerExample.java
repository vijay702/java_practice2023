package functionalprojcet;

import java.util.Locale;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {

        Consumer<String> stringConsumer = (s) -> System.out.println(s.toUpperCase());



        Consumer<String> lowerCase = (s) -> System.out.println(s.toLowerCase());

        //lowerCase.accept("VIJAY");

        stringConsumer.andThen(lowerCase).accept("VijaY");
    }
}
