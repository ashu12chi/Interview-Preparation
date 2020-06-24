class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        int n = words.length, len = pattern.length();
        List<String> ans = new ArrayList<>();
        for(int i = 0; i < n; ++i) {
            HashMap<Character, Character> map = new HashMap<>();
            HashSet<Character> used = new HashSet<>();
            char c1, c2;
            boolean yes = true;
            for(int j = 0; j < len; ++j) {
                c1 = pattern.charAt(j);
                c2 = words[i].charAt(j);
                if(map.containsKey(c2)) {
                    if(map.get(c2) != c1) {
                        yes = false;
                        break;
                    }
                } else {
                    if(!used.contains(c1)) {
                        map.put(c2, c1);
                        used.add(c1);
                    } else {
                        yes = false;
                        break;
                    }
                }
            }
            if(yes)
                ans.add(words[i]);
        }
        return ans;
    }
}
