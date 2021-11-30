import java.util.*;
class HashMapDemo {
    public static void main(String args[])
    {
      // int[] intArray = countPositivesSumNegatives({23});
// System.out.println(countPositivesSumNegatives(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15}));
int x[] = countPositivesSumNegatives(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15});
System.out.println(Arrays.toString(x));
    }



    public static int[] countPositivesSumNegatives(int[] input)
    {
       if (input == null || input.length == 0) return new int[] {};
       int count = 0,sum = 0;
       for (int i : input) {
         if (i > 0) count ++;
         if (i < 0) sum += i;
       }
       // Arrays.toString(x)
       // return new int[] {count,sum};
       return  new int[] {count,sum};


    }
}
