package com.casontek.cloudaws.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class Fashion {
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
    String designedDate;
    @Getter
    @Setter
    String priceRange;
    @Getter
    @Setter
    String designer;
    @Getter
    @Setter
    String collection;
}
