
public class countCharectors {

	    public static void main(String[] args) {
	        String input = "Hello, World!";
	        int count = countCharacter(input);
	        System.out.println("Total number of characters: " + count);
	    }
	    
	    public static int countCharacter(String input) {
	        int count = 0;
	        for (int i = 0; i < input.length(); i++) {
	            if (input.charAt(i) != ' ') {
	                count++;
	            }
	        }
	        return count;
	    }
	}

