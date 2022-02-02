

import java.util.Optional;

import com.javainuse.model.Item;

public class OptionalItemProcessor {

	public Optional<Item> getItem() {
		// Some logic here like webservice calls or db calls..
		// if item is successfully processed in our logic..then create optional
		// using Optional.of(Object)
		return Optional.of(item);
		// else if no item is returned from our logic then
		return Optional.empty();

	}
}