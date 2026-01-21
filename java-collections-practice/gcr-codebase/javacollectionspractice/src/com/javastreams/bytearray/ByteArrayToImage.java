package com.javastreams.bytearray;

import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayToImage {

    public static void writeBytesToImage(byte[] imageBytes, String outputPath)
            throws IOException {

        ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
        FileOutputStream fos = new FileOutputStream(outputPath);

        byte[] buffer = new byte[1024];
        int bytesRead;

        while ((bytesRead = bais.read(buffer)) != -1) {
            fos.write(buffer, 0, bytesRead);
        }

        bais.close();
        fos.close();
    }
}
