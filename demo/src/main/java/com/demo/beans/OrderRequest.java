
package com.demo.beans;

import java.util.List;

/**
 * @author Hari
 */
public class OrderRequest extends BaseRequest {

  private List<Item> items;

  public List<Item> getItems() {
    return items;
  }

  public void setItems( List<Item> items ) {
    this.items = items;
  }

}
