package com.casontek.cloudaws.service;

import com.casontek.cloudaws.model.Collection;
import com.casontek.cloudaws.model.Fashion;
import com.casontek.cloudaws.model.Material;
import com.casontek.cloudaws.model.ServiceResponse;

import java.util.List;

public interface CloudService {
    ServiceResponse<List<Collection>> collections();
    ServiceResponse<List<Fashion>> fashions();
    ServiceResponse<List<Material>> materials();
    ServiceResponse<Collection> addCollection(Collection collection);
    ServiceResponse<Material> addMaterial(Material material);
    ServiceResponse<Fashion> addFashion(Fashion fashion);
    ServiceResponse<String> removeMaterial(String name);
    ServiceResponse<String> removeCollection(String name);
    ServiceResponse<String> removeFashion(String name);

}
