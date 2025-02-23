import java.util.Scanner;
class repeated_character_from_string{
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		String str = sc.next();

		int dup =0;

		char rem=str.charAt(0);


		for (int i =0;i<=str.length()-1 ;i++ ) {
			int cnt =0;
			
			for (int j=0;j<=str.length()-1 ;j++ ) {
				
				if(str.charAt(i)==str.charAt(j)){
					cnt++;
				}
			}

			if(cnt>dup){
				dup=cnt;
				rem= str.charAt(i);

			}
						
			
		}
		System.out.println(rem);

		

	}
	
}