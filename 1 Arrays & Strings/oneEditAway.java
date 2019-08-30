// checks if the second string is one edit (or zero edit) away from first string
  public static boolean oneEditAway(String str1, String str2) {
      String string1 = str1.toLowerCase();
      String string2 = str2.toLowerCase();
      if (str1.length() == str2.length()) {
          return checkReplace(string1, string2);
      } else if (str1.length() != str2.length()) {
          return checkEdit(string1, string2);
      }

      return true;
  }

  public static boolean checkReplace(String str1, String str2) {
      int numEdit = 0;
      for (int i = 0; i < str1.length(); i++) {
          if (str1.charAt(i) != str2.charAt(i)) {
              numEdit++;
          }
      }
      return numEdit <= 1;
  }

  public static boolean checkEdit(String str1, String str2) {
      int numEdit = 0;
      int diffLen = str1.length() - str2.length();
      if (Math.abs(diffLen) > 1) {
          return false;
      }
      numEdit++;
      int index = 0;
      while (numEdit <= 1 && (index < str1.length()) && (index < str2.length())) {
          if (str1.charAt(index) != str2.charAt(index)) {
              numEdit++;
          }
      }
      return numEdit <= 1;
  }
