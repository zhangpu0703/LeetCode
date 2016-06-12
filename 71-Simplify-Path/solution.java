public class Solution {
    public String simplifyPath(String path) {
        List<String> list = new ArrayList<String>();
        String[] strs = path.split("/");
        for (String str : strs){
            if (str.equals("..") && list.size() > 0) list.remove(list.size()-1);
            else if (str.equals("..") || str.equals(".")|| str.equals("")) continue;
            else list.add(str);
        }
        
        StringBuilder res = new StringBuilder();
        if (list.size()==0) return "/";
        for (int i = 0; i<list.size(); i++){
            res.append('/');
            res.append(list.get(i));
        }
        return res.toString();
        
    }
}