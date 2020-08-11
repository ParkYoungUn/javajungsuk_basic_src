import java.util.Scanner;

class Ex5_10{
	public static void main(String[] args) {
		String[][] words = {
				{"one","1"},
				{"two","2"},
				{"three","3"}
		};
		
		Scanner scan = new Scanner(System.in);
		
		for (int i=0 ; i<words.length ;i++) {
			System.out.printf("%d. %s의 뜻은?",i+1,words[i][0]);
			
			String tmp = scan.nextLine();
			
			if(tmp.equals(words[i][1])) {
				System.out.println("정답!");
			} else {
				System.out.printf("땡!!! 정답은: %s\n",words[i][1]);
			}
		}
	} // main의 끝
}