package homework.two;

public class VowelCount {
	  public static void main(String[] args) {
	    String book = "Corinthians";
	    int vowels = 0;

	    book = book.toLowerCase();
	    for (int a = 0; a < book.length(); ++a) {
	      char v = book.charAt(a);
	      if (v=='a' || v=='e' || v=='i' || v=='o' || v=='u') {
	        ++vowels;
	      }
	    }
	    System.out.println("Vowels = " + vowels);

	  }
	}