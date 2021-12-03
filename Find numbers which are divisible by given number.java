import java.util.Arrays;

public class EvenNumbers {
  public static int[] divisibleBy(int[] numbers, int divider) {
        int[] newArray = new int[numbers.length];
        int k = 0;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] % divider == 0){
                newArray[k] = numbers[i];
                k++;
            }
        }

        return Arrays.copyOf(newArray, k);
    }
}
