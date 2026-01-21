package com.javastreams.filecopy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class UnbufferedFileCopy {

    private static final int BUFFER_SIZE = 4096;

    public static long copy(String source, String destination) {

        long startTime = System.nanoTime();

        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(destination)) {

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            System.out.println("Unbuffered Copy Error: " + e.getMessage());
        }

        long endTime = System.nanoTime();
        return endTime - startTime;
    }
}
