class Solution:
    def clearDigits(self, s: str) -> str:
        cnt = 0
        ans = ""
        for i in range(len(s) - 1, -1, -1):
            if '0' <= s[i] <= '9':
                cnt += 1
                continue
            if cnt and 'a' <= s[i] <= 'z':
                cnt -= 1
            else:
                ans += s[i]
        return ans[::-1]
