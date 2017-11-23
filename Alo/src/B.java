
public class B {
	static int y = A.x+1;
	public static void main(String[] args) {
		/*System.out.println(A.x);
		System.out.println(B.y);*/
		String str = "a,b,c,,";
		String [] strs = str.split(",");
		System.out.println(strs.length);
		
	}
}
