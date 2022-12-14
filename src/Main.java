import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {

        inputScanner(); // 입력값을 콘솔에 공백으로 구분하여 입력
        inputBufferReader(); // 입력값을 콘솔에 줄바꿈으로 구분하여 입력


        scanner.close();
        br.close();
        bw.close();
    }

    static void inputScanner() {
        int n = scanner.nextInt();
        String s = scanner.nextLine();

        System.out.println("Scanner 입력값 : " + n + ", " + s);
    }

    static void inputBufferReader() throws Exception {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        String s = st.nextToken();

        bw.write("Scanner 입력값 : " + n + ", " + s);
        bw.newLine();
    }
}