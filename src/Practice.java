import javax.swing.*;
import java.util.Arrays;

public class Practice {

    private boolean isPalindromeOption1(String word){
        String newWord = new StringBuffer(word).reverse().toString();
        if(word.equals(newWord)){
            return true;
        }
        return false;
    }

    private boolean isPalindromeOption2(String word){
        String reverse = "";
        for(int i = word.length() -1; i>=0; i--){
            reverse = reverse + word.charAt(i);
        }
        return (word.equals(reverse));
    }

    private boolean isPalindromeOption3(String word){
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) != word.charAt(word.length()-1-i)) {
                return false;
            }
            return true;
        }
        return false;
    }

    private boolean isAnagram(String word1, String word2){
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();

        if(word1.length() != word2.length()){
            return false;
        }
        char[] wordArray1 = word1.toCharArray();
        char[] wordArray2 = word2.toCharArray();

        Arrays.sort(wordArray1);
        Arrays.sort(wordArray2);

        if(Arrays.equals(wordArray1, wordArray2)){
            return true;
        }
        //linea 45, 46, 47 se puede simplificar a return Arrays.equals(wordArray1, wordArray2)
        return false;
    }

    public void wordValidator(){
        String word = JOptionPane.showInputDialog("Ingrese la palabra a comparar");
        boolean result = isPalindromeOption1(word);
        boolean result2 = isPalindromeOption2(word);
        boolean result3 = isPalindromeOption3(word);
        if(!(result && result2 && result3)){
            JOptionPane.showMessageDialog(null, "No es Palindromo");
            return;
        }
        if(result){
            JOptionPane.showMessageDialog(null, "Es palindromo option1");
        }
        if(result2){
            JOptionPane.showMessageDialog(null, "Es palindromo option2");
        }
        if(result3){
            JOptionPane.showMessageDialog(null, "Es palindromo option3");
        }

    }

    public static void main(String args[]){
        Practice practice = new Practice();
        practice.wordValidator();
        JOptionPane.showMessageDialog(null,practice.isAnagram("Race", "Care"));
        System.exit(0);
    }
}
