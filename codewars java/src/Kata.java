public class Kata {
  
  public static int[] incrementer(int[] numbers) {
    int counter = 0; 
    for(int i = 0; i <= numbers.length - 1; i++ ){
      counter++;
      numbers[i]+=counter;
             if(numbers[i] >= 10){
                  System.out.println(numbers[i]);
            }
      
    }
    
    return numbers;
  }
}