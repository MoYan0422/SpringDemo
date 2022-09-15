package tw.wuyuhsi.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tw.wuyuhsi.model.Bird;
import tw.wuyuhsi.model.BirdRepository;

@Service
@Transactional
public class BirdService {
	@Autowired
	private BirdRepository birdRepository;
	
	public Bird	insert(Bird bird) {
		return birdRepository.save(bird);
	}
	public Bird	update(Bird bird) {
		return birdRepository.save(bird);
	}
	public void deleteById(Integer id) {
		birdRepository.deleteById(id);
	}
	public Bird	selectById(Integer id) {
		 Optional<Bird> findById = birdRepository.findById(id);
		 if (findById.isPresent()) {
			return findById.get();
		}
		 return null;
	}
	
}
