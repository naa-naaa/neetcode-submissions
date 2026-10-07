class Solution {
    public boolean isPalindrome(String s) {
        String clean = "";
        for (int i = 0; i < s.length(); i++) {
    char ch = s.charAt(i);

    if (Character.isLetterOrDigit(ch)) {
        clean += ch;
    }
}
        String rev = new StringBuilder(clean).reverse().toString();

        if(rev.equalsIgnoreCase(clean)){
            return true;
        }
        return false;
    }
}
