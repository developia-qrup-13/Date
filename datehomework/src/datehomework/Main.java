package datehomework;

import java.time.LocalDateTime;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
	  LocalDateTime localdate= LocalDateTime.now();
	  String a = localdate.toString();
	  String str[]=a.split("T");
	  printStringg(str);
	  List<String> strings = Pattern.compile("T").splitAsStream(a).collect(Collectors.toList());
	  for(String string : strings) {
		  System.out.println("date and time :"+string );
		 
	  }
	}
	public static void printStringg(String str[]) {
		for(String string : str) {
			System.out.println(string);
		}
	}
}
