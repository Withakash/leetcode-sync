class Solution {
    public int numberOfSpecialChars(String word) {
        HashMap<Character, Boolean> flag = new HashMap<>();

        for (char ch : word.toCharArray()) {
            flag.put(ch, true);
        }

        int count = 0;

        for (char ch = 'a'; ch <= 'z'; ch++) {

            // lowercase + uppercase both present
            if (flag.containsKey(ch) &&
                    flag.containsKey(Character.toUpperCase(ch))) {

                count++;
            }
        }

        return count;
    }
}
