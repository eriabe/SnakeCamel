package snakecamel;

public class SnakeCamelUtil {

	public static String snakeToCamelcase(String snake_case) {
		String[] words = snake_case.split("_");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < words.length; i++) {
			sb.append(capitalize(words[i]));
		}
		return new String(sb);
	}
	 
	public static String camelToSnakecase(String camelcase) {
		StringBuilder sb = new StringBuilder();
		int j = 0;
		for (int i = 0; i < camelcase.length(); i++) {
			char c = camelcase.charAt(i);
			if (Character.isUpperCase(c)) {
				sb.append(camelcase.substring(j, i));
				if (sb.length() > 0) {
					sb.append("_");
				}
				sb.append(Character.toLowerCase(c));
				j = i;
				j++;
			}			
		}
		sb.append(camelcase.substring(j));
		return new String(sb);
	}
	
	static String capitalize(String s) {
		if(s.length()!=0){
			char first;
			first = s.charAt(0);
			char upperFirst = Character.toUpperCase(first);
			String rest = s.substring(1);
			return upperFirst + rest;
		}else{
			return s;
		}
	}

	static String uncapitalize(String s) {
		char first = s.charAt(0);
		char lowerFirst = Character.toLowerCase(first);
		String rest = s.substring(1);
		return lowerFirst + rest;
	}
	
	public static void main(String[] args) {
		String lowa = "a";
		String upa = "A";
		String lowx = "xyz";
		String upx = "Xyz";
		String upToLowa = uncapitalize(upa);
		String lowToUpa = capitalize(lowa);
		String upToLowx = uncapitalize(upx);
		String lowToUpx = capitalize(lowx);		
		String lowSnakea = "abc";
		String lowSnakeb = "abc_def";
		String lowSnakec = "abc_def_gh";
		String lowSnaked = "abc_def__ghi";
		String lowSnakee = "_abc_def_";
		String upCamela = "Abc";
		String upCamelb = "AbcDef";
		String upCamelc = "AbcDefGh";
		String snaToCama = snakeToCamelcase(lowSnakea);
		String snaToCamb = snakeToCamelcase(lowSnakeb);
		String snaToCamc = snakeToCamelcase(lowSnakec);
		String snaToCamd = snakeToCamelcase(lowSnaked);
		String snaToCame = snakeToCamelcase(lowSnakee);		
		String camToSnaa = camelToSnakecase(upCamela);
		String camToSnab = camelToSnakecase(upCamelb);
		String camToSnac = camelToSnakecase(upCamelc);		
		System.out.println("uncapitalizea="+upToLowa);
		System.out.println("capitalizea="+lowToUpa);		
		System.out.println("uncapitalizexyz="+upToLowx);
		System.out.println("capitalizexyz="+lowToUpx);
		System.out.println("snakeToCamelcase="+snaToCama);		
		System.out.println("snakeToCamelcase="+snaToCamb);		
		System.out.println("snakeToCamelcase="+snaToCamc);		
		System.out.println("snakeToCamelcase="+snaToCamd);		
		System.out.println("snakeToCamelcase="+snaToCame);
		System.out.println("camelToSnakecase="+camToSnaa);
		System.out.println("camelToSnakecase="+camToSnab);
		System.out.println("camelToSnakecase="+camToSnac);
		
	}
	
}
