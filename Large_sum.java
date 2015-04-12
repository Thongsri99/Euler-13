/*
I simply copy and pasted all one hundred values into a file and add them.
Solution is very quick.
*/
import java.math.BigInteger;
import java.io.*;
import java.util.Scanner;
public class Large_sum {

	public static void main(String[] args) throws IOException {
		BigInteger sum = new BigInteger("0");
		
		//I created a file called Euler13.
		File f = new File("Euler13.txt");
		
		
		Scanner fileScan = new Scanner(f); 
		long start = System.currentTimeMillis();
		while(fileScan.hasNext()){
			//This will read the file and then calculate my sum.
			BigInteger number = new BigInteger(fileScan.nextLine());
			sum = sum.add(number);
		}
		long end = System.currentTimeMillis();
		
		//This will print out the time and then the total number.
		System.out.println(end - start);
		System.out.print(sum);
	}
}
