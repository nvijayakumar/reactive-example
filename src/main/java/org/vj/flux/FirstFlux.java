/**
 * 
 */
package org.vj.flux;

import javax.management.RuntimeErrorException;

import reactor.core.publisher.Flux;

/**
 * @author vijayakumar
 * @Since  17-Mar-2022
 *
 */
public class FirstFlux {

	public static void main(String[] args) {
		Flux<String> flux = Flux.just("Jaya", "Vijay", "Subi")
					//.concatWith(Flux.error(() -> new RuntimeException()))
					.concatWithValues("Dad").log();
		
		System.out.println("concatWith................");
		//append another flux into the flux
		Flux<String> flux1 = Flux.just("Vignesh").log();
		flux = flux.concatWith(flux1);
		
		System.out.println("subscribe................");
		flux.subscribe(System.out::println, 
				e -> System.out.println("Exception Occurred while onNext() event."),
				() -> System.out.println("onComplete event post process."));
		
	}

}
