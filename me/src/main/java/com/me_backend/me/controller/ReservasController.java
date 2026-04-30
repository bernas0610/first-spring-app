package com.me_backend.me.controller;

import com.me_backend.me.reseva.ReservaDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reservas")

public class ReservasController {
    @PostMapping
    public String criarReserva(@RequestBody ReservaDTO reserva){
        return "Reserva recebida com sucesso!\n" +
                "Nome: " + reserva.nome() +
                "\nEmail: " + reserva.email() +
                "\nData de chegada: " + reserva.dataChegada();

    }


       

    }





