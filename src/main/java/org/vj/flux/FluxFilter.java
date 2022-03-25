/**
 * 
 */
package org.vj.flux;

import reactor.core.publisher.Flux;

/**
 * @author vijayakumar
 * @Since  25-Mar-2022
 *
 */
public class FluxFilter {

	public static void main(String[] args) {
		Flux<String> stringFlux = Flux.just("Vijay", "Jaya", "Subhi")
				.filter(s -> s.length() >= 4)
				.log();
		
		stringFlux.subscribe(System.out::println);
	}

}
