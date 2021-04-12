package models.util;

import java.util.function.Predicate;

import models.entities.Product;

public class ProductPredicate implements Predicate<Product>{

	@Override
	public boolean test(Product t) {
		return t.getPrice() >= 500;
	}
}
