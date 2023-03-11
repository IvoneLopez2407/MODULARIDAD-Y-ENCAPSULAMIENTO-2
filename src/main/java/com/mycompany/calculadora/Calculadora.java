/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;

/**
 *
 * @author Valentina Vargas
 */

public class Calculadora {
    
    public static void main(String[] args){
    //??
    ObjetoCalculadora calculadora = new ObjetoCalculadora();
  
    calculadora.setNumero1();
    calculadora.setNumero2();
    
    if ( (calculadora.getNumero1()>0)||(calculadora.getNumero2()>0)){
        //Suma
        calculadora.resultado =calculadora.calcularSuma();
        calculadora.Imprimir();
        //Resta
        calculadora.resultado =calculadora.calcularResta();
        calculadora.Imprimir();
        //Multiplicacion
        calculadora.resultado =calculadora.calcularMultiplicacion();
        calculadora.Imprimir();
        //División
        calculadora.resultado =calculadora.calcularDivision();
        calculadora.Imprimir();
        }
    else {
        System.out.println("Los datos son invalidos");
        }
    }
}