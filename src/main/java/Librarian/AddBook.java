package Librarian;

import Admin.AdminSection;
import Logic.Book;
import Logic.Library;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class AddBook extends javax.swing.JFrame {

    Library library;
    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss a");

    public AddBook() {
        initComponents();
    }

    public AddBook(Library library) {
        initComponents();
        this.library = library;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        containerPanel = new javax.swing.JPanel();
        Header = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        addBookButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        callNoField = new javax.swing.JTextField();
        error = new javax.swing.JLabel();
        callNoError = new javax.swing.JLabel();
        nameError = new javax.swing.JLabel();
        authorField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        authorError = new javax.swing.JLabel();
        publisherField = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        publisherError = new javax.swing.JLabel();
        quantityField = new javax.swing.JTextField();
        quantityError = new javax.swing.JLabel();
        cityLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Librarian - Add book");

        containerPanel.setBackground(new java.awt.Color(0, 0, 0));

        Header.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Header.setForeground(new java.awt.Color(153, 153, 153));
        Header.setText("Add books");

        nameLabel.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(153, 153, 153));
        nameLabel.setText("Call No:");

        passwordLabel.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(153, 153, 153));
        passwordLabel.setText("Name:");

        addBookButton.setBackground(new java.awt.Color(0, 0, 0));
        addBookButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addBookButton.setForeground(new java.awt.Color(255, 255, 255));
        addBookButton.setText("Add books");
        addBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookButtonActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(0, 0, 0));
        backButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        callNoField.setBackground(new java.awt.Color(51, 51, 51));
        callNoField.setForeground(new java.awt.Color(255, 255, 255));
        callNoField.setCaretColor(new java.awt.Color(255, 255, 255));
        callNoField.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        callNoField.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        callNoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                callNoFieldActionPerformed(evt);
            }
        });

        error.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        error.setForeground(new java.awt.Color(255, 0, 0));

        callNoError.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        callNoError.setForeground(new java.awt.Color(255, 0, 0));

        nameError.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        nameError.setForeground(new java.awt.Color(255, 0, 0));

        authorField.setBackground(new java.awt.Color(51, 51, 51));
        authorField.setForeground(new java.awt.Color(255, 255, 255));
        authorField.setCaretColor(new java.awt.Color(255, 255, 255));
        authorField.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        authorField.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        authorField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authorFieldActionPerformed(evt);
            }
        });

        emailLabel.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(153, 153, 153));
        emailLabel.setText("Author:");

        authorError.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        authorError.setForeground(new java.awt.Color(255, 0, 0));

        publisherField.setBackground(new java.awt.Color(51, 51, 51));
        publisherField.setForeground(new java.awt.Color(255, 255, 255));
        publisherField.setCaretColor(new java.awt.Color(255, 255, 255));
        publisherField.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        publisherField.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        publisherField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                publisherFieldActionPerformed(evt);
            }
        });

        addressLabel.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        addressLabel.setForeground(new java.awt.Color(153, 153, 153));
        addressLabel.setText("Publisher:");

        publisherError.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        publisherError.setForeground(new java.awt.Color(255, 0, 0));

        quantityField.setBackground(new java.awt.Color(51, 51, 51));
        quantityField.setForeground(new java.awt.Color(255, 255, 255));
        quantityField.setCaretColor(new java.awt.Color(255, 255, 255));
        quantityField.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        quantityField.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        quantityField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityFieldActionPerformed(evt);
            }
        });

        quantityError.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        quantityError.setForeground(new java.awt.Color(255, 0, 0));

        cityLabel.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        cityLabel.setForeground(new java.awt.Color(153, 153, 153));
        cityLabel.setText("Quantity:");

        nameField.setBackground(new java.awt.Color(51, 51, 51));
        nameField.setForeground(new java.awt.Color(255, 255, 255));
        nameField.setCaretColor(new java.awt.Color(255, 255, 255));
        nameField.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        nameField.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout containerPanelLayout = new javax.swing.GroupLayout(containerPanel);
        containerPanel.setLayout(containerPanelLayout);
        containerPanelLayout.setHorizontalGroup(
            containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerPanelLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(containerPanelLayout.createSequentialGroup()
                        .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(containerPanelLayout.createSequentialGroup()
                                .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(passwordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                                    .addComponent(emailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(addressLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cityLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(authorError, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(callNoError, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nameError, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(publisherError, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(quantityError, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(quantityField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(publisherField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(authorField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(callNoField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(containerPanelLayout.createSequentialGroup()
                                .addComponent(addBookButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Header, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        containerPanelLayout.setVerticalGroup(
            containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerPanelLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(callNoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(callNoError, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameError, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(authorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(authorError, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(publisherField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(publisherError, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(quantityError, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(containerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(containerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
      public void saveInFile(String s) {
        BufferedWriter bw = null;
        int i = 0;
        try {
            File file = new File(s);

            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            for (i = 0; i < library.getAdminsCount(); i++) {
                String data = "a," + library.getAdmins()[i].getName() + "," + library.getAdmins()[i].getPassword() + "\n";
                bw.write(data);
            }

            for (i = 0; i < library.getLibraiansCount(); i++) {
                String data = "l," + library.getLibraians()[i].getName() + "," + library.getLibraians()[i].getPassword() + "," + library.getLibraians()[i].getEmail() + "," + library.getLibraians()[i].getCity() + "," + library.getLibraians()[i].getAddress() + "," + library.getLibraians()[i].getContactNo() + "\n";
                bw.write(data);
            }

            for (i = 0; i < library.getBooksCount(); i++) {
                String data = "b," + library.getBooks()[i].getCallNo() + "," + library.getBooks()[i].getBookName() + "," + library.getBooks()[i].getAuthorName() + "," + library.getBooks()[i].getPublisherName() + "," + library.getBooks()[i].getQuantity() + "," + library.getBooks()[i].getIssued() + "," + formatter.format(library.getBooks()[i].getAddDate()) + "\n";
                bw.write(data);
            }
            for (i = 0; i < library.getStudentsCount(); i++) {
                int k;
                String data = "s," + library.getStudents()[i].getName() + "," + library.getStudents()[i].getPassword() + "," + library.getStudents()[i].getEmail() + "," + library.getStudents()[i].getCity() + "," + Integer.toString(library.getStudents()[i].getId()) + "," + library.getStudents()[i].getAddress() + "," + library.getStudents()[i].getContactNo() + "," + Integer.toString(library.getStudents()[i].getIssued()) + "," + Double.toString(library.getStudents()[i].getPenalty());
                if (library.getStudents()[i].getIssued() > 0) {
                    k = 0;
                    while (true) {
                        if (k == library.getStudents()[i].getIssued()) {
                            break;
                        }
                        data = data + "," + library.getStudents()[i].getIssuedBooks()[k] + "," + formatter.format(library.getStudents()[i].getIssueDates()[k]) + "," + formatter.format(library.getStudents()[i].getReturnDates()[k]);

                        k++;
                    }
                    data = data + ",null" + "\n";
                } else {
                    data = data + "\n";
                }
                bw.write(data);
            }

        } catch (IOException ioe) {
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException ex) {
            }
        }
    }

    public boolean stringContainsNumber(String s) {
        return Pattern.compile("[0-9]").matcher(s).find();
    }

    private void addBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBookButtonActionPerformed
        boolean errors = false;

        String callNo = callNoField.getText();
        String name = nameField.getText();
        String author = authorField.getText();
        String publisher = publisherField.getText();
        String quantity = quantityField.getText();

        error.setText(null);
        callNoError.setText(null);
        nameError.setText(null);
        authorError.setText(null);
        publisherError.setText(null);
        quantityError.setText(null);

        if (callNoField.getText().equals("") && nameField.getText().equals("") && authorField.getText().equals("") && publisherField.getText().equals("") && quantityField.getText().equals("")) {
            error.setText("No data entered");
            return;
        } else {
            if (name.equals("")) {
                nameError.setText("No data entered");
                errors = true;
            } else if (stringContainsNumber(name)) {
                nameError.setText("Name contains invalid characters");
                errors = true;
            }
            if (callNo.equals("")) {
                callNoError.setText("No data entered");
                errors = true;
            } else {
                for (int j = 0; j < library.getBooksCount(); j++) {
                    if (callNo.equals(library.getBooks()[j].getCallNo())) {
                        callNoError.setText("Book with same Call no. already exists");
                        errors = true;
                    }
                }
            }
            if (author.equals("")) {
                authorError.setText("No data entered");
                errors = true;
            } else if (stringContainsNumber(author)) {
                authorError.setText("Author contains invalid characters");
                errors = true;
            }
            if (publisher.equals("")) {
                publisherError.setText("No data entered");
                errors = true;
            } else if (stringContainsNumber(publisher)) {
                publisherError.setText("Publisher contains invalid characters");
                errors = true;
            }
            if ((quantity.equals(""))) {
                quantityError.setText("No data entered");
                errors = true;
            } else {
                try {
                    Integer.parseInt(quantity);

                } catch (NumberFormatException e) {
                    quantityError.setText("Enter valid contact no.");
                    errors = true;
                }

            }
        }
        if (!errors) {
            int i = library.getBooksCount();
            library.getBooks()[i++] = new Book(callNo, name, author, publisher, Integer.parseInt(quantity), 0, "null");
            library.setBooksCount(i);
            saveInFile(library.getPath());
            JOptionPane.showMessageDialog(null, "Books added successfully!");
            LibrarianSection as = new LibrarianSection(library);
            dispose();
            as.setVisible(true);
        }
    }//GEN-LAST:event_addBookButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        LibrarianSection as = new LibrarianSection(library);
        dispose();
        as.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void callNoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_callNoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_callNoFieldActionPerformed

    private void authorFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authorFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_authorFieldActionPerformed

    private void publisherFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_publisherFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_publisherFieldActionPerformed

    private void quantityFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityFieldActionPerformed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Header;
    private javax.swing.JButton addBookButton;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JLabel authorError;
    private javax.swing.JTextField authorField;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel callNoError;
    private javax.swing.JTextField callNoField;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JPanel containerPanel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel error;
    private javax.swing.JLabel nameError;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel publisherError;
    private javax.swing.JTextField publisherField;
    private javax.swing.JLabel quantityError;
    private javax.swing.JTextField quantityField;
    // End of variables declaration//GEN-END:variables

}
