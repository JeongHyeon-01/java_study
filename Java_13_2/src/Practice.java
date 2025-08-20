import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Practice  {
    public static void main(String[] args) throws IOException {
        String inputFle = "./JamesArthurGosling.txt";
        String outputFile = "./JamesArthurGosling_edit.txt";


        //찾을단어 -> 변경단어
        System.out.print("찾을 단어 : ");
        Scanner sc = new Scanner(System.in);
        String find = sc.nextLine();
        System.out.print("변경 단어 : ");
        String to = sc.nextLine();

        //파일읽기 찾을단어 -> 변경단어 새로 파일
        BufferedReader br = new BufferedReader(new FileReader(inputFle));

        FileWriter fw = new FileWriter(outputFile);

        while (true) {
            String line = br.readLine();
            if (line == null) {
                break;
            }
            String newLine = line.replace(find, to);
            fw.write(newLine +'\n');
        }
        br.close();
        fw.close();
    }
}
