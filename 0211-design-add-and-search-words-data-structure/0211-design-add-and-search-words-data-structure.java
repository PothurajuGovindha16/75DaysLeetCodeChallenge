import java.util.*;

class WordDictionary {

    private Map<Integer, List<String>> map;

    public WordDictionary() {
        map = new HashMap<>();
    }

    public void addWord(String word) {
        int len = word.length();
        map.putIfAbsent(len, new ArrayList<>());
        map.get(len).add(word);
    }

    public boolean search(String word) {
        int len = word.length();

        if (!map.containsKey(len)) return false;

        List<String> list = map.get(len);

        for (String candidate : list) {
            if (match(candidate, word)) {
                return true;
            }
        }

        return false;
    }

    private boolean match(String candidate, String word) {
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch != '.' && ch != candidate.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}