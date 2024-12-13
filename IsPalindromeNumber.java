public class IsPalindromeNumber {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        //12321
        int liser = 0;//0
        int limen = s.length() - 1;//5-1 = 4
        //      0    <   4
        //      1    <   3
        //      2    <   2 condition de sortie
        while (liser < limen) {
            //Compare characters
            if (s.charAt(liser) != s.charAt(limen)) {
                return false;
            }
            liser++;
            limen--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "12321";
        IsPalindrome isPalindrome = new IsPalindrome();
        boolean result = isPalindrome.isPalindrome(s);
        System.out.println(result); // true
    }
}

