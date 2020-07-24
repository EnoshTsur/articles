package com.enosh.articles.services;


import com.enosh.articles.model.BaseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface EntityService<Entity extends BaseEntity, ID> {

   Entity add(Entity entity) throws Exception;

   Optional<Entity> findById(ID id);

   List<Entity> findAll();
}
