package com.github.tlobato.rh.service.reajuste;

import com.github.tlobato.rh.ValidacaoException;
import com.github.tlobato.rh.model.Funcionario;
import com.github.tlobato.rh.service.ValidacaoReajuste;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class ValidacaoPercentualReajuste implements ValidacaoReajuste {

    public void validar(Funcionario funcionario, BigDecimal aumento) {
        BigDecimal salarioAtual = funcionario.getSalario();
        BigDecimal percentualReajuste = aumento.divide(salarioAtual, RoundingMode.HALF_UP);
        if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
            throw new ValidacaoException("Reajuste nao pode ser superior a 40% do salario!");
        }
    }
}
