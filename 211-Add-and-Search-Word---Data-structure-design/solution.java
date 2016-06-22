public class WordDictionary {
    public class TrieNode{
        TrieNode[] children = new TrieNode[26];
        String item="";
    }
    
    TrieNode root = new TrieNode();
    
    // Adds a word into the data structure.
    public void addWord(String word) {
        TrieNode node = root;
        char[] words = word.toCharArray();
        for (char c: words){
            if (node.children[c-'a'] == null){
                node.children[c-'a']=new TrieNode();
            }
            node = node.children[c-'a'];
        }
        node.item = word;
    }

    // Returns if the word is in the data structure. A word could
    // contain the dot character '.' to represent any one letter.
    public boolean search(String word) {
        return helper(word,root,0);
    }
    
    public boolean helper(String word, TrieNode node, int k){
        char[] words = word.toCharArray();
        if (k==words.length) return !node.item.equals("");
        if (words[k]!='.'){
            return node.children[words[k]-'a']!=null && helper(word,node.children[words[k]-'a'],k+1);
        }
        else{
            for (int i=0; i<26; i++){
                if (node.children[i] != null && helper(word,node.children[i],k+1)) return true;
            }
        }
        return false;
    }
}

// Your WordDictionary object will be instantiated and called as such:
// WordDictionary wordDictionary = new WordDictionary();
// wordDictionary.addWord("word");
// wordDictionary.search("pattern");