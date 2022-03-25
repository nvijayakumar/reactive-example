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
public class ArrayToFlux {

	public static void main(String[] args) {
		String[] array = new String[] {"Vijay","Jaya","Subi"};
		
		Flux<String> arrayFlux = Flux.fromArray(array).log();

		arrayFlux.subscribe(System.out::println);
	}

}
