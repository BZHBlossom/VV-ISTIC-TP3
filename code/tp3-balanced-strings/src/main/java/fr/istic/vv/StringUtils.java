package fr.istic.vv;

public class StringUtils {

    private StringUtils() {
    }

    public static boolean isBalanced(String str) {
        char[] tabChar = str.toCharArray();
        int nbOpenAcc = 0;
        int nbOpenPar = 0;
        int nbOpenCroch = 0;
        for (int i = 0; i < str.length(); i++) {
            char currentChar = tabChar[i];
            if (currentChar == '{') nbOpenAcc++;
            else if (currentChar == '(') nbOpenPar++;
            else if (currentChar == '[') nbOpenCroch++;
            else if (currentChar == '}') {
                if (nbOpenAcc <= 0) return false;
                else nbOpenAcc--;
            } else if (currentChar == ')') {
                if (nbOpenPar <= 0) return false;
                else nbOpenPar--;
            } else if (currentChar == ']') {
                if (nbOpenCroch <= 0) return false;
                else nbOpenCroch--;
            }
        }
        return nbOpenAcc == 0 && nbOpenPar == 0 && nbOpenCroch == 0;
    }

}
