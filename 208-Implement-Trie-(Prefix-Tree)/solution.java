class TrieNode {
    // Initialize your data structure here.
    TrieNode[] childnode;
    String item;
    public TrieNode() {
        childnode = new TrieNode[26];
        item="";
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
        for (int i=0; i<word.length(); i++){
            char c = word.charAt(i);
            if (node.childnode[c-'a']==null){
                node.childnode[c-'a']=new TrieNode();
            }
            node=node.childnode[c-'a'];
        }
        node.item = word;
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
        TrieNode node=root;
        for(int i=0; i<word.length(); i++){
            char c = word.charAt(i);
            if (node.childnode[c-'a']==null) return false;
            node=node.childnode[c-'a'];
        }
        return node.item.equals(word);
    }

    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
        TrieNode node=root;
        for(int i=0; i<prefix.length(); i++){
            char c = prefix.charAt(i);
            if (node.childnode[c-'a']==null) return false;
            node=node.childnode[c-'a'];
        }
        return true;
    }
}

// Your Trie object will be instantiated and called as such:
// Trie trie = new Trie();
// trie.insert("somestring");
// trie.search("key");