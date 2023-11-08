package com.casontek.cloudaws.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class Collection {

    @Getter
    @Setter
    int id;
    @Getter
    @Setter
    String name;
    @Getter
    @Setter
    String description;
    @Getter
    @Setter
    String designer;

}
