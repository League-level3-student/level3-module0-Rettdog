package _03_More_Array_Fun;

import java.util.ArrayList;
import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String[] strings = new String[10];
		for(int i = 0;i<strings.length;i++) {
			Random rand = new Random();
			
			strings[i]=rand.nextInt(10)+" ";
		}
		randomArray(strings);
	}
	
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	void printStrings(String[] arr) {
	for(String string:arr) {
		System.out.println(string);
	}
	}
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	void reverseArray(String[] arr) {
		for(int i = arr.length;i>0;i--) {
			System.out.println(arr[i]);
		}
	}
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	void everyotherArray(String[] arr) {
		for(int i = 0;i<arr.length;i+=2) {
			System.out.println(arr[i]);
		}
	}
	
	static //5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	void randomArray(String[] arr) {
		//String mem;
		Random rand = new Random();
		int randomNumber=rand.nextInt(arr.length);;
		//String[] newer = new String[arr.length];
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		for(int i = 0;i<arr.length;i+=1) {
			//mem = arr[rand.nextInt(arr.length)];
			while(numbers.contains(randomNumber)) {
			randomNumber= rand.nextInt(arr.length);
			
			}
			//newer[randomNumber]=arr[i];
			numbers.add(randomNumber);
			System.out.println(arr[i]);
		}
	}
	
}
