package com.products.Items.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.products.Items.Entity.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

}
