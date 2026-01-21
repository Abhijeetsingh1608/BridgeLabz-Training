package com.javastreams.filecopy;
public class Main {

    public static void main(String[] args) {

        String sourceFile = "bigfile.dat";   // 100MB file
        String unbufferedDest = "copy_unbuffered.dat";
        String bufferedDest = "copy_buffered.dat";

        long unbufferedTime =
                UnbufferedFileCopy.copy(sourceFile, unbufferedDest);

        long bufferedTime =
                BufferedFileCopy.copy(sourceFile, bufferedDest);

        System.out.println("\n--- Performance Comparison ---");
        System.out.println("Unbuffered Time (ms): " + unbufferedTime / 1_000_000);
        System.out.println("Buffered Time   (ms): " + bufferedTime / 1_000_000);
    }
}
