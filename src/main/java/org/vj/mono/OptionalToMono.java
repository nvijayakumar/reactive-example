/**
 * 
 */
package org.vj.mono;

import java.util.Optional;

import reactor.core.publisher.Mono;

/**
 * @author vijayakumar
 * @Since  25-Mar-2022
 *
 */
public class OptionalToMono {

	public static void main(String[] args) {
//		Optional<String> optional = Optional.of("Vijay");	// mono with value
		
//		Optional<String> optional = Optional.empty();	// empty mono
		
		Optional<String> optional = null;	// empty mono
		
		Mono<String> optionalMono = Mono.justOrEmpty(optional).log();
		
		optionalMono.subscribe(System.out::println);
	}

}
