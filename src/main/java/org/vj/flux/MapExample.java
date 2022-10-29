/**
 * 
 */
package org.vj.flux;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.vj.pojo.Order;

/**
 * @author vijayakumar
 * @Since  25-Mar-2022
 *
 */
public class MapExample {

	public static void main(String[] args) {
		List<Order> orders = Arrays.asList(
					new Order(1l, 100.0),
					new Order(2l, 200.0),
					new Order(3l, 300.0));
		
		List<Long> longList = orders.stream()
				.filter(o -> o.getAmount() > 100.0)
				.map(o -> {
					System.out.println("Inside Map");
					return o.getId();
				})
				.collect(Collectors.toList());

		System.out.println("---------------");
		longList.forEach(System.out::println);
	}

}
