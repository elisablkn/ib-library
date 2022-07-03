/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IBLibrary;

import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.v2.DbxClientV2;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import com.spire.pdf.*;
import com.spire.pdf.graphics.*;


import java.awt.*;
import java.awt.geom.*;
import javax.swing.JOptionPane;

/**
 *
 * @author belkina_ea
 */
public class UploadTeacher extends javax.swing.JFrame {

    /**
     * Creates new form UploadTeacher
     */
    public UploadTeacher() {
        initComponents();
    }
  
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        ChooseFile = new javax.swing.JFileChooser();
        Upload = new javax.swing.JButton();
        NameText = new javax.swing.JLabel();
        NameOfUploadedFile = new javax.swing.JTextField();
        TypeText = new javax.swing.JLabel();
        TypeOfWork = new javax.swing.JComboBox<>();
        SubjectText = new javax.swing.JLabel();
        SubjectType = new javax.swing.JComboBox<>();
        BackToMenu = new javax.swing.JButton();
        Watermark = new javax.swing.JButton();
        Instruction = new javax.swing.JLabel();

        jLabel1.setText("Enter the name of uploaded file:");

        jLabel5.setText("Choose the type of work: ");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ChooseFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChooseFileActionPerformed(evt);
            }
        });

        Upload.setText("Upload");
        Upload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UploadActionPerformed(evt);
            }
        });

        NameText.setText("Enter the name of uploaded file:");

        TypeText.setText("Choose the type of work: ");

        TypeOfWork.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Internal Assessment", "External Assessment" }));

        SubjectText.setText("Choose the subject:");

        SubjectType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Biology", "Bussiness&Management", "Chemistry", "Computer Science", "Economics", "ESS", "French", "Geography", "History", "Mathematics", "Russian A: Literature", "HL Essay in Russian A", "Visual Arts" }));

        BackToMenu.setText("Back to Menu");
        BackToMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToMenuActionPerformed(evt);
            }
        });

        Watermark.setText("Add Watermark");
        Watermark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WatermarkActionPerformed(evt);
            }
        });

        Instruction.setFont(new java.awt.Font("Lucida Grande", 0, 8)); // NOI18N
        Instruction.setText("The new file will be automatically downloaded to the folder where this application is stored");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ChooseFile, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(BackToMenu)
                                .addGap(235, 235, 235))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Upload)
                                .addGap(258, 258, 258))))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(NameText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NameOfUploadedFile, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TypeText)
                                    .addComponent(SubjectText))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TypeOfWork, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(SubjectType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(Watermark)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Instruction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(6, 6, 6))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ChooseFile, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Watermark)
                    .addComponent(Instruction))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TypeText)
                    .addComponent(TypeOfWork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SubjectText)
                    .addComponent(SubjectType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NameOfUploadedFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameText, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Upload)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BackToMenu)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UploadActionPerformed
        File file = ChooseFile.getSelectedFile(); //initializing the file which is chosen from the computer file system
        String localPath = file.getAbsolutePath(); //get the absolute path of the file in the file system
        String ACCESS_TOKEN = "qjJO82cebXkAAAAAAAAAAaSHnRTGVAb3UF7mAcIuc79khce3w2-AY4K15-eIYb5y"; 
                            //set the unique Dropbox token
        
        String Name = "";
        String Type = (String)TypeOfWork.getSelectedItem(); //gets the type
        String Subject = (String)SubjectType.getSelectedItem(); //gets the subject
        Name = NameOfUploadedFile.getText(); //gets the given name
        
        
        String Path = "/"+Type+"/"+Subject+"/"+Name+".pdf"; //sets the path to the file in Dropbox
        
        
        if ("Internal Assessment".equals(Type) && "HL Essay in Russian A".equals(Subject)) {
            JOptionPane.showMessageDialog(this, "Invalid Operation. HL Essay in Russian A may only be uploaded to External Assessment");
        }
        else { //request the access to the Dropbox API
            DbxRequestConfig config = DbxRequestConfig.newBuilder("dropbox/java-tutorial").build();
            DbxClientV2 client = new DbxClientV2(config, ACCESS_TOKEN); 

            try {
                InputStream in = new FileInputStream(localPath); //from the local file system
                client.files().uploadBuilder(Path) //to the dropbox
                .uploadAndFinish(in);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        
    }//GEN-LAST:event_UploadActionPerformed

    private void ChooseFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChooseFileActionPerformed
        
    }//GEN-LAST:event_ChooseFileActionPerformed

    private void BackToMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToMenuActionPerformed
        MainMenuTeacher m = new MainMenuTeacher();
        this.hide();
        m.setVisible(true);
    }//GEN-LAST:event_BackToMenuActionPerformed

    private void WatermarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WatermarkActionPerformed
        File file = ChooseFile.getSelectedFile(); //initializing the file which is chosen from the computer file system
        String localPath = file.getAbsolutePath(); //get the absolute path of the file in the file system
        String Name = file.getName(); //get the name of this file
        PdfDocument pdf = new PdfDocument(localPath); //initializing a PdfDocument type of document given a local path

        for (int i = 0; i<pdf.getPages().getCount(); i++) {
            PdfPageBase page = pdf.getPages().get(i); //get the access to the i_th page of the document

            Dimension2D dimension2D = new Dimension(); 
            dimension2D.setSize(page.getCanvas().getClientSize().getWidth() / 2, page.getCanvas().getClientSize().getHeight() / 3); 
                    //set the area where the watermark will be
            PdfTilingBrush brush = new PdfTilingBrush(dimension2D);
            brush.getGraphics().setTransparency(0.3F); //set the transparency
            brush.getGraphics().save();
            brush.getGraphics().translateTransform((float) brush.getSize().getWidth() / 2, (float) brush.getSize().getHeight() / 2);
            brush.getGraphics().rotateTransform(-45); //set the rotation
            brush.getGraphics().drawString("IB Library", new PdfTrueTypeFont(new Font("Arial Unicode MS",Font.PLAIN,30),true), 
                    PdfBrushes.getRed(), 0, 0, new PdfStringFormat(PdfTextAlignment.Center)); //parametres of the watermark
            brush.getGraphics().restore();
            brush.getGraphics().setTransparency(1);
            Rectangle2D loRect = new Rectangle2D.Float();
            loRect.setFrame(new Point2D.Float(0, 0), page.getCanvas().getClientSize());
            page.getCanvas().drawRectangle(brush, loRect); //draw watermark text to the page
        }
       
        pdf.saveToFile(Name.replace(".pdf", "_watermarked.pdf")); //save the resultant file with the new name
        pdf.close(); //close
    }//GEN-LAST:event_WatermarkActionPerformed

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
            java.util.logging.Logger.getLogger(UploadTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UploadTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UploadTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UploadTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UploadTeacher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToMenu;
    private javax.swing.JFileChooser ChooseFile;
    private javax.swing.JLabel Instruction;
    private javax.swing.JTextField NameOfUploadedFile;
    private javax.swing.JLabel NameText;
    private javax.swing.JLabel SubjectText;
    private javax.swing.JComboBox<String> SubjectType;
    private javax.swing.JComboBox<String> TypeOfWork;
    private javax.swing.JLabel TypeText;
    private javax.swing.JButton Upload;
    private javax.swing.JButton Watermark;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
