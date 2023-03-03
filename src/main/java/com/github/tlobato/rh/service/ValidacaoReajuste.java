package com.github.tlobato.rh.service;

import com.github.tlobato.rh.model.Funcionario;
import java.math.BigDecimal;

public interface ValidacaoReajuste {

    void validar(Funcionario funcionario, BigDecimal aumento);

}
