public class Lenoflastword{

    // This code finds the length of the last word in a string
    public static int lengthOfLastWord(String s) {
        int length = 0;
        boolean foundChar = false;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                foundChar = true;
                length++;
            } else if (foundChar) {
                break; // Stop counting when we hit a space after finding the last word
            }
        }
        return length;
    }
    public static void main(String[] args) {
        String s = "Hello World";
        int result = lengthOfLastWord(s);
        System.out.println("Length of the last word: " + result); // Output: 5
    }
}