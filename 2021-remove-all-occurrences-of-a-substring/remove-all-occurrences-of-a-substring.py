class Solution:
    def removeOccurrences(self, s: str, part: str) -> str:
        part_len = len(part)
        stack = []
        for c in s:
            stack.append(c)
            if len(stack) >= part_len and "".join(stack[-part_len:]) == part:
                for _ in range(part_len):
                    stack.pop()
            
        return "".join(stack)
                        