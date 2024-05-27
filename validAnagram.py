class Solution:
    def isAnagram(self, s: str, t: str) -> bool:

        if (len(s) != len(t)):
            return False

        lettersWordOne, lettersWordTwo = {}, {}

        for lettersOne in s:
            if lettersOne in lettersWordOne:
                lettersWordOne[lettersOne] += 1
            else:
                lettersWordOne[lettersOne] = 1
        
        for lettersTwo in t:
            if lettersTwo in lettersWordTwo:
                lettersWordTwo[lettersTwo] += 1
            else:
                lettersWordTwo[lettersTwo] = 1

        for letter in lettersWordOne.keys():
            if (letter not in lettersWordTwo.keys()):
                return False

            if (lettersWordOne[letter] != lettersWordTwo[letter]):
                return False
        
        return True