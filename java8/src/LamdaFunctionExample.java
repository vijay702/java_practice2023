import java.util.Comparator;

public class LamdaFunctionExample {

    public static void main(String[] args) {


        Comparator<Integer> integerComparator = ( x, y) -> x.compareTo(y) ;

        System.out.println(integerComparator.compare(20,10));

    }
}
