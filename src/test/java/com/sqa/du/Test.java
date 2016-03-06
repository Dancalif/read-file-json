package com.sqa.du;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Test {
       public static ArrayList<Object> tests = new ArrayList<Object> ();
       public static StringBuilder testString = new StringBuilder();


       public static void main(String[] args) {
             // The name of the file to open.
            String fileNameOld = "temp.txt" ;
            String fileName = "temp.json" ;
             // This will reference one line at a time
            String line = null ;
             try {
                   // FileReader reads text files in the default encoding.
                  FileReader fileReader = new FileReader(fileName);
                   // Always wrap FileReader in BufferedReader.
                  BufferedReader bufferedReader = new BufferedReader(fileReader );

                   while ((line = bufferedReader.readLine()) != null) {
                         //TODO Evalaute the line
                         gatherDataString(line);
                  }
                   evaluateDataString();
                   // Always close files.
                   bufferedReader.close();
            } catch (FileNotFoundException ex ) {
                  System. out.println("Unable to open file '" + fileName + "'");
            } catch (IOException ex ) {
                  System. out.println("Error reading file '" + fileName + "'");
                   // Or we could just do this:
                   // ex.printStackTrace();
            }
             displayTests();
      }

       private static void evaluateDataString() {
             //String[] tests = testString.toString().split("},{");
//          for( int i = 0; i < tests.length; i++) {
//                //String[] elements = "\d";
//                "\d+"
//          }
             //String regexString = "\\"\\d+\\"";
            String myString = testString .toString();
            System. out.println(myString );
            System. out.println(myString .replaceAll("\\D+", ""));
            System. out.println(myString );
      }

       private static void gatherDataString(String line) {
             testString.append(line );
             //System.out.println(line);
      }

       private static void displayTests() {
            System. out.println(testString.toString());

      }

//    private static void displayTests() {
//          System.out.println("Number of tests:" + tests.size());
//          for( int i = 0; i < tests.size(); i++) {
//                String[] parameters = (String[])tests.get(i);
//                System.out.print(parameters[0] + ",");
//                System.out.print(parameters[1] + ",");
//                System.out.println(parameters[2]);
//          }
//    }

//    private static void evaluateLine(String line) {
//          String[] parameters = new String[3];
//          String[] elements = line.split(",");
//          parameters[0] = elements[0].split("=")[1];
//          parameters[1] = elements[1].split("=")[1];
//          parameters[2] =  elements[2].split("=")[1];
//          tests.add(parameters);
//    }
}