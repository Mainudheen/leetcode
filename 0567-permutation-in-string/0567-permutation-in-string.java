class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length())
            return false;

        int[] original = new int[26];

        for (char ch : s1.toCharArray()) {
            original[ch - 'a']++;
        }

        for (int start = 0; start <= s2.length() - s1.length(); start++) {

            int[] freq = original.clone();
            int count = s1.length();

            int i = start;

            while (i < s2.length()) {

                char ch = s2.charAt(i);

                if (freq[ch - 'a'] == 0)
                    break;

                freq[ch - 'a']--;
                count--;

                if (count == 0)
                    return true;

                i++;
            }
        }

        return false;
    }
}