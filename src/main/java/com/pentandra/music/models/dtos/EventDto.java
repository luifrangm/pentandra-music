package com.pentandra.music.models.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data

public class EventDto {

    private String eventID;

    private String eventName;

    private String eventPlace;

    private long eventDateTime;

    private String eventDescription;

}
