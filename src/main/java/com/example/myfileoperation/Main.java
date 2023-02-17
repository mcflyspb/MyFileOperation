package com.example.myfileoperation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class Main {

    import java.io.*;


    public class FileOperation {

        // 1 read
        data = Files.readString(Path.of("file"));


        // 1 write out = filename, печать на экран или в файл.
        PrintStream printStream = out == null ? System.out : new PrintStream(out);

        for (char c : data.toCharArray()) {
            c = (char) (c + key);
            printStream.print(c);
        }

        public static String readMessageFromFile(String inFile) throws Exception {
            try (BufferedReader br = new BufferedReader(new FileReader(inFile))) {
                StringBuilder sb = new StringBuilder();
                return br.readLine();
            } catch (Exception e) {
                throw new Exception(e);
            }
        }

        public static void writeResultToFile(char[] result, String outFile) throws Exception {
            try (PrintWriter writer = new PrintWriter(outFile, "UTF-8")) {
                writer.print(result);
            } catch (Exception e) {
                throw new Exception(e);
            }
        }
    }

}
