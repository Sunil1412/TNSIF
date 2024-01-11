package hundreadsjavarogram;

public class twentyeight {
	public static void main(String[] args) {
		// Floyd's Triangle
		
		int row=5;
		int num=1;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(num + "");
				num ++;
			}
			System.out.println();
		}
	}

}


