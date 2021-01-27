
//Using only Strings
public class ReverseEveryWord {
	public static void main(String[] args) {
		String s = "hello there capitalize me please if u will";
		String res = "";
		for (String word : s.split(" ")) {
			for (int i = word.length() - 1; i >= 0; i--)
				res += word.charAt(i);
			res += " ";
		}
		System.out.println(res);
	}
}
