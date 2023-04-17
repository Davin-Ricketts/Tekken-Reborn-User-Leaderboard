package com.ricketts.cpan252.tekkenuserdashboard.repository;

import org.springframework.data.repository.CrudRepository;

import com.ricketts.cpan252.tekkenuserdashboard.model.Item;

public interface ItemRepository extends CrudRepository<Item, Integer> {

}
