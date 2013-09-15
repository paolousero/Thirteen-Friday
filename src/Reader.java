import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Reader {
	Scanner input;
	private String filename = "numbers.txt";
	private int[] nums;
	
	Reader(){
		
	}

	Reader(String filename){
	filename = "filename";
	}
/**	
 * 
 */
public void readFile(){

	File infile = new File(filename);
	
	try{
		input = new Scanner(infile);
		input.useDelimiter(""); //very useful. Scanner.next() will return individual characters.
		
		ArrayList<String> list = new ArrayList<String>();
		int[] numbers;
		
		//add integers to ArrayList
		while(input.hasNext())
		{
			if(input.hasNextInt())
				list.add(input.next());
			else
				input.next();
		}
		
		//convert to Integer, and smaller array
		numbers = new int[list.size()];
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = Integer.parseInt(list.get(i));
		}
		nums = numbers;
		
	}catch(FileNotFoundException e){
	e.printStackTrace();
	}
}
	
public int[] getArray(){
	int[] send = new int[nums.length];
	for (int i = 0; i < nums.length; i++) {
		send[i] = nums[i];
	}
	
	return send;
}


public void output(){
	int count = 0;
	
	loopbreak:
	for (int i = 0; i < nums.length; i++) {
		for (int j = 0; j < 51; j++) {	
			if(count == nums.length)
				break loopbreak;
			System.out.print(nums[count]);
			count++;
		}
		System.out.println();
	}
}

public void output(int[] arr){
	int count = 0;
	
	loopbreak:
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < 51; j++) {	
			if(count == arr.length)
				break loopbreak;
			System.out.print(arr[count]);
			count++;
		}
		System.out.println();
	}
}

}