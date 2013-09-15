public class Main {
	
	public static void main(String[] args){
		System.out.println("TEST");
		int[] out;
		int[] toMultiply = new int[5];
		int count = 0;
		double max = 0;
		
		Reader read = new Reader();
		read.readFile();
		out = read.getArray();
		
		while(count+5 != out.length){
			for (int i = 0; i < 5; i++) {
				toMultiply[i] = out[i+count];
			}
		max = Math.max(max,multiply(toMultiply));
		count++;
		}
		System.out.println(max);
		System.out.println("ENDTEST");
	}


/*
 * 
 */
static public double multiply(int[] input){
	double multiplied= 1;
	for (int i = 0; i < input.length; i++) 
		multiplied *= input[i];
	return multiplied;
}

}