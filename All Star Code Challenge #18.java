public class CodeWars {
  public static int strCount(String str, char letter) {
    //write code here
    int counter = 0;
    for(int i = 0; i < str.length(); i++){
      if(str.charAt(i) == letter){
        counter++;
      }
    }
    return counter;
  }
}
