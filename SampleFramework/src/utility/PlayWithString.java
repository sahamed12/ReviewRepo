package utility;



import org.junit.Test;

public class PlayWithString {
	

	
	//-----------------------------------------------------------------------
	//equal method: tells what two objects contains. only returns 
	public void stringPractice() {
	
	String s = "How are you";
	
	//how to rivers a string
	char []c2=s.toCharArray(); //this converts string to character array
	for (int i=c2.length-1; i>=0;i--) {
		System.out.println(c2[i]);
	}
	//when you want a portion of the string
	s.substring(4); //you get the 4th char
	s.substring(4,  6); //this will get you characters between 4 & 6
	}
	//how to find duplicate character

	//how to get vowels....
	
	//how to add numbers in a statement

//---------------------------
	@Test
	public void reverseSentenceByWord() {
//how to reverse a sentence by word: how are you -----> you are how
	
		String sentence ="how are you";
	//Step 3 : Split inputString into words and store them in a string array.

	String ar[] = sentence.split(" ");
			  					   //^this means sentence will split each time there is a space
	StringBuffer bf = new StringBuffer();
	
	for (int i=ar.length-1; i>=0; i--) {
		bf.append(ar[i]).append(" ");
	}System.out.println(bf.toString().trim());


	}
}
