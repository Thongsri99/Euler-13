import java.math.BigInteger;
import java.io.*;
import java.util.Scanner;
public class Large_sum {

	public static void main(String[] args) throws IOException {
		BigInteger sum = new BigInteger("0");
		File f = new File("Euler13.txt");
		Scanner fileScan = new Scanner(f); 
		long start = System.currentTimeMillis();
		while(fileScan.hasNext()){
			BigInteger number = new BigInteger(fileScan.nextLine());
			sum = sum.add(number);
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
		System.out.print(sum);
	}
}
