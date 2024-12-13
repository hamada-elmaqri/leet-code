public class IsPalindrome {
    public boolean isPalindrome(String s) {
        //RADAR
        int liser = 0;//0
        int limen = s.length() - 1;//5-1 = 4
        //      0    <   4
        //      1    <   3
        //      2    <   2 condition de sortie
        while (liser < limen) {
            // Ignore non-alphanumeric characters from the left
            if (!Character.isLetterOrDigit(s.charAt(liser))) {
                liser++;
            }
            // Ignore non-alphanumeric characters from the right
            else if (!Character.isLetterOrDigit(s.charAt(limen))) {
                limen--;
            } else {
                // Compare characters and convert to lowercase to handle case sensitivity.
                char c1 = Character.toLowerCase(s.charAt(liser));
                char c2 = Character.toLowerCase(s.charAt(limen));
                if (c1 != c2) {
                    return false;
                }
                liser++;
                limen--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        String s2 = "Race a car";
        IsPalindrome isPalindrome = new IsPalindrome();
        boolean result = isPalindrome.isPalindrome(s);
        boolean result2 = isPalindrome.isPalindrome(s2);
        System.out.println(result); // true
        System.out.println(result2); // false
    }
}

