class Solution {
    public int characterReplacement(String s, int k) {
        int[] occurance=new int[26];
        int left=0, right=0;
        int ans=0;
        int maxOccurance=0;
        for(; right<s.length(); right++){
            maxOccurance=Math.max(maxOccurance, ++occurance[s.charAt(right)-'A']);
            if(right-left+1-maxOccurance>k){
                occurance[s.charAt(left)-'A']--;
                left++;
            }
            ans=Math.max(ans, right-left+1);
        }
        return ans;
    }
}