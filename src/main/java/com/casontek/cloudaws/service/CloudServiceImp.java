package com.casontek.cloudaws.service;


import com.casontek.cloudaws.model.Collection;
import com.casontek.cloudaws.model.Fashion;
import com.casontek.cloudaws.model.Material;
import com.casontek.cloudaws.model.ServiceResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CloudServiceImp implements CloudService{
    private  List<Collection> myCollections = new ArrayList<>();
    private  List<Fashion> myFashions = new ArrayList<>();
    private  List<Material> myMaterials = new ArrayList<>();

    @Override
    public ServiceResponse<List<Collection>> collections() {

        return new ServiceResponse<>(200, "success", myCollections);
    }

    @Override
    public ServiceResponse<List<Fashion>> fashions() {

        return new ServiceResponse<>(200, "success", myFashions);
    }

    @Override
    public ServiceResponse<List<Material>> materials() {

        return new ServiceResponse<>(200, "success", myMaterials);
    }

    @Override
    public ServiceResponse<Collection> addCollection(Collection collection) {
        //add new collection
        int id = 0;
        if(!myCollections.isEmpty()) {
            id = myCollections.size();
        }
        collection.setId(id);
        myCollections.add(collection);
        //results
        return new ServiceResponse<>(200, "success", collection);
    }

    @Override
    public ServiceResponse<Material> addMaterial(Material material) {
        //add new material
        int id = 0;
        if(!myMaterials.isEmpty()) {
            id = myMaterials.size();
        }
        material.setId(id);
        //result
        return new ServiceResponse<>(200, "success", material);
    }

    @Override
    public ServiceResponse<Fashion> addFashion(Fashion fashion) {
        //add new fashion
        int id = 0;
        if(!myFashions.isEmpty()) {
            id = myFashions.size();
        }
        fashion.setId(id);
        //result
        return new ServiceResponse<>(200, "success", fashion);
    }

    @Override
    public ServiceResponse<String> removeMaterial(String name) {
        for(int i=0; i < myMaterials.size(); i++) {
            if(myMaterials.get(i).getName() == name) {
                myMaterials.remove(i);
                return new ServiceResponse<>(200, "success", "Material with name "+ name + "deleted.");
            }
        }
        return new ServiceResponse<>(202, "failed", "Material with name "+ name + "not found.");
    }

    @Override
    public ServiceResponse<String> removeCollection(String name) {
        for(int c =0; c < myCollections.size(); c++) {
            if(myCollections.get(c).getName() == name) {
                myCollections.remove(c);
                return new ServiceResponse<>(200, "success", "Collection with name "+ name + "deleted.");
            }
        }
        return new ServiceResponse<>(202, "failed", "Collection with name "+ name + "not found.");
    }

    @Override
    public ServiceResponse<String> removeFashion(String name) {
        for(int i=0; i < myFashions.size(); i++) {
            if(myFashions.get(i).getName() == name) {
                myFashions.remove(i);
                return new ServiceResponse<>(200, "success", "Fashion with name "+ name + "deleted.");
            }
        }
        return new ServiceResponse<>(202, "failed", "Fashion with name "+ name + "not found.");
    }

}
