
package com.demo.dao;

import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.demo.beans.Item;
import com.demo.beans.OrderRequest;
import com.demo.beans.OrderResponse;

/**
 * @author Hari
 */
@Service
public class ApplicationDAO {

  /**
   * This method is used for calculating order total.
   * @param request
   * @return
   */
  public void order( OrderRequest request, OrderResponse response ) {
    try {
      request.getItems()
          .stream()
          .filter( item -> item != null )
          .map( item -> calculateItemTotal( response, item ) )
          .collect( Collectors.toCollection( () -> response.getItems() ) );

      if (response.getQuantityCount() >= 4) {
        response.setTotalDiscount( response.getOrderTotal() / 5 );
        response.setOrderTotal( response.getOrderTotal() - response.getTotalDiscount() );
      }

      response.setStatusCode( "0000" );
      response.setStatusMessage( "Order Placed Successfully!" );
    } catch( Exception ex ) {
      ex.printStackTrace();
      response.setStatusCode( "9999" );
      response.setStatusMessage( ex.getMessage() );
    }
  }

  private Item calculateItemTotal( OrderResponse response, Item item ) {
    switch (item.getName()) {
      case "Veggie Taco":
        item.setAmount( 2.50 );
        break;
      case "Chicken Taco":
      case "Beef Taco":
        item.setAmount( 3.00 );
        break;
      case "Chorizo Taco":
        item.setAmount( 3.50 );
        break;
      default:
        item.setAmount( 0.00 );
        break;
    }
    item.setTotal( item.getQuantity() * item.getAmount() );
    response.setQuantityCount( response.getQuantityCount() + item.getQuantity() );
    response.setOrderTotal( response.getOrderTotal() + item.getTotal() );
    return item;
  }

}
