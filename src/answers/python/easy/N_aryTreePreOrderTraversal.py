from typing import List, Optional

class N_aryTreePreOrderTraversal:
    def preorder(self, root: 'Node') -> List[int]:
        preOrderList = []
        def dfs(node: 'Node'):
            if not node:
                return []
            preOrderList.append(node.val)
            for c in node.children: # type: ignore
                dfs(c)
        dfs(root)        
        return preOrderList
        

class Node:
    def __init__(self, val: Optional[int] = None, children: Optional[List['Node']] = None):
        self.val = val
        self.children = children