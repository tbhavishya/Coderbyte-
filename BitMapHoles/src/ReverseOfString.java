
public class ReverseOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		   
		        String s = "hello, world!";
		        System.out.println(reverseString(s));
		    }
	

		    private static String reverseString(String s){

		        String reverse = "";

		        for(int i = s.length() - 1; i >= 0;i--){
		            reverse += s.charAt(i);
		        }

		        return reverse;
		    }

		
	}


