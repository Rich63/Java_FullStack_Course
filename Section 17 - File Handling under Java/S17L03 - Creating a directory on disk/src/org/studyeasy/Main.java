package org.studyeasy;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        {
            String path = "D:\\Code\\Java\\Udemy\\Full Stack Java developer - Java + JSP + Restful WS + Spring\\FileUsage";

            File directory = new File(path+"\\studyeasy");
            if(!directory.exists()) {
                directory.mkdir();
                System.out.println("directory "+directory+" is created!");
            } else {
                System.out.println("directory already exists!");
            }

            File file = new File(directory+"\\studyeasy.txt");
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("File studyeasy.txt is created.");
            } else {
                System.out.println("file already exists!");
            }
        }

    }
}