package implementation.medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaRegex {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String ip = bufferedReader.readLine();
        while (ip != null) {
            System.out.println(isValidIp(ip));
            ip = bufferedReader.readLine();
        }

        bufferedReader.close();



//        Scanner in = new Scanner(System.in);
//        while(in.hasNext()) {
//            String ip = in.next();
//            System.out.println(isValidIp(ip));
////            System.out.println(ip.matches(new MyRegex().pattern)); // 정규식 사용 답안
//        }
    }

    private static boolean isValidIp(String ip) {

        String[] ipArr = ip.split("\\.");

        if (ipArr.length != 4) return false;

        for (String nStr : ipArr) {
            int n = Integer.parseInt(nStr);
            if (nStr.length() < 1 || nStr.length() > 3) return false;
            if (n < 0 || n > 255) return false;
        }

        return true;
    }
}

/**
 * 출처 : https://programs.programmingoneonone.com/2021/02/hackerrank-java-regex-solution.html
 */
class MyRegex {

    String ip0to255 = "(\\d{1,2}||(0|1)\\d{2}||2[0-4]\\d||25[0-5])";

    public String pattern = ip0to255 + "\\." + ip0to255 + "\\." + ip0to255 + "\\." + ip0to255;
}