
import java.util.*;

class totalNumber {

    // Driver code
    public static void main(String[] args)
    {

        List<Integer> list = Arrays.asList(0, 1, 2, 4, 6,
                8, 10, 12);

        long total = list.stream().count();

        // Displaying the number of elements
        System.out.println(total);
    }
}
