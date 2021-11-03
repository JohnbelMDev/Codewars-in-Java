public class CodeWars {
  public static int strCount(String str, char letter) {
    //write code here
    int count = 0;
    for(int i = 0; i < str.length(); i++){
      if(str.charAt(i) == letter){
        count++;
      }
    }
    return count;
  }
}
