package unice.miage.fr;

import java.io.*;

public class Main{
    public static void main(String[] args) {
        File[] paths;
        File f;
        try{
            f = new File("/Users/marc/Documents/TP_JAVA/TP01");
             /**paths = f.listFiles();

            for(File path:paths) {
                System.out.println(path);
            }**/
            recurrenceListFile(f);
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void recurrenceListFile(File file){
        File f = new File(file.toString());
        File[] paths;
        File test;
        paths = f.listFiles();
        for(File path:paths) {
            System.out.println(path);
            test = new File(path.toString());
            if(test.isDirectory()){
                recurrenceListFile(path);
            }
        }
    }
}