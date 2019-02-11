package unice.miage.fr;

import java.io.*;

public class Main{
    public static void main(String[] args) {
        File[] paths;
        File f;
        try{
            f = new File("/");
            paths = f.listFiles();

            for(File path:paths) {
                System.out.println(path);
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}