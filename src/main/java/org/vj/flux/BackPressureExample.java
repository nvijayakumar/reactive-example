/**
 * 
 */
package org.vj.flux;

import org.reactivestreams.Subscription;

import reactor.core.publisher.BaseSubscriber;
import reactor.core.publisher.Flux;

/**
 * @author vijayakumar
 * @Since  30-Oct-2022
 *
 */
public class BackPressureExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Flux<Integer> integerFlux = Flux.range(1, 10).log();
		
		//integerFlux.subscribe(System.out::println, e -> System.out.println(e), () -> System.out.println("Completed"));
		
		integerFlux.subscribe(new BaseSubscriber<Integer>() {
			@Override
			protected void hookOnSubscribe(Subscription subscription) {
				for (int i=1; i<=5; i++) {
					subscription.request(2);
				}
			}
			
			@Override
			protected void hookOnNext(Integer value) {
				if(value ==5) {
					cancel();
				}
				System.out.println(value);
			}
			
			@Override
			protected void hookOnComplete() {
				System.out.println("Completed");
			}
			
			@Override
			protected void hookOnError(Throwable throwable) {
				throwable.printStackTrace();
			}
		});
	}

}
