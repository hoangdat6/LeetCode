
class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        Trie root = Trie.createTrie(arr1);

        int length2 = arr2.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < length2; i++) {
            max = Math.max(max, longestPrefix(Integer.toString(arr2[i]), root)); 
        }
        return max;
    }

     int longestPrefix(String word, Trie root) { 
        int cnt = 0;
        Trie current = root;
        for (int i = 0; i < word.length(); i++) {
            if (current.getChild(word.charAt(i)) == null) {
                break;
            }
            cnt++;
            current = current.getChild(word.charAt(i));
        }
        return cnt;
    }
}

final class Trie {

    private final static int CHAR_MASK = 0x1F;
    private final Trie[] children = new Trie[10];
    private boolean isWord = false;

    private void addTrie(int num) {
        Trie node = this;
        String s = String.valueOf(num);

        for(char c : s.toCharArray()) {
            int indexChar = c - '0';
            Trie child = node.children[indexChar];

            if(child == null) {
                child = new Trie();
                node.children[indexChar] = child;
            }
            node = child;
        }

        node.isWord = true;
    }

    static Trie createTrie(int[] directory) {
        Trie root = new Trie();

        for(int s : directory) {
            root.addTrie(s);
        }

        return root;
    }

    Trie getChild(char c) {
        return children[c - '0'];
    }

    boolean isWord() {
        return isWord;
    }
}