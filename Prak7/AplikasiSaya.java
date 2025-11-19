//Swing GUI Application

package Prak7;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.util.Vector;

public class AplikasiSaya{
  public AplikasiSaya(){
    JFrame frame = new JFrame("Aplikasi Saya");
    JPanel panel = new JPanel();
    frame.add(panel, BorderLayout.CENTER);
    frame.setSize(400, 300);
    frame.setResizable(false);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JLabel labelJudul = new JLabel("Identitas Mahasiswa");
    labelJudul.setHorizontalAlignment(SwingConstants.CENTER);
    JLabel label = new JLabel("Masukkan Nama: ");
    JTextField textField = new JTextField(20);
    JLabel npm = new JLabel("Masukkan NPM: ");
    JTextField textFieldNPM = new JTextField(20);
    JLabel Kelas = new JLabel("Masukkan Kelas: ");
    JComboBox<String> comboBox = new JComboBox<>(new String[]{"A", "B", "C", "D", "E", "F", "G"});
    JButton button = new JButton("Submit");
    button.addActionListener( e -> {
      String nama = textField.getText();
      String npmText = textFieldNPM.getText();
      String kelas = (String) comboBox.getSelectedItem();
      JDialog dialog = new JDialog (frame, "Konfirmasi", true);
      JPanel panelDialog = new JPanel(new GridLayout(3,1));
      dialog.add(panelDialog);

      panelDialog.add(new JLabel("Nama: " + nama));
      panelDialog.add(new JLabel("NPM: " + npmText));
      panelDialog.add(new JLabel("Kelas: " + kelas));
      

      button.addActionListener(e2 -> {
        dialog.dispose();
      });
  
      dialog.pack();
      dialog.setLocationRelativeTo(frame);

      dialog.setVisible(true);
    });

    frame.add(labelJudul, BorderLayout.NORTH);
    panel.add(label);
    panel.add(textField);
    panel.add(npm);
    panel.add(textFieldNPM);
    panel.add(Kelas);
    panel.add(comboBox);
    frame.add(button, BorderLayout.SOUTH);


    frame.setVisible(true); 
  }

  public static void main(String[] args){
    SwingUtilities.invokeLater(() -> {
      new AplikasiSaya();
    });
  }
}