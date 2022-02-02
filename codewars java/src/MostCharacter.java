
// I would import the map interface.
// creatter a counter 
// I would loop through the string 
// compare one indexes with the string that is being passed
// use counter 
// 
import java.util.HashMap;

class MostCharacter {
	public static char getMostFrequentCharacter(String str) {
		HashMap<Character, Integer> characterCount = new HashMap<>();
		char maxChar = ' ';
		for (int i = 0; i < str.length(); i++) { 
			char string = str.charAt(i); //j,a,v,a
			int count = characterCount.getOrDefault(string, 0); // 0,0,0,1
			count++;// 1,1,2
			characterCount.put(string, count); // (j,1) (a,2),(v,1)
//			System.out.println("count" + count);
//			System.out.println("characterCount" + characterCount.getOrDefault(maxChar, 0));
			if (characterCount.getOrDefault(maxChar, 0) < count) { //true,true,true,false
				maxChar = string; // a
				System.out.println("maxchar" + maxChar);
			}
			
		}

		return maxChar;
	}

	public static void main(String[] args) {
		System.out.println(getMostFrequentCharacter("java"));
	}

}



////I would import the map interface.
////creatter a counter 
////I would loop through the string 
//// compare one indexes with the string that is being passed
// // use counter 
//// 
//import java.util.HashMap;
//class Main {
//
//public static char getMostFrequentCharacter(String str) {
//  HashMap<Character,Integer> characterCount = new HashMap<>();
//  char maxChar = ' ';
//  for(int i = 0; i < str.length(); i++){
//    char string = str.charAt(i); //h,,e,, l,,,l,,o
//    int count = characterCount.getOrDefault(string, 0); //1,0
//    count++;//1,2
//    characterCount.put(string,count); //(h,1)(e,1)(l,2),(o,1)
//     
//     if(characterCount.getOrDefault(maxChar, 0) < count){ // true
//       maxChar = string; // l
//     }
//  }
//
// return maxChar;
//}
//
//// H -> 1
//// e -> 1
//// l -> 3
//// o -> 2
////   -> 1
//// w -> 1
//// r -> 1
//// d -> 1
//// ! -> 1
//
//public static void main(String[] args) {
// HashMap<Character,Integer> map = new HashMap<>();
// System.out.println(getMostFrequentCharacter("hello"));
//}
//
//
//}