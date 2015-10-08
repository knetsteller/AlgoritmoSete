
package br.ufg.inf.es.construcao.algoritmo7;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class Algoritmo7Test {
    
    Algoritmo7 algoritmo7;
    
    public Algoritmo7Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        algoritmo7 = new Algoritmo7();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void verificaQuadradoDaSoma_nIgualA100_falso() {
        System.out.println("verificaQuadradoDaSoma");
        int n = 100;
        boolean valorAtual = algoritmo7.verificaQuadradoDaSoma(n);
        assertEquals(false, valorAtual);
    }
    
    @Test
    public void verificaQuadradoDaSoma_nIgualAZero_true() {
        System.out.println("verificaQuadradoDaSoma");
        int n = 0;
        boolean valorAtual = algoritmo7.verificaQuadradoDaSoma(n);
        assertEquals(true, valorAtual);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void verificaQuadradoDaSoma_nIgualA1000_LancaExcecao() {
        System.out.println("verificaQuadradoDaSoma");
        int n = 10000;
        algoritmo7.verificaQuadradoDaSoma(n);        
    }
}
