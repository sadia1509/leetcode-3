export function detectCapitalUse(word: string): boolean {
    let capitalCount: number = 0;
    for (const ch of word) {
        if (ch === ch.toUpperCase()) {
            capitalCount++;
        }
    }
    if (capitalCount == 0 // case 1 : all are not capitals
        || capitalCount == 1 && word.charAt(0) === word.charAt(0).toUpperCase() // case 2 : only 1st latter is capital
        || capitalCount == word.length // case 3 : all capitals
    ) {
        return true;
    } else {
        return false;
    }
};