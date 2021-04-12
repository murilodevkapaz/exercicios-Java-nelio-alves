package utils;

import java.util.function.Consumer;

import models.entities.Product;

public class PriceUpdate implements Consumer<Product> {

	@Override
	public void accept(Product p) {
		p.setPrice(p.getPrice()*1.1);//aumenta em 10%
	}

}
