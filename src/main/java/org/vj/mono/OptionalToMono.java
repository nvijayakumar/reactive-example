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
//		Optional<String> optional = Optional.of("Vijay");
		
//		Optional<String> optional = Optional.empty();
		
		Optional<String> optional = null;
		
		Mono<String> optionalMono = Mono.justOrEmpty(optional).log();
		
		optionalMono.subscribe(System.out::println);
	}

}
