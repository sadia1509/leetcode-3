class DetectCapital:
    def detectCapitalUse(self, word: str) -> bool:
        capitalCount = 0
        for w in word:
            if w.isupper():
                capitalCount += 1
        if (capitalCount == 0 # case 1 : all are not capitals
            or capitalCount == 1 and word[0].isupper() # case 2 : only 1st latter is capital
            or capitalCount == len(word)): # case 3 : all capitals
            return True
        else:
            return False