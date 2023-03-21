package org.sample.soaptest.repository;

import io.spring.guides.gs_producing_web_service.Item;
import org.springframework.data.aerospike.repository.AerospikeRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends AerospikeRepository<Item, Integer>{


}