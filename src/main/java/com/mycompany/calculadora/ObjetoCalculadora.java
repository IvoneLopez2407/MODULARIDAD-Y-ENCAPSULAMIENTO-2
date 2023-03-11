/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;
import javax.swing.JOptionPane;
/**
 *
 * @author Valentina Vargas
 */
public class ObjetoCalculadora {
//Atributos, y sus modificadores de acceso
    public int numero1;
    public int numero2;
    public int resultado;
    
    //El super invoca al metodo constructor
    public ObjetoCalculadora() {
    super();
    }

    public int getNumero1() {
        return numero1;
    }
    public void setNumero1() {
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite numero 1"));
        if (numero1>0){
            this.numero1 = numero1;
        }else {
            System.out.println("El numero 1 es menor que cero");}
    }
    public int getNumero2() {
        return numero2;
    }
    public void setNumero2() {
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite numero 2"));
        if (numero2>0){
            this.numero2 = numero2;
        }else {
            System.out.println("El numero 2 es menor que cero");}
    }

    //Creacion de los diferentes metodos de la clase
    public int calcularSuma (){
    return resultado = numero1 + numero2;
    }
    public int calcularResta (){
    return resultado = numero1 - numero2;
    }
    public int calcularMultiplicacion (){
    return resultado = numero1 * numero2;
    }
    public int calcularDivision (){
    if (numero2 != 0){
    resultado = numero1 / numero2;
    }
    return (resultado);
    }
    public void Imprimir(){
        System.out.println("El resultado es: "+resultado);
    }
}