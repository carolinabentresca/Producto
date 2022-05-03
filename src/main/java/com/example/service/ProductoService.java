package com.example.service;

import com.example.model.Producto;
import java.util.*;
import com.example.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {

    @Autowired
    ProductoRepository repository;

    //List Productos
    public List<Producto> list() {
        return repository.findAll();
    }

    //Save Producto
    public Producto save(Producto producto) {
        return repository.save(producto);
    }

    //Get Producto By Id
    public Producto get(int id) {
        return repository.findById(id).get();
    }

    //Delete Producto
    public void delete(int id) {
        repository.deleteById(id);
    }

}
