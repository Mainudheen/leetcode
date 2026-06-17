class Solution {

    public String getHint(String secret, String guess) {

        HashMap<Character,Integer> map = new HashMap<>();

        int bulls = 0;
        int cows = 0;

        // Store non-bull guess characters
        for(int i = 0; i < guess.length(); i++) {

            if(secret.charAt(i) != guess.charAt(i)) {

                char ch = guess.charAt(i);

                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }

        for(int i = 0; i < secret.length(); i++) {

            if(secret.charAt(i) == guess.charAt(i)) {

                bulls++;

            } else {

                char ch = secret.charAt(i);

                if(map.getOrDefault(ch, 0) > 0) {

                    cows++;

                    map.put(ch, map.get(ch) - 1);
                }
            }
        }

        return bulls + "A" + cows + "B";
    }
}