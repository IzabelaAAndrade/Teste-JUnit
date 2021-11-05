/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.matematica;

/**
 *
 * @author Izabela A. Andrade, Turma: INF3A
 */
public class calcula_areas {
    
    public int areaTriangulo(int base, int altura){
        return (base * altura)/2;
    }
    
    public int areaTrapezio(int baseMaior, int baseMenor, int altura){
        return ((baseMaior + baseMenor) * altura) /2;
    }
    
    public double areaCirculo(int raio){
        return 3.14 * Math.pow(raio, 2);
    }
}
