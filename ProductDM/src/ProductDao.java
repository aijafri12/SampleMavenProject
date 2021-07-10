import java.util.List;

public interface ProductDao {
	
	
	void add_product(ProductBean prod);
	
	int viewAll_products();
	
	
	int delete_product(int product_id);
	
	int update_product(int product_id);
	
	
	
	
	
	

}
