/**
 * 
 */
package org.vj.scheduler;

import java.util.Arrays;
import java.util.List;

import org.vj.pojo.Order;

import reactor.core.publisher.Flux;
import reactor.core.scheduler.Schedulers;

/**
 * @author vijayakumar
 * @Since  30-Oct-2022
 *
 */
public class ImmediateScheduler {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Started with - " + Thread.currentThread().getName());
		
		Flux<Order> orderFlux = Flux.just(
				new Order(1l, 100.0),
				new Order(2l, 200.0),
				new Order(3l, 300.0)).log();
		
		Flux<Long> longFlux = orderFlux
				.publishOn(Schedulers.immediate())
				.map(order -> {
					System.out.println("Map with - " + Thread.currentThread().getName());
					return order.getId();
				});
		
		longFlux.subscribe(orderId -> System.out.println("Sub with -" + Thread.currentThread().getName()));
		System.out.println("Ended with - " + Thread.currentThread().getName());

	}

}
