/**
 * 
 */
package org.vj.pojo;

/**
 * @author vijayakumar
 * @Since  25-Mar-2022
 *
 */
public class Item {

	private Long id;
	
	private String itemName;

	public Item(Long id, String itemName) {
		this.id = id;
		this.itemName = itemName;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
}
