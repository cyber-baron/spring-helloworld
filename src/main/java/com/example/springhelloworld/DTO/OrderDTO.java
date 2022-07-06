package com.example.springhelloworld.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class OrderDTO {

    private final Long orderId;
    private final String orderStartDate;
    private final String orderEndDate;
}
