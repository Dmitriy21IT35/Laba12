package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        FileWriter help=null;
        File rico=new File ("C:\\ricodiv\\rico.txt");
        System.out.println ("Введите айпишник:");
        Scanner in = new Scanner (System.in);
        String ipp= in.next ();
        boolean result;
        result = ipp.matches("(((2[0-5]{2})|(2[0-4]\\d)|1\\d{2}|\\d{2}|\\d)\\.){3}((2[0-5]{2})|(2[0-4]\\d|1\\d{2}|\\d{2}|\\d))");

        if(rico.createNewFile()){
            System.out.println("True");}
        else{
            System.out.println("False");
        }

        try{
            help= new FileWriter ("C:\\ricodiv\\rico.txt");
            help.write (ipp);

        } catch (IOException ep) {
            ep.printStackTrace ();
        }
        finally {
            help.close();

        }
    }
}
