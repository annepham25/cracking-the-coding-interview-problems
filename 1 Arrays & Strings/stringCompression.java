// basic string compression using the counts of the repeated characters
  public static String stringCompression(String str1) {
      if (str1.length() <= 2) {
          return str1;
      }
      int count = 1;
      char letter = str1.charAt(0);
      String result = "";
      for (int i = 1; i < str1.length(); i++) {
          if (str1.charAt(i) == letter) {
              count++;
          } else {
              result += Character.toString(letter);
              result += Integer.toString(count);
              letter = str1.charAt(i);
              count = 1;
          }
          if (i == (str1.length() - 1)) {
              result += Character.toString(letter);
              result += Integer.toString(count);
          }
      }
      return result;
  }
