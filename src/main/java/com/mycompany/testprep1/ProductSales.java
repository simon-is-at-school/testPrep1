/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testprep1;

/**
 *
 * @author simon
 */
public class ProductSales implements IProduct {

    @Override
    public int TotalSales(int[][] productSales) {
        int total = 0;

        for (int i = 0; i < productSales.length; i++) {
            for (int j = 0; j < productSales[i].length; j++) {
                total += productSales[i][j];
            }
        }

        return total;
    }

    @Override
    public double AverageSales(int[][] productSales) {
        int total = TotalSales(productSales);
        int count = productSales.length * productSales[0].length;

        return (double) total / count;
    }

    @Override
    public int MaxSale(int[][] productSales) {
        int max = productSales[0][0];
        for (int i = 0; i < productSales.length; i++) {
            for (int j = 0; j < productSales[i].length; j++) {
                if (productSales[i][j] > max) {
                    max = productSales[i][j];
                }
            }
        }

        return max;
    }

    @Override
    public int MinSale(int[][] productSales) {
        int min = productSales[0][0];
        for (int i = 0; i < productSales.length; i++) {
            for (int j = 0; j < productSales[i].length; j++) {
                if (productSales[i][j] < min) {
                    min = productSales[i][j];
                }
            }
        }

        return min;
    }
    
    public String display(int[][] productSales){
      StringBuilder report = new StringBuilder();

        report.append("PRODUCT SALES REPORT - 2025\n")
              .append("------------------------------------------------\n")
              .append("Total Sales: ").append(TotalSales(productSales)).append("\n")
              .append("Average Sales: ").append(String.format("%.2f", AverageSales(productSales))).append("\n")
              .append("Maximum Sale: ").append(MaxSale(productSales)).append("\n")
              .append("Minimum Sale: ").append(MinSale(productSales)).append("\n")
              .append("------------------------------------------------\n");

        return report.toString();
    }

}
