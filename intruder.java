
public class intruder {
	int c=0;
	border b=new border();
	sensor s=new sensor();
	
	public void construct() throws java.lang.Exception {
		s.prob();
		b.build();
		s.ran();
	}
	
	public void step() {
		if(c==0) {
			for(int i=0;i<3;i++) {
				if(s.r[i]<s.p) {
					b.w--;
					break;
				}
			}
		}
		else {
			if(s.r[3]<s.p) {
				for(int i=0;i<3;i++) {
					if(s.r[i]<s.p) {
						b.w--;
						break;
					}
				}
			}
		}
	}
	
	public void runt() throws Exception {
		construct();
		while(b.w!=0) {
			s.ran();
			step();
			c++;
		}
	}
	
	public static void main(String[] args) throws java.lang.Exception {
		intruder x= new intruder ();
		x.runt();
		System.out.println("\n\n\n" + x.c);

	}
}
