// given two strings, write a method to decide if one is a permutation of the other
public static boolean permutation(String str1, String str2) {
    if (str1.length() != str2.length()) {
        return false;
    }

    return sort(str1).equals(sort(str2));
}

public static String sort(String str) {
    char[] word = str.toCharArray();
    java.util.Arrays.sort(word);
    return new String(word);
}

public static boolean permutation2(String str1, String str2) {
    if (str1.length() != str2.length()) {
        return false;
    }

    int[] letters = new int[128]    // assuming ASCII

    for (int i = 0; i < str1.length(); i++) {
        letters[str1.charAt(i)]++;
    }

    for (int i = 0; i < str2.length(); i++) {
        letters[str2.charAt(i)]--;
        if (letters[str2.charAt(i)] < 0) {
            return false;
        }
    }
    return true;
}
