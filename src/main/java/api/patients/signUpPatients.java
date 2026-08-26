package api.patients;

import api.Address.DataAddress;
import api.doctors.Especialidade;

public record signUpPatients(String nome, String email,String celular, Especialidade especialidade, DataAddress endereco) {
}
