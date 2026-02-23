class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        boolean id = false;
        boolean pw = false;
        for(int i=0;i<db.length;i++){
            if(db[i][0].equals(id_pw[0])){
                 if(db[i][1].equals(id_pw[1])){
                     id = true;
                     pw = true;
                 }
                 else id = true;
            }
        }
        if(id&&pw) return "login";
        else if(id&&!pw) return "wrong pw";
        else return "fail";
    }
}