package com.enosh.articles.services;


import java.util.List;
import java.util.Optional;

public interface EntityService<Entity, ID> {

   Entity add(Entity entity);

   Optional<Entity> findById(ID id);

   List<Entity> findAll();
}
