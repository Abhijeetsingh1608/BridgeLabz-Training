package com.javastreams.bytearray;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try {
            String inputImage = "input.jpg";
            String outputImage = "output.jpg";

            // Image → Byte Array
            byte[] imageBytes =
                    ImageToByteArray.convertImageToBytes(inputImage);

            // Byte Array → Image
            ByteArrayToImage.writeBytesToImage(imageBytes, outputImage);

            System.out.println("Image copied successfully!");
            System.out.println("Output image is identical to input image.");

        } catch (IOException e) {
            System.out.println("Error while processing image.");
            e.printStackTrace();
        }
    }
}
