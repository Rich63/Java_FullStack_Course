package org.studyeasy;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        {
            String path = "D:\\Code\\Java\\Udemy\\Full Stack Java developer - Java + JSP + Restful WS + Spring\\FileUsage";

            File directory = new File(path+"\\s17l04");
            if(!directory.exists()) {
                directory.mkdir();
                System.out.println("directory "+directory+" is created!");
            } else {
                System.out.println("directory already exists!");
            }

            File file = new File(directory+"\\studyeasy.txt");
            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    System.out.println("Error occured, while creating the file");
                }
                System.out.println("File studyeasy.txt is created.");
            } else {
                System.out.println("file already exists!");
            }

            try(BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
                bw.write("Richard");
                bw.newLine();
                bw.write("Debbie");
                bw.newLine();
                bw.write("Karim");
                bw.newLine();
                bw.write("Naomi");
                bw.newLine();
                bw.write("Jesse");
                bw.newLine();
                bw.write("Kylie");
                bw.newLine();
                System.out.println("Writing onto the file completed");
            } catch (IOException e) {
                System.out.println("Error occured, while writing onto the file");
            }
        }

    }
}