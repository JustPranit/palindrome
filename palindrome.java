import java.util.Scanner;
public class palindrome{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = sc.next(),rev="";
        int l = word.length();
        for(int i=l-1;i>=0;i--){
            rev = rev + word.charAt(i);
        }
        if(word.equalsIgnoreCase(rev)){
            System.out.println("palindrome");
        }
        else
        System.out.println("not palindrome");
    }
}