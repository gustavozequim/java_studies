import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams_lambdas{
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> numsPares = nums.stream().filter(numero -> numero % 2 == 0).collect(Collectors.toList());

        System.out.printf("Os numeros pares contidos na lista " + nums + ", sao: " + numsPares + "\n");
    }
}