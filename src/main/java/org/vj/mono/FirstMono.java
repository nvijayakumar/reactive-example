/**
 * 
 */
package org.vj.mono;

import reactor.core.publisher.Mono;

/**
 * @author vijayakumar
 * @Since  18-Mar-2022
 *
 */
public class FirstMono {

	public static void main(String[] args) {
		//Mono<String> mono = Mono.just("Vijay").log();
		
		Mono<Object> mono = Mono.error(() -> new RuntimeException()).log();
		
		mono.subscribe(System.out::println,
				e -> System.out.println("Exception Occurred while onNext() event."));
	}

}
