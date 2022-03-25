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
public class FluxRange {

	public static void main(String[] args) {
		Flux<Integer> intFlux = Flux.range(4, 0);	//flux of values
		
		//Flux<Integer> intFlux = Flux.range(4, 0);	//empty flux
		
		intFlux.subscribe(System.out::println);
	}

}
