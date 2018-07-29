import java.util.*;

public class border {
	int w=0; //Width of the border. Length taken as infinite
	
	public void build() {
		Scanner s1 = new Scanner(System.in);
		//System.out.println("Width");
		w=s1.nextInt();
		//System.out.println("Width"+w);
		s1.close();
	}
}
