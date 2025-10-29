package Prak4;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class BacaTextFile {
  public static void main(String[] args){
    try (BufferedReader reader = new BufferedReader(new FileReader("fileText.txt"))) {
     String line;
     while((line = reader.readLine()) != null){
      System.out.println(line);
     }
    } catch (IOException e){
      e.printStackTrace();
    }
  }
}
