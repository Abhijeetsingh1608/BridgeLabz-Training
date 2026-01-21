package com.javastreams.filehandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriterUtil {

    public FileOutputStream writeFile(String destFile) throws IOException {
        return new FileOutputStream(destFile);
    }

    public void writeByte(FileOutputStream fos, int data) throws IOException {
        fos.write(data);
    }
}
