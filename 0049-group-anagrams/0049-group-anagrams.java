class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        boolean[] arr = new boolean[strs.length];
        List<List<String>> res = new ArrayList<>();
        for(int i=0;i<strs.length;i++)
        {
            if(arr[i]==true) continue;
            List<String> temp = new ArrayList<>();
            String s = strs[i];
            
            temp.add(s);
            arr[i] = true;
            
            for(int j=i+1;j<strs.length;j++)
            {
                if(i!=j && arr[j]!=true)
                {
                    String t = strs[j];
                    int ch = check(s,t);
                    if(ch==0)
                    {
                        arr[j] = true;
                        temp.add(t);
                    }
                }
                else
                {
                    continue;
                }
                
            }
            res.add(temp);
        }
        return res;
    }
    public static int check(String s,String t)
    {
        int[] freq1 = new int[26];
        
        for(int i=0;i<s.length();i++)
        {
            freq1[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++)
        {
            freq1[t.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++)
        {
            if(freq1[i]!=0)
            {
                return 1;
            }
        }
        return 0;
    }
}