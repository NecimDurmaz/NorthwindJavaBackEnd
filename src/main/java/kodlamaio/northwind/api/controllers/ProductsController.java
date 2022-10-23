package kodlamaio.northwind.api.controllers;
import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.entities.concretes.Product;
import kodlamaio.northwind.entities.dtos.ProductWithCategoryDto;
@RestController
@RequestMapping("/api/products")
public class ProductsController {
	
	private ProductService productService;
 
	
	@Autowired 
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}
	
	@GetMapping("/getall")
  public DataResult<List<Product>> getAll(){
	return this.productService.getAll();
  }
	@GetMapping("/getallPage")
	  public DataResult<List<Product>> getAll(int pageNo,int PageSize){
		return this.productService.getAll( pageNo, PageSize);
	  }
	
	@PostMapping("/add")
	  public Result Add(@RequestBody Product product){
		return 		this.productService.add(product);
  }
	@GetMapping("/getByProductName")
	public DataResult<Product> getByProductName(@RequestParam String productName){
		return this.productService.getByProductName(productName);
	}
	
	@GetMapping("/getByProductNameAndCategoryId")
	public DataResult<Product>getByProductNameAndCategoryId(@RequestParam String productName,@RequestParam int categoryId){
		return this.productService.getByProductNameAndCategoryId(productName, categoryId);
	}
	
	@GetMapping("/getByProductNameOrCategoryId")
	public DataResult<List<Product>>getByProductNameOrCategoryId(@RequestParam("productName") String productName,@RequestParam("categoryId") int categoryId){
		return this.productService.getByProductNameOrCategoryId(productName, categoryId);
	}
	
	@GetMapping("/getByCategoryIdIn")
	public DataResult<List<Product>>getByCategoryIdIn(List<Integer> categories){
		return this.productService.getByCategoryIdIn(categories);
	}
	@GetMapping("/getByProductNameContains")
	DataResult<List<Product>>getByProductNameContains(String productName){
		return this.productService.getByProductNameContains(productName);
	}
	@GetMapping("/getByProductNameStartWith")
	DataResult<List<Product>>getByProductNameStartWith(String productName){
		return this.productService.getByProductNameStartWith(productName);
	}
	
	@GetMapping("/getAllDesc")
	DataResult<List<Product>>getAllSorted(){
		return this.productService.getAllSorted();
	}
	
	@GetMapping("/getProductWithCategoryDetails")
	DataResult<List<ProductWithCategoryDto>>getProductWithCategoryDetails(){
		return this.productService.getProductWithCategoryDetails();
	}
}
