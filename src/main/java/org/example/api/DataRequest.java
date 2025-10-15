package org.example.api;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class DataRequest {
    private String message;
    private LocalDate date;
    private String[] items;
}


