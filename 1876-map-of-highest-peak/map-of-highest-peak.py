class Solution:
    def highestPeak(self, isWater: List[List[int]]) -> List[List[int]]:
        n = len(isWater)
        m = len(isWater[0])
        ans = [[-1] * m for i in range(n)]
        queue = []

        for i in range(0, n):
            for j in range(0, m):
                if isWater[i][j] == 1:
                    ans[i][j] = 0
                    queue.append([i, j])

        directions = [[-1, 0], [0, 1], [1, 0], [0, -1]]

        while queue:
            cell = queue.pop(0)

            x = cell[0]
            y = cell[1]

            for dir in directions:
                nx = x + dir[0]
                ny = y + dir[1]

                if nx >= 0 and nx < n and ny >= 0 and ny < m and ans[nx][ny] == -1:
                    ans[nx][ny] = ans[x][y] + 1
                    queue.append([nx, ny])

        return ans

            