package org.example;

import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public class MainWithExamples {

    public static void main(String[] args) throws IOException {

        URL resource = Main.class.getResource("/test.txt");
        System.out.println(resource.toString());

        File file = new File("/home/rafal/IdeaProjects/FilesException/src/main/resources/test.txt");
        file.createNewFile();

        InputStream inputStream = new FileInputStream(file);
        OutputStream outputStream = new FileOutputStream(file, false);

        String helloWorld = "Hello World2";
        outputStream.write(helloWorld.getBytes(StandardCharsets.UTF_8));

        int character = inputStream.read();

        while (character != -1) {
            System.out.print((char)character);
            character = inputStream.read();
        }

        System.out.println(Files.readString(file.toPath()));


    }
}