package com.casontek.cloudaws.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
public class Material {
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
    int price;
    @Getter
    @Setter
    String currency;
    @Getter
    @Setter
    List<String> colors;
    @Getter
    @Setter
    String type;
}
