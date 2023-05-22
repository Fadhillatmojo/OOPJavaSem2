import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Sistem Informasi");
        JLabel label = new JLabel("Selamat Datang");
        JPanel panel = new JPanel();
        JButton button = new JButton("Click to login >");

        panel.setLayout(new BorderLayout());
        panel.add(button);
        panel.add(label, BorderLayout.NORTH);
        frame.add(panel);
        frame.setSize(500, 500);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        // button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                newPage();
            }
        });

    }
    public static void newPage(){
        String[] kolom = {"Nama", "Umur", "Prodi"};
        DefaultTableModel model = new DefaultTableModel(kolom, 0);
        JTable table = new JTable(model);


        JFrame frame = new JFrame("Halaman Kedua");
        JTextField text1 = new JTextField();
        JTextField text2 = new JTextField();
        JTextField text3 = new JTextField();
        JPanel textPanel = new JPanel(new BorderLayout());
        JPanel mainPanel = new JPanel(new BorderLayout());
        JPanel panelBtn = new JPanel(new FlowLayout());
        JButton buttonSubmit = new JButton("Submit");
        JButton buttonDelete = new JButton("Delete");
        JButton buttonUpdate = new JButton("Update");
        JLabel label2 = new JLabel();

        table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (table.getSelectedRow() != -1) {
                    text1.setText(model.getValueAt(table.getSelectedRow(), 0).toString());
                    text2.setText(model.getValueAt(table.getSelectedRow(), 1).toString());
                    text3.setText(model.getValueAt(table.getSelectedRow(), 2).toString());
                }
            }
        });

        buttonSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                String hasil = text1.getText() + text2.getText() + text3.getText();
//                label2.setText(hasil);
                model.addRow(new Object[]{
                        text1.getText(),
                        text2.getText(),
                        text3.getText(),
                });

            }
        });

        buttonDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (table.getSelectedRow() != -1) {
                    model.removeRow(table.getSelectedRow());
                }
            }
        });

        buttonUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (table.getSelectedRow() != -1) {
                    model.setValueAt(text1.getText(), table.getSelectedRow(), 0);
                    model.setValueAt(text2.getText(), table.getSelectedRow(), 1);
                    model.setValueAt(text3.getText(), table.getSelectedRow(), 2);
                }
            }
        });

        textPanel.add(text1, BorderLayout.NORTH);
        textPanel.add(text2, BorderLayout.CENTER);
        textPanel.add(text3, BorderLayout.SOUTH);

        panelBtn.add(buttonSubmit);
        panelBtn.add(buttonDelete);
        panelBtn.add(buttonUpdate);

        mainPanel.add(textPanel, BorderLayout.NORTH);
//        mainPanel.add(label2, BorderLayout.CENTER);
        mainPanel.add(new JScrollPane(table), BorderLayout.CENTER);
        mainPanel.add(panelBtn, BorderLayout.SOUTH);

        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.add(mainPanel);
    }

}