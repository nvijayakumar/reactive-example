/**
 * 
 */
package org.vj.flux;

import java.util.stream.Collectors;

import org.vj.pojo.Order;

import reactor.core.publisher.Flux;

/**
 * @author vijayakumar
 * @Since  25-Mar-2022
 *
 */
public class MapFlux {

	public static void main(String[] args) {
		Flux<Order> orderFlux = Flux.just(
					new Order(1l, 100.0),
					new Order(2l, 200.0),
					new Order(3l, 300.0)
				);
		
		Flux<Long> longFlux = orderFlux
					.filter(o -> o.getAmount() > 100.0)
					.map(o -> {
						System.out.println("Inside Map");
						return o.getId();
					})
					.log();
				
		System.out.println("---------------");
		longFlux.subscribe(System.out::println);
	}

}
