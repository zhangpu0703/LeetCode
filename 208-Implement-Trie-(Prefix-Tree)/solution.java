class TrieNode {
    // Initialize your data structure here.
    String data;
    TrieNode[] children;
    public TrieNode() {
        children = new TrieNode[26];
        data = "";
    }
}

public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // Inserts a word into the trie.
    public void insert(String word) {
        TrieNode node = root;
        for(int i=0; i<word.length(); i++){
            if (node.children[word.charAt(i)-'a'] == null) node.children[word.charAt(i)-'a'] = new TrieNode();
            node = node.children[word.charAt(i)-'a'];
        }
        node.data = word;
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
        TrieNode node = root;
        for (int i = 0; i<word.length(); i++){
            if (node.children[word.charAt(i)-'a']==null) return false;
            else node = node.children[word.charAt(i)-'a'];
        }
        return word.equals(node.data);
    }

    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for (int i = 0; i<prefix.length(); i++){
            if (node.children[prefix.charAt(i)-'a']==null) return false;
            else node = node.children[prefix.charAt(i)-'a'];
        }
        return true;
    }
}

// Your Trie object will be instantiated and called as such:
// Trie trie = new Trie();
// trie.insert("somestring");
// trie.search("key");