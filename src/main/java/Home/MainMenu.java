/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Home;

import Logic.Library;
import Logic.*;
import Student.StudentLoginForm;
import Admin.*;
import Librarian.*;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Amr
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    private boolean dataIn; //check availabity of data
    private Library library; //create new library object
    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss a"); //maintain dates in a certain format

    public MainMenu() {
        initComponents();
    }

    //constructor with library to hold data
    public MainMenu(Library library) {
        initComponents();
        this.library = library;
        dataIn = true;
        ImportData.setBackground(Color.green);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Header = new javax.swing.JLabel();
        AdminLogin = new javax.swing.JButton();
        LibrarianLogin = new javax.swing.JButton();
        ImportData = new javax.swing.JButton();
        LoginHeader = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        StudentLogin = new javax.swing.JButton();
        error = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");
        setBackground(new java.awt.Color(255, 153, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        setLocationByPlatform(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));

        Header.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        Header.setForeground(new java.awt.Color(153, 153, 153));
        Header.setText("LIBRARY MANAGEMENT");

        AdminLogin.setBackground(new java.awt.Color(0, 0, 0));
        AdminLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AdminLogin.setForeground(new java.awt.Color(255, 255, 255));
        AdminLogin.setText("ADMIN");
        AdminLogin.setAlignmentY(0.0F);
        AdminLogin.setFocusPainted(false);
        AdminLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AdminLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminLoginActionPerformed(evt);
            }
        });

        LibrarianLogin.setBackground(new java.awt.Color(0, 0, 0));
        LibrarianLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LibrarianLogin.setForeground(new java.awt.Color(255, 255, 255));
        LibrarianLogin.setText("LIBRARIAN");
        LibrarianLogin.setAlignmentY(0.0F);
        LibrarianLogin.setFocusPainted(false);
        LibrarianLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LibrarianLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LibrarianLoginActionPerformed(evt);
            }
        });

        ImportData.setBackground(new java.awt.Color(0, 0, 0));
        ImportData.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ImportData.setForeground(new java.awt.Color(255, 255, 255));
        ImportData.setText("IMPORT DATA");
        ImportData.setAlignmentY(0.0F);
        ImportData.setFocusPainted(false);
        ImportData.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ImportData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImportDataActionPerformed(evt);
            }
        });

        LoginHeader.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        LoginHeader.setForeground(new java.awt.Color(153, 153, 153));
        LoginHeader.setText("Login as");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Import data from a file");

        StudentLogin.setBackground(new java.awt.Color(0, 0, 0));
        StudentLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        StudentLogin.setForeground(new java.awt.Color(255, 255, 255));
        StudentLogin.setText("STUDENT");
        StudentLogin.setAlignmentY(0.0F);
        StudentLogin.setFocusPainted(false);
        StudentLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        StudentLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentLoginActionPerformed(evt);
            }
        });

        error.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        error.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ImportData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(LoginHeader)
                    .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AdminLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LibrarianLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(StudentLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(error, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LoginHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(AdminLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LibrarianLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(StudentLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ImportData, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //import button code
    private void ImportDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImportDataActionPerformed
        error.setText(null);
        //asks on ovewritting data
        if (dataIn) {
            if (JOptionPane.showConfirmDialog(null, "Data is already imported, Do you want to overwrite it ?") == 0) {
                dataIn = false;
                ImportData.setBackground(Color.black);
                ImportDataActionPerformed(evt);
            }
        } else {
            //read data from file
            String line = "";
            Person[] admins = new Person[10];
            Libraian[] libraians = new Libraian[30];
            Student[] students = new Student[150];
            Book[] books = new Book[200];
            JFileChooser chooser = new JFileChooser();
            int i = 0, j = 0, k = 0, l = 0;
            //set the opening directory place
            chooser.setCurrentDirectory(new File("B:\\4\\Programming 2\\projects\\UniversityLibrarySytem f"));
            //filter shown files
            chooser.setFileFilter(new FileNameExtensionFilter("Text files", "txt"));
            chooser.showOpenDialog(null);

            File f = chooser.getSelectedFile();

            try {
                BufferedReader br = new BufferedReader(new FileReader(f.getAbsolutePath()));
                while ((line = br.readLine()) != null) {
                    //reading delimited data with comma
                    String[] values = line.split(",");
                    switch (values[0]) {
                        case "a":
                            admins[i++] = new Person(values[1], values[2]);
                            break;
                        case "l":
                            libraians[j++] = new Libraian(values[1], values[2], values[3], values[4], values[5], values[6]);
                            break;
                        case "s":
                            students[k] = new Student(values[1], values[2], values[3], values[4], Integer.parseInt(values[5]), values[6], values[7], Integer.parseInt(values[8]), Double.parseDouble(values[9]));
                            if (Integer.parseInt(values[8]) > 0) {
                                int n = 10;
                                while (values[n].equals("null") == false) {
                                    students[k].setIssuedCalls(values[n], values[++n], values[++n]);
                                    n++;
                                }
                            }
                            k++;
                            break;
                        case "b":
                            books[l++] = new Book(values[1], values[2], values[3], values[4], Integer.parseInt(values[5]), Integer.parseInt(values[6]), values[7]);
                            break;
                        default:
                            break;
                    }
                }
                dataIn = true;
                library = new Library(admins, libraians, students, books);
                library.setPath(f.getAbsolutePath());
                library.setAdminsCount(i);
                library.setLibraiansCount(j);
                library.setStudentsCount(k);
                library.setBooksCount(l);
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error while reading the file");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error while reading the file");
            }
            ImportData.setBackground(Color.green);
        }

    }//GEN-LAST:event_ImportDataActionPerformed

    private void AdminLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminLoginActionPerformed
        if (dataIn) {
            AdminLoginForm admin = new AdminLoginForm(library);
            dispose();
            admin.setVisible(true);
        } else {
            error.setText("No data available, please import data");
        }
    }//GEN-LAST:event_AdminLoginActionPerformed

    private void LibrarianLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LibrarianLoginActionPerformed
        if (dataIn) {
            LibrarianLoginForm librarian = new LibrarianLoginForm(library);
            dispose();
            librarian.setVisible(true);
        } else {
            error.setText("No data available, please import data");
        }
    }//GEN-LAST:event_LibrarianLoginActionPerformed

    private void StudentLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentLoginActionPerformed
        if (dataIn) {
            StudentLoginForm student = new StudentLoginForm(library);
            dispose();
            student.setVisible(true);
        } else {
            error.setText("No data available, please import data");
        }
    }//GEN-LAST:event_StudentLoginActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdminLogin;
    private javax.swing.JLabel Header;
    private javax.swing.JButton ImportData;
    private javax.swing.JButton LibrarianLogin;
    private javax.swing.JLabel LoginHeader;
    private javax.swing.JButton StudentLogin;
    private javax.swing.JLabel error;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}