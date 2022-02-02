package com.javainuse;

import com.javainuse.model.Item;

public class ItemProcessor {

	public Item getItem() {
		// Some logic here like webservice calls or db calls
		 ItemProcessor ip= new ItemProcessor();
			Item item=ip.getItem();
			if(item!=null)
			System.out.println(item.getName());
		return item;

	}
}