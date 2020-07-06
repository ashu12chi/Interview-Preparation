class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        HashMap<String, HashMap<String, Double>> adj = new HashMap<>();
        int i = 0;
        for(List<String> eq : equations) {
            adj.putIfAbsent(eq.get(0), new HashMap<>());
            adj.putIfAbsent(eq.get(1), new HashMap<>());
            adj.get(eq.get(0)).put(eq.get(1), values[i]);
            adj.get(eq.get(1)).put(eq.get(0), 1.0 / values[i++]);
        }
        double ans[] = new double[queries.size()];
        i = 0;
        for(List<String> q : queries)
            ans[i++] = solve(adj, q.get(0), q.get(1), 1, new HashSet<>());
        return ans;
    }
    
    private double solve(HashMap<String, HashMap<String, Double>> adj, String a, String b, double product, HashSet<String> visited) {
        if(!adj.containsKey(a) || visited.contains(a))
            return -1;
        visited.add(a);
        if(a.equals(b))
            return product;
        HashMap<String, Double> conn = adj.get(a);
        for(String c : conn.keySet()) {
            double ans = solve(adj, c, b, product * conn.get(c), visited);
            if(ans != -1)
                return ans;
        }
        return -1;
    }
}
