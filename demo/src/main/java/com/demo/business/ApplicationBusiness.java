
package com.demo.business;

import java.util.StringJoiner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.beans.OrderRequest;
import com.demo.beans.OrderResponse;
import com.demo.dao.ApplicationDAO;
import com.demo.validations.ApplicationValidation;

/**
 * @author Hari
 */
@Service
public class ApplicationBusiness {

  @Autowired
  private ApplicationDAO dao;

  /**
   * This method is used for calculating order total.
   * @param request
   * @return
   */
  public OrderResponse order( OrderRequest request ) {
    OrderResponse response = new OrderResponse();
    StringJoiner invalidFields = new StringJoiner( "," );
    ApplicationValidation validation = new ApplicationValidation();

    StringJoiner validateInput = validation.validateOrder( request, invalidFields );
    if (null != validateInput && validateInput.length() > 0) {
      response.setStatusCode( "400" );
      response.setStatusMessage( "Invalid : " + validateInput );
    } else {
      dao.order( request, response );
    }
    return response;
  }

}
