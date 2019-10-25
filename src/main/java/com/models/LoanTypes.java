package com.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class LoanTypes {

    @JsonProperty("ID")
    public Long Id;

    @JsonProperty("type")
    public String type;

}
