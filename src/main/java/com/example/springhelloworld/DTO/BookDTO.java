package com.example.springhelloworld.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class BookDTO {

    private final Long bookId;
    private final String bookName;
    private final int bookPublishDate;
}
