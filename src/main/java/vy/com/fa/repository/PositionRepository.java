package vy.com.fa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import vy.com.fa.entity.Position;

@Repository
public interface PositionRepository extends CrudRepository<Position, String> {

}
