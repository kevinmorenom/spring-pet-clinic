package kevin.springframework.springpetclinic.services;

import kevin.springframework.springpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save (Pet pet);

    Set<Pet> findAll();
}
