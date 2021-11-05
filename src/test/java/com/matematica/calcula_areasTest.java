/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.matematica;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author bela
 */
public class calcula_areasTest {
    
    private calcula_areas objetoTeste;
    
    
    public calcula_areasTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        objetoTeste = new calcula_areas();
        
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void TestAreaTriangulo(){
        assertEquals(200, objetoTeste.areaTriangulo(40, 10)); 
    }
    @Test
    public void TestAreaTrapezio(){
        assertEquals(90, objetoTeste.areaTrapezio(30, 15, 4)); 
    }
    @Test
    public void TestAreaCirculo(){
        assertEquals(23.67, objetoTeste.areaCirculo(2)); //Valor Incorreto Proposital para ocasionar erro no teste. O correto seria 12.56
    }
    
}
