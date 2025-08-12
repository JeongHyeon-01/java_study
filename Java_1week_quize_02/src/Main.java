public class Main {
    public static void main(String[] args) {
        int[] counts = new int[26];

        //파일을 읽어옴
        String filePath = "/Users/jeonghyeonhwang/Desktop/java_study/Java_1week_quize_02/src/example.txt";
        FileUtils utils = new FileUtils();
        String text = utils.getLoadText(filePath);

        //읽어온것을 분류
        String normalized = text.trim().toUpperCase();
        int total_length = normalized.length();
        //결과값
        for (int i = 0; i < total_length; i++) {
            char ch = normalized.charAt(i);
            if (ch>='A' && ch <='Z') {
                counts[ch-'A']++;
            }
        }
        //출력
        for (int i = 0; i < 26; i++) {
            if (counts[i] > 0) {
                double pct = (counts[i] * 100.0) / total_length;
                System.out.printf("%c = %d개, %.2f%%%n", (char)('A' + i), counts[i], pct);
            }
        }
    }
}