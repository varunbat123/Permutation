// Varun Batra 110256128
public class Permutation {
	public static void displayPermutation(String s){
		displayPermutation("",s);
		
	}

	public static void displayPermutation(String s1, String s2){
		if (s2.equals("")){
			System.out.println(s1);
		}
		else {
			for( int i =0; i< s2.length(); i++){
				displayPermutation(s1+s2.charAt(i),s2.substring(0, i)+s2.substring(i+1, s2.length()));
			}
		}
	}
	public static void main(String[] args) {
	displayPermutation("abc");

	}

}