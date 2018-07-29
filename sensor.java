import java.util.*;
import java.io.*;

public class sensor {
	double p=0;
	double r[]=new double[4];
	
	public void prob() throws java.lang.Exception {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		//System.out.println("Prob");
		p=Double.parseDouble(br.readLine()); //Probability of turning on 
		p=1-p; //Probability range as required for the algorithm
	}
	
	public void ran() {
		Random rand = new Random();
		for(int i=0;i<4;i++) {
			r[i]=rand.nextDouble();
			System.out.println(r[i]);
		}
		System.out.println("");

	}
}
