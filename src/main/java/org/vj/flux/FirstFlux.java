/**
 * 
 */
package org.vj.flux;

import reactor.core.publisher.Flux;

/**
 * @author vijayakumar
 * @Since  17-Mar-2022
 *
 */
public class FirstFlux {

	public static void main(String[] args) {
		Flux<String> flux = Flux.just("Jaya", "Vijay", "Subi");
		
		flux.subscribe(System.out::println);
	}

}
