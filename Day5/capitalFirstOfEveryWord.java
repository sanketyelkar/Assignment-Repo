
//Using only Strings
public class capitalFirstOfEveryWord {
	public static void main(String[] args) {
		String s = "hello there capitalize me please if u will";
		String res = "";

		for (String word : s.split(" ")) {
			res += word.substring(0, 1).toUpperCase() + word.substring(1) + " ";
		}
		System.out.println(res.trim());
	}
}
