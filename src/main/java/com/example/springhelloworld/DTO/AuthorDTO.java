package com.example.springhelloworld.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@AllArgsConstructor
@Getter
@Setter
public class AuthorDTO {

    private final Long authorId;
    private final String authorName;
    private final String authorSurname;
    private final String authorSecondName;

    @Temporal(TemporalType.DATE)
    private final Date authorBirthDate;
}
