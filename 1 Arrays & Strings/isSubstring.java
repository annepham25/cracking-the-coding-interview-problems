// checks if one word is a substring of another
public static boolean isSubstring(String str1, String str2) {
    return ((str1.length() == str2.length()) && ((str1 + str1).contains(str2)));
}
