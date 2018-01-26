package stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Average implements ArrayOperations {

    @Override
    public double getAverage(int[] numbers) {
        IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .forEach(System.out::println);

        OptionalDouble av = IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .average();
        return av.getAsDouble();

    }
}
