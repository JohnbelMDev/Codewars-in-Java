package com.javainuse;

import java.util.Optional;

import com.javainuse.model.Item;

public class OptionalItemProcessor {

	public Item getItem() {
		// Some logic here like webservice calls or db calls..
		// if item is successfully processed in our logic..then create optional
		// using Optional.of(Object)
		return item;
		// else if no item is returned from our logic then
		return null;

	}
}