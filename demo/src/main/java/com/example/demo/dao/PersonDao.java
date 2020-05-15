package com.example.demo.dao;

import com.example.demo.model.Person;

import java.util.UUID;
import java.util.List;
import java.util.Optional;

public interface PersonDao {
    String insertPerson(UUID id, Person person);

    default String insertPerson(Person person){
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }

    List<Person> selectAllPeople();

    Optional<Person> selectPersonById(UUID uuid);

    int deletePersonById(UUID uuid);

    int updatePerson(UUID uuid, Person person);
}
