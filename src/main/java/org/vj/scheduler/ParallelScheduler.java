/**
 * 
 */
package org.vj.scheduler;

import org.vj.pojo.Order;

import reactor.core.publisher.Flux;
import reactor.core.scheduler.Schedulers;

/**
 * @author vijayakumar
 * @Since  30-Oct-2022
 *
 */
public class ParallelScheduler {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Started with - " + Thread.currentThread().getName());
		
		Flux<Order> orderFlux = Flux.just(
				new Order(1l, 100.0),
				new Order(2l, 200.0),
				new Order(3l, 300.0)).log();
		
		Flux<Long> longFlux = orderFlux
				.publishOn(Schedulers.parallel())
				.map(order -> {
					System.out.println("Map 1 with - " + Thread.currentThread().getName());
					return order.getId();
				})
				.publishOn(Schedulers.parallel())
				.map(order -> {
					System.out.println("Map 2 with - " + Thread.currentThread().getName());
					return order * 2;
				});
		
		longFlux.subscribe(orderId -> System.out.println("Sub with -" + Thread.currentThread().getName()));
		System.out.println("Ended with - " + Thread.currentThread().getName());
		Thread.sleep(6000);

	}

}
