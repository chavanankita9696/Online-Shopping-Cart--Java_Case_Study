package com.online.shopping.cart.casestudy;

public class CustomerMain {

	public static void main(String[] args) {
		
		Cart[] c=new Cart[5];
		try {
			c[0]=new Cart("Shirt",600,200);
			for(int i=0;i<c.length;i++) {
				if(c[i]==null)
					throw new CartEmptyException("sorry,Your Cart Can not be Empty!");
				System.out.println(c[i]);
			}
		}
		catch(CartException e) {
			System.out.println(e);
		}

	}

}
