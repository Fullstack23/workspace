package com.senacshoes.api.medico;

import com.senacshoes.api.enderaco.DadosEndereco;

public record DadosCadastroMedico(String nome, String email, String crm, Especialidades especialidades, DadosEndereco endereco) {

}
