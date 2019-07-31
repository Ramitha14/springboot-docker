package com.stackroute.mongoDB;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
@Data
@Builder
public class Track {
    @Id
    @ApiModelProperty(notes = "The Track id")
    int trackid;
    @ApiModelProperty(notes = "Name of the track")
    String trackname;
    @ApiModelProperty(notes = "Comments about the track")
    String trackcomment;

}
