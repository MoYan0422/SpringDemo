package tw.wuyuhsi.order.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseOrderRepository extends JpaRepository<PurchaseOrder, Integer> {
	
}
