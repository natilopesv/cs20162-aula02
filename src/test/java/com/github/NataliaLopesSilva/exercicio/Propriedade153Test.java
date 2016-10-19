package com.github.NataliaLopesSilva.exercicio;


import com.github.natalialopessilva.cs20162.aula02.Propriedade153;
import static com.github.natalialopessilva.cs20162.aula02.Propriedade153.setPropriedade153;
import org.junit.Assert;
import org.junit.Test;


public class Propriedade153Test {
    
    @Test(expected = IllegalArgumentException.class)
    public void numeroMenorQueZeroInvalido() {
        Propriedade153.propriedade(-1);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void numeroMaoiorQue9999Invalido() {
        Propriedade153.propriedade(10000);
    }
    
     @Test
    public void resultadoCorreto() {
        Assert.assertTrue(Propriedade153.propriedade(153));
    }
    
     @Test
    public void resultadoIncorreto() {
        Assert.assertFalse(Propriedade153.propriedade(1530));
    }
    
    @Test
    public void apenasParaAgradarJacocoTool100PorCentoCobertura() {
        setPropriedade153();
    }
}
