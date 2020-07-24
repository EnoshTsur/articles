package com.enosh.articles.services;


import com.enosh.articles.model.BaseEntity;

import java.util.List;
import java.util.Optional;

public interface EntityService<Entity extends BaseEntity, ID> {

   Entity add(Entity entity);

   Optional<Entity> findById(ID id);

   List<Entity> findAll();
}
