package com.ronneyramon.petclinic.services.map;

import com.ronneyramon.petclinic.model.Pet;
import com.ronneyramon.petclinic.services.CrudService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet,Long> implements CrudService<Pet, Long> {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Pet obj) {
        return super.save(obj.getId(),obj);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
