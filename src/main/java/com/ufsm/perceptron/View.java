/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.ufsm.perceptron;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * @author rwietter
 */
public class View extends javax.swing.JFrame {

    private TreinamentoPerceptron perceptron;
    private double w[] = {0, 0};
    private double bias;
    private String selectedImagePath;
    ArrayList arrayPixelImg = new ArrayList();

    public View() {
        initComponents();
        this.perceptron = new TreinamentoPerceptron();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jL_Image = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jCB_letra = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jB_teste = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        JB_treinar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Inserir imagens"));

        jL_Image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL_Image.setToolTipText("Click to insert");
        jL_Image.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jL_Image.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jL_ImageMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jL_Image, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jL_Image, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Selecionar letra"));

        jCB_letra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }));
        jCB_letra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB_letraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCB_letra, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCB_letra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jB_teste.setText("Teste");
        jB_teste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_testeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jB_teste, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jB_teste)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        JB_treinar.setText("Treinar");
        JB_treinar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_treinarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JB_treinar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JB_treinar, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1))
                .addGap(0, 9, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jL_ImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_ImageMouseClicked
        JFileChooser fileChooser = new JFileChooser();

        FileNameExtensionFilter filter = new FileNameExtensionFilter("IMAGES", "jpg", "png", "jpeg", "bmp");
        fileChooser.setFileFilter(filter);

        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        int result = fileChooser.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            try {
                File selectedFile = fileChooser.getSelectedFile();
                this.selectedImagePath = selectedFile.getAbsolutePath();

                BufferedImage img = ImageIO.read(new File(this.selectedImagePath));
                ImageIcon icon = new ImageIcon(img);
                Image image = icon.getImage().getScaledInstance(this.jL_Image.getWidth(), this.jL_Image.getHeight(), Image.SCALE_SMOOTH);
                this.jL_Image.setIcon(new ImageIcon(image));
                this.jL_Image.setToolTipText(selectedImagePath);
            } catch (IOException ex) {
                Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jL_ImageMouseClicked

    private void jCB_letraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB_letraActionPerformed
    }//GEN-LAST:event_jCB_letraActionPerformed

    public ArrayList<BufferedImage> readAllImages() {
        ArrayList images = new ArrayList();
        File folder = new File("/home/rwietter/Downloads/BaseDadosLetrasTreinamento-Teste (1)/BaseDadosLetras/Treinamento/");
        for (final File fileEntry : folder.listFiles()) {
            String filePath = fileEntry.getAbsolutePath();
            if (fileEntry.isDirectory()) {
                // readImagesInFolder(filePath);
            } else {
                try {
                    BufferedImage img = ImageIO.read(new File(filePath));
                    images.add(img);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return images;
    }

    public void convertAllImagesInPixels(ArrayList<BufferedImage> images) {
        for (int i = 0; i < images.size(); i++) {
            this.imageToPixels(images.get(i));
        }
    }

    public void imageToPixels(BufferedImage image) {
        ArrayList pixelImg = new ArrayList();
        try {
            // BufferedImage bufferedImage = ImageIO.read(new File("/home/rwietter/Downloads/BaseDadosLetrasTreinamento-Teste (1)/BaseDadosLetras/Treinamento/a4.bmp"));
            WritableRaster raster = image.getRaster();
            int pixel[] = new int[4];
            for (int y = 0; y < raster.getHeight(); y++) {
                for (int x = 0; x < raster.getWidth(); x++) {
                    raster.getPixel(x, y, pixel);
                    for (int i = 0; i < 1; i++) {
                        if (pixel[0] == 0) {
                            pixelImg.add("+");
                        } else {
                            pixelImg.add("-");
                        }
                    }
                }
            }
            arrayPixelImg.add(pixelImg);
        } catch (Exception e) {
            System.out.println(e);
        }

        /*
        int count = 1;
        for (int i = 0; i < pixelImg.size(); i++) {
            System.out.print(pixelImg.get(i) + " ");
            count++;
            if (count == 30) {
                System.out.print("\n");
                count = 0;
            }
        }
        System.out.println("Size of Array is: " + pixelImg.size());
         */
    }

    private void JB_treinarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_treinarActionPerformed
        ArrayList<BufferedImage> images = this.readAllImages();
        this.convertAllImagesInPixels(images);

        int count = 0;
        for (int i = 0; i < arrayPixelImg.size(); i++) {
            ArrayList pixeImg = (ArrayList) arrayPixelImg.get(i);
            for (int j = 0; j < pixeImg.size(); j++) {
                System.out.print(pixeImg.get(j) + " ");
                count++;
                if (count == 30) {
                    System.out.print("\n");
                    count = 0;
                }
            }
            System.out.println("Size of Array is: " + pixeImg.size() + "\n");
        }
        
        ArrayList target = new ArrayList();
        for (int i = 0; i < arrayPixelImg.size(); i++) {
            ArrayList pixeImg = (ArrayList) arrayPixelImg.get(i);
            target.add(pixeImg);
        }
        ArrayList data = target;
        this.perceptron.setPerceptronInput(data, target, this.w);
//        this.perceptron.train();
//        this.bias = this.perceptron.getBias();
    }//GEN-LAST:event_JB_treinarActionPerformed

    private void jB_testeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_testeActionPerformed
        String letter = (String) this.jCB_letra.getSelectedItem();
        String imagePath = this.jL_Image.getToolTipText();

//        int x1 = this.jCB1.getSelectedIndex();
//        int x2 = this.jCB2.getSelectedIndex();
//        int target = this.jCB3.getSelectedIndex() > 0 ? 1 : -1;
//        int xTest[][] = {{x1, x2}, {}};
//        int targetTest[] = {target};
//        TestePerceptron test = new TestePerceptron(xTest, targetTest, this.w, this.bias);
//        test.test();
//        int result = test.getResult();
//        if(result == 0) {
//            this.jTF_result.setText("Errou");
//        } else {
//            this.jTF_result.setText("Acertou");
//        }
    }//GEN-LAST:event_jB_testeActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_treinar;
    private javax.swing.JButton jB_teste;
    private javax.swing.JComboBox<String> jCB_letra;
    private javax.swing.JLabel jL_Image;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
