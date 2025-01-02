class Solution(object):
    def vowelStrings(self, words, queries):
        """
        :type words: List[str]
        :type queries: List[List[int]]
        :rtype: List[int]
        """
        vowels = {'a', 'e', 'i', 'o', 'u'}

        presum = [0]
        for word in words:
            presum.append(presum[-1] + (1 if word[0] in vowels and word[-1] in vowels else 0))
        
        return [presum[end + 1] - presum[start] for start, end in queries]

        