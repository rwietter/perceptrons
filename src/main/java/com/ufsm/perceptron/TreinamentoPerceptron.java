/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufsm.perceptron;

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
                sumY = 0;
                for (int i = 0; i < this.inputNeuronsNum; i++) {
                    sumY = sumY + this.data[sample][i] * this.w[i];
                }

                yIn = sumY + this.bias;

                if (yIn > this.limiar) {
                    y = 1;
                } else if (yIn < -this.limiar) {
                    y = -1;
                } else {
                    y = 0;
                }

//                System.out.println("Y: "+ y + "| target " + this.target[sample]);
                if (y != this.target[sample]) {
//                    System.out.println(y + " " + this.target[sample]);
                    isTrain = true;
                    for (int i = 0; i < this.inputNeuronsNum; i++) {
                        this.w[i] = this.w[i] + this.alfa * this.target[sample] * this.data[sample][i];
                    }
                    this.bias = this.bias + alfa * this.target[sample];
                }
//                System.out.println(y != this.target[sample]);
            }

        }
        JOptionPane.showMessageDialog(null, "Treino realizado com " + epoch + " Epochs");
    }
}
