package com.me_backend.me.reseva;

import java.time.LocalDate;

public record ReservaDTO(String nome , String sexo , String email, LocalDate dataChegada , int numeroNoites , int numeroHospedes, String mensagem) {

}

