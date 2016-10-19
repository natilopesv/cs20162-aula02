package com.github.natalialopessilva.cs20162.aula02;

/**
 * Implementação do Potência Usando Somas.
 *
 * <p>
 * Algoritmo correspondente obtido da Lista de exercícios correspondentes a aula
 * 2, da disciplina Construção de software do prof. Fábio Nogueira de Lucena.
 *
 * Importante ressaltar que nesse algoritmo utilizamos a classe
 * ProdutoInteiroPsotivoUsandoSoma já criada no projeto.
 *
 */
public class PotenciaUsandoSoma {

    /**
     * Construtor da classe.
     */
    protected PotenciaUsandoSoma() {
    }

    /**
     * Acessa o construtor da Classe.
     */
    public static void setPotenciaUsandoSoma() {
        PotenciaUsandoSoma potenciaUsandoSomaeroPrimo
                = new PotenciaUsandoSoma();
    }

    /**
     * Obtém a potência de um número com seu expoente.
     *
     * @param x O numero da base. Valor igual ou maior que 0.
     * @param y O expoente de x. Valor igual ou maior que 0.
     *
     * @return O valor resultante da potência.
     *
     * @throws IllegalArgumentException Se x ou y for inválido (menor que 0).
     */
    public static int potencia(final int x, final int y) {

        if (x < 0 || y < 0) {
            throw new IllegalArgumentException("valor de x ou y deve ser maior "
                    + " que 0.");
        }

        int potencia = 1, i = 1;

        do {
            potencia = ProdutoInteiroPositivoUsandoSoma.produtoComSoma(potencia,
                    x);
            i++;
        } while (i <= y);

        return potencia;
    }
}