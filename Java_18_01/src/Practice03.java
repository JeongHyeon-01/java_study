public class Practice03 {
    public static String soultion(char[] str, char[] find, char[] to) {
        int idx = 0;
        String replaceStr = "";
        char[] relaceBucket = str.clone();


        do {
            idx = findIndex(relaceBucket, find);
            if (idx != -1){
                for (int i =0; i<idx;i++){
                    replaceStr += relaceBucket[i];
                }
                for(int i=0; i< to.length; i++){
                    replaceStr += to[i];
                }
                for(int i =idx+ find.length; i<relaceBucket.length; i++){
                    replaceStr +=relaceBucket[i];
                }
                relaceBucket = replaceStr.toCharArray();
                replaceStr = "";
            }
        }while (idx != -1);
        replaceStr = new String(relaceBucket);
        return replaceStr;
    };
    public static int findIndex(char[] str, char[] find) {
        int idx = -1;
        boolean isMatch = false;

        for(int i = 0; i<str.length;i++){
            if(str[i] == find[0] && str.length-i >= find.length){
                isMatch= true;
                for(int j=1; j<find.length;j++){
                    if(str[i + j] != find[j]){
                        isMatch = false;
                        break;
                    }
                }
            }
            if(isMatch){
                idx = i;
                break;
            }
        }
        return idx;
    }

    public static void main(String[] args) {
        String str = "Hello Java, Nice to meet you! Java is fun!";
        String find = "Java";
        String to = "자바";

        char[] strExArr = str.toCharArray();
        char[] findArr = find.toCharArray();
        char[] toArr = to.toCharArray();

        System.out.println(soultion(strExArr, findArr, toArr));
    }
}
