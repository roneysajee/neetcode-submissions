class Solution:

    def encode(self, strs: List[str]) -> str:
        str1 = ""
        if len(strs)==0:
            return str1
        for i in strs:
            str1 += (str(len(i)) + "#" + i)
  
        return str1

    def decode(self, s: str) -> List[str]:
        i = 0
        ret = []
        while i < len(s):
            j = i
            while s[j] != '#':
                j += 1
            length = int(s[i:j])        
            j += 1                      
            word = s[j:j+length]        
            ret.append(word)
            i = j + length
        return ret

        

