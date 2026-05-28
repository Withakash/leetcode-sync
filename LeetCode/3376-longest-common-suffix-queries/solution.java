class Solution {

    class TrieNode {
        TrieNode[] child = new TrieNode[26];
        int idx = -1;
    }

    TrieNode root = new TrieNode();

    String[] wordsContainer;

    public int[] stringIndices(String[] wordsContainer, String[] wordsQuery) {

        this.wordsContainer = wordsContainer;

        for (int i = 0; i < wordsContainer.length; i++) {
            insert(wordsContainer[i], i);
        }

        int[] ans = new int[wordsQuery.length];

        for (int i = 0; i < wordsQuery.length; i++) {
            ans[i] = search(wordsQuery[i]);
        }

        return ans;
    }

    private void insert(String word, int index) {

        TrieNode node = root;

        update(node, index);

        for (int i = word.length() - 1; i >= 0; i--) {

            int id = word.charAt(i) - 'a';

            if (node.child[id] == null) {
                node.child[id] = new TrieNode();
            }

            node = node.child[id];

            update(node, index);
        }
    }

    private int search(String query) {

        TrieNode node = root;

        for (int i = query.length() - 1; i >= 0; i--) {

            int id = query.charAt(i) - 'a';

            if (node.child[id] == null) {
                break;
            }

            node = node.child[id];
        }

        return node.idx;
    }

    private void update(TrieNode node, int index) {

        if (node.idx == -1) {
            node.idx = index;
            return;
        }

        String curr = wordsContainer[index];
        String best = wordsContainer[node.idx];

        // smaller length preferred
        if (curr.length() < best.length()) {
            node.idx = index;
        }

        // if same length, smaller index preferred
        else if (curr.length() == best.length()
                && index < node.idx) {

            node.idx = index;
        }
    }
}
