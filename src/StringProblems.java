public class StringProblems {

    //check whether the targer is the substring or not
    boolean subString(String s, String tar) {
        int count = 0;
        int id = 0;
        while ((id = s.indexOf(tar, id)) != -1) {
            count = count + 1;
            id = id + tar.length();
        }
        if (count > 0) {
            System.out.println(count);
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {

        String name = "Charanar";
        String target = "ar";
        StringProblems sb = new StringProblems();
        System.out.println(sb.subString(name, target));


    }
}
