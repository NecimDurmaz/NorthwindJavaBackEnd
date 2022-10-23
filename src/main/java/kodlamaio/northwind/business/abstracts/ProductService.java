package kodlamaio.northwind.business.abstracts;
 
import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Product;
import kodlamaio.northwind.entities.dtos.ProductWithCategoryDto;

@Service
public interface ProductService {
	DataResult<List<Product>> getAll();	
	DataResult<List<Product>> getAllSorted();
	DataResult<List<Product>> getAll(int pageNo,int PageSize);
	Result add(Product product);
	//Result delete(Product product);

	DataResult<Product> getByProductName(String productName);
	
	DataResult<Product>getByProductNameAndCategoryId(String productName,int categoryId);

	DataResult<List<Product>>getByProductNameOrCategoryId(String productName,int categoryId);
	
	DataResult<List<Product>>getByCategoryIdIn(List<Integer> categories);

	DataResult<List<Product>>getByProductNameContains(String productName);

	DataResult<List<Product>>getByProductNameStartWith(String productName);

	DataResult<List<Product>>GetByNameAndCategory(String productName, int categoryId);
	
	DataResult<List<ProductWithCategoryDto>> getProductWithCategoryDetails();
}
