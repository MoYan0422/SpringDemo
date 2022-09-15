package tw.wuyuhsi.product.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import tw.wuyuhsi.product.model.Product;
import tw.wuyuhsi.product.model.ProductRepository;
import tw.wuyuhsi.product.model.ProductService;

@Controller
@RequestMapping("product")
@SessionAttributes(names = {"totalPages","totalElements"})
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	
	@GetMapping("productqueryallmain.controller")
	public String processQueryAllMainAction() {
		return "product/productQueryAll";
	}
	
	@GetMapping("/query/{pid}") @ResponseBody
	public Product processQueryByIdAction(@PathVariable("pid") int pid) {
		return productService.findById(pid);
	}
	
	@PostMapping("/queryall") @ResponseBody
	public List<Product> processQueryAllAction() {
		return productService.findAll();
	}
	
	@PostMapping("/querybypage/{pageNo}") @ResponseBody
	public List<Product> processQueryByPage(@PathVariable("pageNo") int pageNo,Model m){
		int pageSize = 2;
		Pageable pageable = PageRequest.of(pageNo-1, pageSize);
		Page<Product> page = productService.findAllByPage(pageable);
		m.addAttribute("totalPages", page.getTotalPages());
		m.addAttribute("totalElements", page.getTotalElements());
		return page.getContent();
	}
	
}
