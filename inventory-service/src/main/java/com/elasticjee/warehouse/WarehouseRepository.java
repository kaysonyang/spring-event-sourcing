package com.elasticjee.warehouse;

import org.springframework.data.neo4j.repository.GraphRepository;

/**
 * @author chaokunyang
 */
public interface WarehouseRepository extends GraphRepository<Warehouse> {
}
