package com.javastreams.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReaderUtil {

    public FileInputStream readFile(String sourceFile) throws FileNotFoundException {
        return new FileInputStream(sourceFile);
    }

    public int readByte(FileInputStream fis) throws IOException {
        return fis.read();
    }
}
