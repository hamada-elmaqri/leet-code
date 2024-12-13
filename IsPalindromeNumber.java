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
        String s = "A man, a plan, a canal: Panama";
        String s2 = "Race a car";
        IsPalindrome isPalindrome = new IsPalindrome();
        boolean result = isPalindrome.isPalindrome(s);
        boolean result2 = isPalindrome.isPalindrome(s2);
        System.out.println(result); // true
        System.out.println(result2); // false
    }
}

