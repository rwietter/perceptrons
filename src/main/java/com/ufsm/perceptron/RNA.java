/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufsm.perceptron;

import com.sun.corba.se.spi.ior.Writeable;
import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;
import java.awt.image.WritableRaster;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.imageio.ImageIO;

/**
 *
 * @author rwietter
 */
public class RNA {

    protected double limiar; // limiar para ser usado na função de ativação
    protected double alfa; // taxa de aprendizagem
    protected double bias; // 0
    protected int data[][]; // data
    protected int target[]; // target
    protected double w[]; // pesos
    protected int inputNeuronsNum; // columns 2
    protected int sampleTrainNum; // rows 4
    protected int outputNeurons; // 1
    protected int result;

    public RNA() {
        this.bias = 0;
        this.alfa = 1;
        this.limiar = 0.2;
    }
}
