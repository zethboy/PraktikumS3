// Nama : Yogi Nugraha
// NPM : 247006111067
// Kelas : C
// Pertemuan : 4

package Prak4.Tugas;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class MataKuliah {
    String hari;
    String jam1;
    String jam2;
    String jam3;

    MataKuliah(String hari, String jam1, String jam2, String jam3) {
        this.hari = hari;
        this.jam1 = jam1;
        this.jam2 = jam2;
        this.jam3 = jam3;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan hari: ");
        String hari = input.nextLine();

        System.out.print("Jam 1: ");
        String jam1 = input.nextLine();

        System.out.print("Jam 2: ");
        String jam2 = input.nextLine();

        System.out.print("Jam 3: ");
        String jam3 = input.nextLine();

        MataKuliah mk = new MataKuliah(hari, jam1, jam2, jam3);
        
        try {
            FileWriter writer = new FileWriter("MataKuliah.txt");
            writer.write("Hari: " + mk.hari + "\n");
            writer.write("Jam 1: " + mk.jam1 + "\n");
            writer.write("Jam 2: " + mk.jam2 + "\n");
            writer.write("Jam 3: " + mk.jam3 + "\n");
            writer.close();

            System.out.println("\nData berhasil diinput..");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

