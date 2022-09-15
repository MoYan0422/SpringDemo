package tw.wuyuhsi.product.model;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public Product findById(int id) {
		Optional<Product> op = productRepository.findById(id);
		if (op.isPresent()) {
			return op.get();
		}
		return null;
	}
	
	public List<Product> findAll(){
		return productRepository.findAll();
	}
	public Page<Product> findAllByPage( Pageable pageable) {
		return productRepository.findAll(pageable);
	}

}
