class Solution(object):
    def reverseOddLevels(self, root):
        """
        :type root: Optional[TreeNode]
        :rtype: Optional[TreeNode]
        """
        if not root:
            return None

        queue = [root]
        visited = []

        while queue:
            current_node = queue.pop(0)
            if current_node:
                visited.append(current_node)
                if current_node.left:
                    queue.append(current_node.left)
                if current_node.right:
                    queue.append(current_node.right)

        level = 1
        for i in range(0, len(visited)):
            if i == 2 ** level - 1:
                nodes = visited[i:2 ** (level + 1) - 1]

                for j in range(0, len(nodes) // 2):
                    nodes[j].val, nodes[-j - 1].val = nodes[-j - 1].val, nodes[j].val

                level += 2

        return root