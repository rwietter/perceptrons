/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufsm.perceptron;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author rwietter
 */
public class Images {

    ArrayList arrayPixelImg = new ArrayList();
    private String pathTrainFolter = "";
    private String extensionImg = ".bmp";
    String[] ImgCodes = {
        "a4", "b1", "c2", "d3",
        "e4", "f1", "g2", "h2",
        "i3", "j4", "k1", "l2",
        "m3", "n4", "o1", "p3",
        "q2", "r4", "s4", "t2",
        "u2", "v2", "w1", "x3",
        "y1", "z3"
    };

    public Images() {
        String currentPath = Paths.get(".").toAbsolutePath().normalize().toString();
        this.pathTrainFolter = currentPath + "/src/main/java/com/ufsm/perceptron/BaseDadosLetras/Treinamento/";
    }

    public ArrayList<BufferedImage> readAllImages() {
        ArrayList<BufferedImage> images = new ArrayList<BufferedImage>();
        File folder = new File(this.pathTrainFolter);
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
            WritableRaster raster = image.getRaster();
            int pixel[] = new int[4];
            for (int y = 0; y < raster.getHeight(); y++) {
                for (int x = 0; x < raster.getWidth(); x++) {
                    raster.getPixel(x, y, pixel);
                    for (int i = 0; i < 1; i++) {
                        if (pixel[0] == 0) {
                            pixelImg.add(1);
                        } else {
                            pixelImg.add(-1);
                        }
                    }
                }
            }
            arrayPixelImg.add(pixelImg);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void setImageOnInterface(JComboBox jCB_letra, JLabel jL_Image, String selectedImagePath) {
        Hashtable<String, String> imgKeys = new Hashtable<String, String>();
        for (int i = 0; i < this.ImgCodes.length; i++) {
            imgKeys.put(String.valueOf(i), this.ImgCodes[i]);
        }
        int index = jCB_letra.getSelectedIndex();

        try {
            BufferedImage img = ImageIO.read(new File(this.pathTrainFolter + imgKeys.get(String.valueOf(index)) + this.extensionImg));
            ImageIcon icon = new ImageIcon(img);
            Image image = icon.getImage().getScaledInstance(jL_Image.getWidth(), jL_Image.getHeight(), Image.SCALE_SMOOTH);
            jL_Image.setIcon(new ImageIcon(image));
            jL_Image.setToolTipText(selectedImagePath);
        } catch (IOException ex) {
            Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void searchLoadImage(JLabel jL_Image, String selectedImagePath) {
        JFileChooser fileChooser = new JFileChooser();

        FileNameExtensionFilter filter = new FileNameExtensionFilter("IMAGES", "jpg", "png", "jpeg", "bmp");
        fileChooser.setFileFilter(filter);

        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        int result = fileChooser.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            try {
                File selectedFile = fileChooser.getSelectedFile();
                selectedImagePath = selectedFile.getAbsolutePath();

                BufferedImage img = ImageIO.read(new File(selectedImagePath));
                ImageIcon icon = new ImageIcon(img);
                Image image = icon.getImage().getScaledInstance(jL_Image.getWidth(), jL_Image.getHeight(), Image.SCALE_SMOOTH);
                jL_Image.setIcon(new ImageIcon(image));
                jL_Image.setToolTipText(selectedImagePath);
            } catch (IOException ex) {
                Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public ArrayList ImgToPixel(String imagePath) {
        ArrayList pixelImg = new ArrayList();
        try {
            BufferedImage bufferedImage = ImageIO.read(new File(imagePath));
            WritableRaster raster = bufferedImage.getRaster();
            int pixel[] = new int[4];
            for (int y = 0; y < raster.getHeight(); y++) {
                for (int x = 0; x < raster.getWidth(); x++) {
                    raster.getPixel(x, y, pixel);
                    for (int i = 0; i < 1; i++) {
                        if (pixel[0] == 0) {
                            pixelImg.add(1);
                        } else {
                            pixelImg.add(-1);
                        }
                    }
                }
            }
            return pixelImg;
        } catch (Exception e) {
            System.out.println(e);
        }
        return pixelImg;
    }

    public void printLetter() {
        int count = 0;
        for (int i = 0; i < this.arrayPixelImg.size(); i++) {
            ArrayList pixeImg = (ArrayList) this.arrayPixelImg.get(i);
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
    }
}
