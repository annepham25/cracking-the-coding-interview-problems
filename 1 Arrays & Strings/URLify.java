public static char[] URLify(String str, int trueLength) {
        char[] ch = str.toCharArray();

        int numSpaces = 0;
        int index = 0;
        int i = 0;

        for (i = 0; i < trueLength; i++) {
            if (ch[i] == ' ') {
                numSpaces++;
            }
        }

        index = trueLength + numSpaces * 2;
        if (trueLength < ch.length) {
            ch[trueLength] = '\0'; // end array
        }

        for (i = trueLength - 1; i >= 0; i--) {
            if (ch[i] == ' ') {
                ch[index - 1] = '0';
                ch[index - 2] = '2';
                ch[index - 3] = '%';
                index = index - 3;
            } else {
                ch[index - 1] = ch[i];
                index--;
            }

            }
        return ch;
    }