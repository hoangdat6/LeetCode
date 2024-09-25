class Solution {

    public static int minExtraChar(String s, String[] dictionary) {
        Trie root = Trie.createTrie(dictionary);
        int length = s.length();
        int[] table = new int[length + 1];

        for(int i = length - 1; i >= 0; i--) {
            table[i] = minExtraCharAt(s, length, dictionary , i, table, root);
        }

        return table[0];
    }

    private static int minExtraCharAt(String s, int length, String[] dictionary, int i, int[] table, Trie node) {
        int opt = 1 + table[i + 1];
        int index = i;

        while(index < length) {
            char c = s.charAt(index++);

            node = node.getChild(c);

            if(node == null) {
                break;
            }

            if(!node.isWord()) {
                continue;
            }

            opt = Math.min(opt, table[index]);
        }
        return opt;
    }
}

final class Trie {

    private final static int CHAR_MASK = 0x1F;
    private final Trie[] children = new Trie[27];
    private boolean isWord = false;

    private void addTrie(String s) {
        Trie node = this;

        for(char c : s.toCharArray()) {
            int indexChar = c & CHAR_MASK;
            Trie child = node.children[indexChar];

            if(child == null) {
                child = new Trie();
                node.children[indexChar] = child;
            }
            node = child;
        }

        node.isWord = true;
    }

    static Trie createTrie(String[] directory) {
        Trie root = new Trie();

        for(String s : directory) {
            root.addTrie(s);
        }

        return root;
    }

    Trie getChild(char c) {
        return children[c & CHAR_MASK];
    }

    boolean isWord() {
        return isWord;
    }
}