package tw.wuyuhsi.order.controller;



import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import tw.wuyuhsi.order.model.PurchaseOrder;
import tw.wuyuhsi.order.model.PurchaseOrderService;

@Controller
@RequestMapping("/order")
public class PurchaseOrderController {
	
	@Autowired
	private PurchaseOrderService purchaseOrderService;
	
	@GetMapping("/poproductlist")
	public String processPoProdustListAction() {
		return "order/purchaseOrderProductList";
	}
	
	@GetMapping("/poiteminfo")
	public String processPoProdustItemAction(@RequestParam int pid ,Model m) {
		m.addAttribute("pid", pid);
		return "order/purchaseOrderProduct";
		
	}
	@PostMapping("/poinsert")
	@ResponseBody
	public PurchaseOrder processPoInsert(@RequestBody PurchaseOrder po) {
		po.setOdate(new Date());
		return purchaseOrderService.insert(po);
	}
	
	
}
