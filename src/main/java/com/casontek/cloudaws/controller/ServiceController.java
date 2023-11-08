package com.casontek.cloudaws.controller;

import com.casontek.cloudaws.model.Collection;
import com.casontek.cloudaws.model.Fashion;
import com.casontek.cloudaws.model.Material;
import com.casontek.cloudaws.model.ServiceResponse;
import com.casontek.cloudaws.service.CloudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cloud-aws/api/service")
public class ServiceController {
    @Autowired
    private CloudService cloudService;

    @GetMapping("test")
    public ServiceResponse<String> apiTest() {
        return new ServiceResponse<>(
                200,
                "success",
                "AWS Cloud Service API."
        );
    }

    @GetMapping("collections")
    public ServiceResponse<List<Collection>> getCollections() {
        return cloudService.collections();
    }

    @GetMapping("materials")
    public ServiceResponse<List<Material>> getMaterials() {
        return cloudService.materials();
    }

    @GetMapping("fashion")
    public ServiceResponse<List<Fashion>> listFashion() {
        return cloudService.fashions();
    }

    @PostMapping("material")
    public ServiceResponse<Material> newMaterial(@RequestBody Material m) {
        return cloudService.addMaterial(m);
    }

    @PostMapping("collection")
    public ServiceResponse<Collection> newCollection(@RequestBody Collection c) {
        return cloudService.addCollection(c);
    }

    @PostMapping("fashion")
    public ServiceResponse<Fashion> newFashion(@RequestBody Fashion f) {
        return cloudService.addFashion(f);
    }

    @DeleteMapping("material/{name}")
    public ServiceResponse<String> deleteMaterial(@PathVariable("name") String name) {
        return cloudService.removeMaterial(name);
    }

    @DeleteMapping("fashion/{name}")
    public ServiceResponse<String> deleteFashion(@PathVariable("name") String name) {
        return cloudService.removeFashion(name);
    }

    @DeleteMapping("collection/{name}")
    public ServiceResponse<String> deleteCollection(@PathVariable("name") String name) {
        return cloudService.removeCollection(name);
    }

}
