/**
 * 
 */
package org.vj.flux;

import java.util.Arrays;
import java.util.List;

import reactor.core.publisher.Flux;

/**
 * @author vijayakumar
 * @Since  25-Mar-2022
 *
 */
public class ListToFlux {

	public static void main(String[] args) {
		//List<String> list = Arrays.asList("Vijay", "Jaya", "Subi");	//Flux with values
		
		//List<String> list = Arrays.asList();	// empty flux
		
		List<String> list = null;	// null pointer exception
		
		Flux<String> listFlux = Flux.fromIterable(list).log();
		
		listFlux.subscribe(System.out::println);
	}

}
