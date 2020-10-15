
package com.demo.beans;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hari
 */
public class OrderResponse extends BaseResponse {

  private List<Item> items = new ArrayList<>();

  private int quantityCount;

  private double totalDiscount;

  private double orderTotal;

  public List<Item> getItems() {
    return items;
  }

  public void setItems( List<Item> items ) {
    this.items = items;
  }

  public int getQuantityCount() {
    return quantityCount;
  }

  public void setQuantityCount( int quantityCount ) {
    this.quantityCount = quantityCount;
  }

  public double getTotalDiscount() {
    return totalDiscount;
  }

  public void setTotalDiscount( double totalDiscount ) {
    this.totalDiscount = totalDiscount;
  }

  public double getOrderTotal() {
    return orderTotal;
  }

  public void setOrderTotal( double orderTotal ) {
    this.orderTotal = orderTotal;
  }

}
