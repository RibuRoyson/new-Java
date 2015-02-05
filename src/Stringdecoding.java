
public class Stringdecoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		        String input = "In this Java program we will see couple of ways to count, how many times a particular character is present in String. First we we will see Spring framework’s StringUtils class and its static method countOccurrenceOf(String, character) which takes a String and character and returns occurrence of character into that String. After that we will see Apache commons StringUtils class for counting occurrence of a character in String. Apache commons StringUtils provide countMatches() method which can be used to count occurrence of one character or substring. Finally we will see most simple way of counting character using standard for loop and Java 5 advanced for loop. This solution can be extended not just for finding occurrence of character but also finding occurrences of substring"; //count number of "a" on this String.
		      int charCount = 0;
		        for(int i =0 ; i<input.length(); i++){
		            if(input.charAt(i) == 'a'){
		                charCount++;
		            }
		        }
		        System.out.println("count of character 'a' on String:  using for loop  " + charCount);
		           
			input=input.replace('a', 'z');
			System.out.println(input);
			input=input.replace('e', 'q');
		    input=input.replace('b', 'x');
			input=input.replace('c', 'v');
			input=input.replace('o', 'm');
			System.out.println(input);
							}
		}
	


