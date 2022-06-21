/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufsm.perceptron;

import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author rwietter
 */
public class TreinamentoPerceptron extends RNA {

    public void setPerceptronInput(int[][] data, int[] target, double[] w) {
        this.data = data;
        this.target = target;
        this.w = w;
        this.inputNeuronsNum = data[0].length; // columns
        this.outputNeurons = 1;
        this.sampleTrainNum = data.length; // rows
    }

    public double getBias() {
        return this.bias;
    }

    public void train() {
        boolean isTrain = true;
        double sumY = 0;
        double yIn = 0;
        int y;
        int epoch = 0;

        while (isTrain) {
            isTrain = false; // não precisa mais modificar os pesos
            epoch++;
            for (int sample = 0; sample < this.sampleTrainNum; sample++) {
                System.out.println("Sample: " + sample + " | Target: " + this.sampleTrainNum);
                sumY = 0;
                try {
                    for (int i = 0; i < this.inputNeuronsNum; i++) {
                        sumY = sumY + this.data[sample][i] * this.w[i];
                    }
                } catch (Exception e) {
//                    System.out.println("Error in SumY: " + e.getCause());
                }

                yIn = sumY + this.bias;

                if (yIn > this.limiar) {
                    y = 1;
                } else if (yIn < -this.limiar) {
                    y = -1;
                } else {
                    y = 0;
                }

                if (y != this.target[sample]) {
                    isTrain = true;
                    try {
                        for (int i = 0; i < this.inputNeuronsNum; i++) {
                            this.w[i] = this.w[i] + this.alfa * this.target[sample] * this.data[sample][i];
                        }
                    } catch (Exception e) {
//                        System.out.println("Error in weights: " + e.getCause());
                    }
                    this.bias = this.bias + alfa * this.target[sample];
                }
            }

        }
        JOptionPane.showMessageDialog(null, "Treino realizado com " + epoch + " Epochs");
    }
}
