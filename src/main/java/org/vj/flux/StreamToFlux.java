/**
 * 
 */
package org.vj.flux;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import reactor.core.publisher.Flux;

/**
 * @author vijayakumar
 * @Since  25-Mar-2022
 *
 */
public class StreamToFlux {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Vijay","Jaya","Subi");	//flux with values
		
		//List<String> list = Arrays.asList();	//empty flux
		
		Stream<String> stream = list.stream();
		
		Flux<String> streamFlux = Flux.fromStream(stream).log();
		
		streamFlux.subscribe(System.out::println);
	}

}
