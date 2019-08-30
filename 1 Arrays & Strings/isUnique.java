public static boolean isUnique(String str) {
    Set<Character> currentString = new HashSet<Character>();
    for (int i = 0; i < str.length(); i++) {
        currentString.add(str.charAt(i));
    }
    if (currentString.size() < str.length()) {
        return false;
    }
    return true;
}

public static boolean isUnique2(String str) {
    for (int i = 0; i < str.length(); i++) {
        char current = str.charAt(i);
        for (int j = i + 1; j < str.length() - 1; j++) {
            if (current == str.charAt(j)) {
                return false;
            }
        }
        if (current == str.charAt(str.length() - 1)) {
            return false;
        }

    }

    return true;

}
