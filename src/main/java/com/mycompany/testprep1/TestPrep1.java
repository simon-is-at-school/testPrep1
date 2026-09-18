/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.testprep1;

/**
 *
 * @author simon
 */
public class TestPrep1 {

    public static void main(String[] args) {
        int[][] productSales = {
            {300, 150, 700}, // Year 1: Q1, Q2, Q3
            {250, 200, 600} // Year 2: Q1, Q2, Q3
        };
        
        ProductSales ps = new ProductSales();
        
        System.out.println(ps.display(productSales));
    }
}
