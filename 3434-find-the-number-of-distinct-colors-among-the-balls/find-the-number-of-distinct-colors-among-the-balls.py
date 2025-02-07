class Solution:
    def queryResults(self, limit: int, queries: List[List[int]]) -> List[int]:
        n = len(queries)

        ball_map = dict()
        freq_map = dict()

        result = [0] * n
        for i, [ball, clr] in enumerate(queries):
            if ball in ball_map:
                old_color = ball_map[ball]
                freq_map[old_color] -= 1
                if freq_map[old_color] == 0:
                    del freq_map[old_color]
            ball_map[ball] = clr
            freq_map[clr] = freq_map.get(clr, 0) + 1
            result[i] = len(freq_map)

        return result