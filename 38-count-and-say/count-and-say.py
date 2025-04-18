class Solution(object):
    def countAndSay(self, n):
        """
        :type n: int
        :rtype: str
        """
        s = '1'

        for i in range(n - 1):
            tmp = ''
            cnt = 1
            for j in range(len(s) - 1):
                if s[j] == s[j + 1]:
                    cnt += 1
                else:
                    tmp += str(cnt) + s[j]
                    cnt = 1
            tmp += str(cnt) + s[-1]
            s = tmp

        return s
