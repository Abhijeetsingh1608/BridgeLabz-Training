package com.javastreams.filecopy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedFileCopy {

    private static final int BUFFER_SIZE = 4096;

    public static long copy(String source, String destination) {

        long startTime = System.nanoTime();

        try (BufferedInputStream bis =
                     new BufferedInputStream(new FileInputStream(source), BUFFER_SIZE);
             BufferedOutputStream bos =
                     new BufferedOutputStream(new FileOutputStream(destination), BUFFER_SIZE)) {

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;

            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            System.out.println("Buffered Copy Error: " + e.getMessage());
        }

        long endTime = System.nanoTime();
        return endTime - startTime;
    }
}
