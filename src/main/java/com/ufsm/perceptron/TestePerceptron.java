/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufsm.perceptron;

/**
 *
 * @author rwietter
 */
public class TestePerceptron extends RNA {

    public TestePerceptron(int[][] data, int[] target, double[] w, double bias) {
        this.data = data;
        this.target = target;
        this.w = w;
        this.bias = bias;
        this.inputNeuronsNum = data[0].length; // columns 2
        this.sampleTrainNum = data.length; // rows 1
    }

    public void test() {
        double sumYin = 0, yIn = 0;
        int y = 0; // neuron output

        System.out.println("Test RNA");

        for (int sample = 0; sample < this.sampleTrainNum - 1; sample++) {
            // 3: calcula o potencial de ativação
            sumYin = 0;
            for (int i = 0; i < this.inputNeuronsNum; i++) {
//                System.out.println("\tX: " + i);
                sumYin += this.data[sample][i] * this.w[i];
            }
            yIn = sumYin + this.bias; // função de ativação
//            System.out.println("y_in " + yIn);

            // 4: calcula a resposta do neurônio de saída
            if (yIn > this.limiar) {
                y = 1;
            } else if (yIn < -this.limiar) {
                y = -1;
            } else {
                y = 0;
            }

            // 5: verificar acettos/erros
            if (y == this.target[sample]) {
                this.result = 1;
            } else {
                this.result = 0;
            }

        }
    }

    public int getResult() {
        return this.result;
    }
}
