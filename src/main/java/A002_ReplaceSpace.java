package main.java;

public class A002_ReplaceSpace {
    public String replaceSpace(StringBuffer str) {
        char[] chars = str.toString().toCharArray();
        StringBuilder res = new StringBuilder();
        for(char c: chars){
            if(c == ' '){
                res.append("%20");
            }else{
                res.append(c);
            }
        }
        return res.toString();
    }
}
