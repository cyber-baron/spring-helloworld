package com.example.springhelloworld.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class UserDTO {

    private final Long userId;
    private final String userName;
    private final String userSurname;
    private final String userSecondName;
    private final int userPhoneNumber;
}
