package com.github.tlobato.rh.service;

import com.github.tlobato.rh.model.Funcionario;
import java.math.BigDecimal;

public interface ValidacaoReajuste {

    /*
    Com a utilização dessa interface para implementar o OCP - OPEN CLOSE PRINCIPLE, nós acabamos seguindo também
    o príncipio DIP - DEPENDENCY INVERSION PRINCIPLE, a letra 'D' do Solid.
    Pois dessa forma, sempre que for necessário fazer uma nova validação, basta criarmos uma nova classe
    que implementa essa interface, sem a necessidade de mexer na classe ReajusteService.
     */

    void validar(Funcionario funcionario, BigDecimal aumento);

}
