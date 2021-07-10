package com.OOps;

public class ClientBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		AnnualEditionBook eb=new AnnualEditionBook();
		eb.setBook_name("Fictions book");
		eb.setBook_id(13);
		eb.setBook_price(130);
		eb.setDiscounte_price(23);
		
		
		System.out.println(eb.getBook_name()+" "+eb.getBook_id()+" "+eb.getBook_price()+" "+eb.getDiscounte_price());

	}

}
