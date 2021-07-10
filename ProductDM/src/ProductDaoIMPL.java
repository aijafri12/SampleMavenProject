import java.util.ArrayList;
import java.util.List;

public class ProductDaoIMPL implements ProductDao {
	
	List<ProductBean> prod;
	
	public ProductDaoIMPL() {
		
		prod=new ArrayList<ProductBean>();
		
		ProductBean product_1 =new ProductBean("iphone", 10);
		
		ProductBean product_2=new ProductBean("iphone_x", 12);
		
		prod.add(product_1);
		prod.add(product_1);
		
		
	}
	


	@Override
	public void add_product(ProductBean prod) {
		
		
	}

	@Override
	public int viewAll_products() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete_product(int product_id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update_product(int product_id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
