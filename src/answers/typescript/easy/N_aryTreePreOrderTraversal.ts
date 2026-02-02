export function preorder(root: _Node | null): number[] {
    const preOrderList: number[] = [];
    function dfs(n: _Node | null) {
        if (!n) return;
        preOrderList.push(n.val);
        for (const c of n.children) {
            dfs(c);
        }
    }
    dfs(root);
    return preOrderList;
};

class _Node {
    val: number
    children: _Node[]

    constructor(val?: number, children?: _Node[]) {
        this.val = (val === undefined ? 0 : val)
        this.children = (children === undefined ? [] : children)
    }
}