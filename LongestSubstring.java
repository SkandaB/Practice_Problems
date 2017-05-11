public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() <=1) return s.length();
        
        int longest = 0, prev_char = 0, curr_char = 0;
        HashSet<Character> curr_set = new HashSet<Character>();
        
        while(curr_char < s.length()) {
            if(curr_set.contains(s.charAt(curr_char))) {
                curr_set.remove(s.charAt(prev_char++));
            } else {
                curr_set.add(s.charAt(curr_char++));
                longest = Math.max(longest,curr_set.size());
            }
        }
        return longest;
    }
}
