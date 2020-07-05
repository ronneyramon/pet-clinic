package com.ronneyramon.petclinic.services.map;

import com.ronneyramon.petclinic.model.Vet;
import com.ronneyramon.petclinic.services.CrudService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet,Long> implements CrudService<Vet,Long> {
    @Override
    public Set<Vet> findAll() {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void delete(Vet object) {

    }

    @Override
    public Vet save(Vet obj) {
        return null;
    }

    @Override
    public Vet findById(Long id) {
        return null;
    }
}
