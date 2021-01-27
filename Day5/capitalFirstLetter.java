//Using only Strings

public class capitalFirstLetter {
	public static void main(String[] args) {
		String s = "sanket";
		String res = "";
		res = s.substring(0, 1).toUpperCase();
		res += s.substring(1);
		System.out.println(res);
	}
}
