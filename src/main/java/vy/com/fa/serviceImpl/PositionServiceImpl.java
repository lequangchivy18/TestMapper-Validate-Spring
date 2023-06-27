package vy.com.fa.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import vy.com.fa.entity.Position;
import vy.com.fa.repository.PositionRepository;
import vy.com.fa.service.PositionService;

@Service
public class PositionServiceImpl implements PositionService {

	@Autowired
	@Qualifier(value = "positionRepository")
	private PositionRepository positionRepository;

	@Override
	public void save(Position position) {
		positionRepository.save(position);
	}

	@Override
	public boolean existsById(String id) {
		// TODO Auto-generated method stub
		return positionRepository.existsById(id);
	}

}
