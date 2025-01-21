
import java.util.Scanner;



public class AAC_Palindrome {
    public static void main(String[] args) {
      
        String s = ""; 
        String r = "";
        char ch;
        Scanner scanner = new Scanner(System.in);
        s = scanner.nextLine();
        for (int i = 0; i < s.length(); i++) {
              
              // extracts each character
            ch = s.charAt(i);
          
              // adds each character in
            // front of the existing string
            r = ch + r; 
        }
        if(s.equals(r)){
            System.out.println("It is palindrome");
        }else{
            System.out.println("Not palindrome");
        }
        
    }
}
