package com.javainuse;

import java.util.Optional;

import com.javainuse.model.Item;

public class OptionalItemProcessor {

	public Optional<Item> getItem() {
		// Some logic here like webservice calls or db calls..
		OptionalItemProcessor ip1= new OptionalItemProcessor();
		Optional<Item> item=ip1.getItem();
		if(!item.isPresent())
		{
			System.out.println("not present");
		}else
//		System.out.println(item.get().getName());
		// if item is successfully processed in our logic..then create optional
		// using Optional.of(Object)
//		return Optional.of(item);
		// else if no item is returned from our logic then
		return Optional.empty();

	}
}