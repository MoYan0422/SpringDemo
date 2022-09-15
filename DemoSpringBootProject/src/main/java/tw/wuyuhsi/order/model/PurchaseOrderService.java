package tw.wuyuhsi.order.model;

import java.util.List;
import java.util.Optional;

import org.hibernate.sql.Insert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PurchaseOrderService {
	
	@Autowired
	private PurchaseOrderRepository purchaseOrderRepository;
	
	public PurchaseOrder insert(PurchaseOrder po) {
		return purchaseOrderRepository.save(po);
	}
	
	public PurchaseOrder findById(int id) {
		Optional<PurchaseOrder> op = purchaseOrderRepository.findById(id);
		if (op.isPresent()) {
			return op.get();
		}
		return null;
	}
	
	public List<PurchaseOrder> findAll() {
		return purchaseOrderRepository.findAll();
	}

}
