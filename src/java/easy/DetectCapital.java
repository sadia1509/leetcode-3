package src.

public class DetectCapital {
    public boolean detectCapitalUse(String word) {
        int capitalCount = 0;
        for (char w : word.toCharArray()) {
            if (Character.isUpperCase(w)) {
                capitalCount++;
            }
        }
        if (capitalCount == 0 // case 1 : all are not capitals
                || capitalCount == 1 && Character.isUpperCase(word.charAt(0)) // case 2 : only 1st latter is capital
                || capitalCount == word.length() // case 3 : all capitals
        ) {
            return true;
        } else {
            return false;
        }
    }
}