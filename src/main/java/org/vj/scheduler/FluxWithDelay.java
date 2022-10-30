/**
 * 
 */
package org.vj.scheduler;

import java.time.Duration;

import reactor.core.publisher.Flux;

/**
 * @author vijayakumar
 * @Since  30-Oct-2022
 *
 */
public class FluxWithDelay {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		
		Flux<Integer> intFlux = Flux.range(1, 10).delayElements(Duration.ofSeconds(1));
		
		intFlux.subscribe(i -> System.out.println(i + " - " + Thread.currentThread().getName()));
		
		Thread.sleep(15000);
	}

}
