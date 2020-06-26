class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if(n <= 1)
            return Collections.singletonList(0);
        Set<Integer> adj[] = new Set[n];
        for(int i = 0; i < n; ++i)
            adj[i] = new HashSet<>();
        for(int a[] : edges) {
            adj[a[0]].add(a[1]);
            adj[a[1]].add(a[0]);
        }
        var leaves = new ArrayList<Integer>();
        for(int i = 0; i < n; ++i)
            if(adj[i].size() == 1)
                leaves.add(i);
        while(n > 2) {
            n -= leaves.size();
            var newLeaves = new ArrayList<Integer>();
            for(int i : leaves) {
                int j = adj[i].iterator().next();   // :( since I used HashSet
                adj[j].remove(i);
                if(adj[j].size() == 1)
                    newLeaves.add(j);
            }
            leaves = newLeaves;
        }
        return leaves;
    }
}
