/**
 * 
 */
package org.vj.flux;

import org.vj.pojo.Item;

import reactor.core.publisher.Flux;

/**
 * @author vijayakumar
 * @Since  25-Mar-2022
 *
 */
public class FlatMapFlux {

	public static void main(String[] args) {
		Flux<Long> longFlux = Flux.just(1l, 2l, 3l);
		
		Flux<Item> itemFlux = longFlux.flatMap(l -> getItems(l)).log();
		
		itemFlux.subscribe(i -> System.out.println(i.getItemName()));
	}
	
	private static Flux<Item> getItems(Long id) {
		return Flux.just(
				new Item(1l, "Item-1"),
				new Item(2l, "Item-2"),
				new Item(3l, "Item-3")
				);
	}

}
