// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String word = args[0];
	        int cheersn = Integer.parseInt(args[1]);
                String nword = word.toUpperCase();
                String vowels = "AEFHILMNORSX";
                for (int lettercount = 0; lettercount < nword.length(); lettercount++){
                        char c = nword.charAt(lettercount);
                        if (vowels.indexOf(c) > -1){
                                System.out.println("Give me an " + nword.charAt(lettercount) + ": " + nword.charAt(lettercount) + "!");        
                        }
                        else{
                                System.out.println("Give me a  " + nword.charAt(lettercount) + ": " + nword.charAt(lettercount) + "!");  
                        }
                }
                System.out.println("What does that spell?");
                for (int cheerscount = 0; cheerscount < cheersn; cheerscount++){
                        System.out.println(nword + "!!!");
                }
        }
}
