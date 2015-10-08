/**
 * Pequeno método que verifica se o quadrado da soma de dois inteiros é igual
 * ao inteiro forcecido como argumento.
 */

package br.ufg.inf.es.construcao.algoritmo7;

public class Algoritmo7 {
    
    /**
     * @param   n inteiro a ser verificado
     * @return  true se o quadrado da soma é igual ao argumento fornecido.
     * @return  false se o quadrado da soma nao e igual ao argumento fornecido.
     */
    public static boolean verificaQuadradoDaSoma(int n) {

        if (n < 0 || n > 9999) {
            throw new IllegalArgumentException("O valor deve estar entre 0 e 9999, inclusive");
        }
        
        int i;
        int j;
        boolean isQuadradoDaSoma;

        i = n / 100;
        j = n % 100;

        if (Math.pow((i + j), 2) == n) {
            isQuadradoDaSoma = true;
        } else {
            isQuadradoDaSoma = false;
        }

        return isQuadradoDaSoma;
    }
}
