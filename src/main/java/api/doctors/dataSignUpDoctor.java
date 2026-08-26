package api.doctors;

import api.Address.DataAddress;

public record dataSignUpDoctor(String nome, String email, String crm, Especialidade especialidade, DataAddress endereco) {
}
