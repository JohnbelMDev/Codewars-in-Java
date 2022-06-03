import java.util.*;

public class Kata {
  public static String highAndLow(String string) {
     String[] numbers = string.split("\\D+");
    Arrays.sort(numbers, new Comparator<String>()
    {
      public int compare(String s1, String s2)
      {
        return Integer.valueOf(s1).compareTo(Integer.valueOf(s2));
      }
    });
    System.out.println(Arrays.toString(numbers));
    return "throw towel";
  }
}