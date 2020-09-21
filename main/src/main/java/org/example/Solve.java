package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Solve {
    public static void solve(String FilePath1, String FilePath2, String OutputPath) {
        String s1 = TextToString.textToString(FilePath1);
        String s2 = TextToString.textToString(FilePath2);
        double ans;
        ans = SimHash.getAns(s1, s2);
        // 将答案输出到文件中
        try {
            File file = new File(OutputPath);
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fileWriter = new FileWriter(file.getAbsoluteFile(), true);
            fileWriter.write(String.format("%.2f", ans));
            fileWriter.write('\n');
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
