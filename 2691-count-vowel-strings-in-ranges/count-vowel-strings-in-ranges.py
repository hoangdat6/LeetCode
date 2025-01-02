class Solution(object):
    def vowelStrings(self, words, queries):
        """
        :type words: List[str]
        :type queries: List[List[int]]
        :rtype: List[int]
        """
        vowels = {'a', 'e', 'i', 'o', 'u'}

        n = len(words)
        presum = [0] * (n + 1)
        for i in range(n):
            if words[i][0] in vowels and words[i][-1] in vowels:
                presum[i + 1] = presum[i] + 1
            else:
                presum[i + 1] = presum[i]
        
        return [presum[end + 1] - presum[start] for start, end in queries]

        