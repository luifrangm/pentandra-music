package com.pentandra.music.services;

import com.pentandra.music.models.dtos.ClientDto;

public class ClientService {

ClientDto cliente = new ClientDto();


    public void guardar (){

        cliente.setClientID(1006958475);
        cliente.setClientName("Eren José");
        cliente.setClienteMail("ErenJosé123@gmail.com");
        cliente.setClientPhone(306489595);

    }

    public void buscar (){

        cliente.setClientID(1006958475);
        cliente.setClientName("Eren José");
        cliente.setClienteMail("ErenJosé123@gmail.com");
        cliente.setClientPhone(305689595);

    }

    public void listar (){

    }

    public void desactivar (){

        System.out.println("Se ha desactivado su usuario de nuestra aplicación");

    }
}
