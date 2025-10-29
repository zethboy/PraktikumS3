package Prak4;

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.IOException;

public class TulisTextFile {
  public static void main(String[] args){
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("fileText.txt"))) {
      writer.write("Malas Mengodonf");
      writer.newLine();
      writer.write("lebih baik tidur");
      writer.newLine();
    } catch (IOException e){
      e.printStackTrace();
    }
  }
}
