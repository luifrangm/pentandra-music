package com.pentandra.music.models.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientDto {

    private long clientID;

    private String clientName;

    private long clientPhone;

    private String clienteMail;

}
