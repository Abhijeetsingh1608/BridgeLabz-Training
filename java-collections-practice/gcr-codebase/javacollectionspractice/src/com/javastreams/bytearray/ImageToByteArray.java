package com.javastreams.bytearray;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ImageToByteArray {

    public static byte[] convertImageToBytes(String imagePath) throws IOException {

        FileInputStream fis = new FileInputStream(imagePath);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        byte[] buffer = new byte[1024];
        int bytesRead;

        while ((bytesRead = fis.read(buffer)) != -1) {
            baos.write(buffer, 0, bytesRead);
        }

        fis.close();
        return baos.toByteArray();
    }
}
