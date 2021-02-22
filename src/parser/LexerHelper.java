package parser;

public class LexerHelper {
	
	public static int lexemeToInt(String str) {
		try {
			return Integer.parseInt(str);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		return -1;
	}

	// TODO: Implement the lexemeToChar and lexemeToReal methods
	public static double lexemeToReal(String str) {
		try {
			return Double.valueOf(str);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		return -1;
	}

	public static char lexemeToChar(String str) {
		try {
			if(str.charAt(1) != '\\'){
				return str.charAt(1);
			}
			switch(str){
				case "'\\n'":
					return '\n';
				case "'\\t'":
					return '\t';
				default:
					int num = Integer.parseInt(str.substring(2,str.length()-1));
					return (char) num;
			}
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		return 0;
	}
	
}
