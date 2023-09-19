package com.tasktracker.tasktracker.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CreateTableDTO {
    String title;
    String description;
    String deadline;
}
