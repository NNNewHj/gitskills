import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

//: containers/Test.java
// Framework for performing timed tests of containers.

public class Test extends ATest {
	
	
	
	public static  void main(String[] args){
		
		StringBuilder stringBuilder = new StringBuilder(21);
		
		char[] a = new char[2147483400];
		
		for(int i = 0; i<stringBuilder.capacity();i++){
			stringBuilder.append('a');
		}
		
		StringBuilder stringBuilder1 = new StringBuilder(1000);
		
		for(int i = 0; i<stringBuilder1.capacity();i++){
			stringBuilder.append('a');
		}
		
			stringBuilder.append('b');
		
	}
  
}
