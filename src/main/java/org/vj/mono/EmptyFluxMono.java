/**
 * 
 */
package org.vj.mono;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author vijayakumar
 * @Since  18-Mar-2022
 *
 */
public class EmptyFluxMono {

	public static void main(String[] args) {
		
		System.out.println("Flux.............");
		Flux<?> flux = Flux.empty().log();
		flux.subscribe(System.out::println);
		
		System.out.println("Mono.............");
		String s = null;
//		Mono<?> mono = Mono.empty().log();
		Mono<?> mono = Mono.justOrEmpty(s).log();
		mono.subscribe();
	}

}
