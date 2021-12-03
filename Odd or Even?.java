public class Codewars {
  public static String oddOrEven (int[] array) {
  // your code
     int sum = 0;
    for( int i = 0; i < array.length; i++){
     sum+=array[i];
    }
    if(sum % 2 == 0){
      return "even";
    }
    else{
      return "odd";
    }

  }
}
