package vy.com.fa.service;

import vy.com.fa.entity.Position;

public interface PositionService {
	void save(Position position);
	
	boolean existsById(String id);
}
