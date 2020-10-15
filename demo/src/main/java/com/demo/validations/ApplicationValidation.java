
package com.demo.validations;

import java.util.StringJoiner;

import org.springframework.util.CollectionUtils;

import com.demo.beans.OrderRequest;
import com.demo.utils.CommonUtils;

/**
 * @author HARI
 */
public class ApplicationValidation {

  /**
   * This method is used for validating order request.
   * @param request
   * @param invalidFields
   * @return
   */
  public StringJoiner validateOrder( OrderRequest request, StringJoiner invalidFields ) {
    /**
     * validate Order Request object
     */
    if (CommonUtils.isNotBlank( request )) {
      /**
       * validate Header Fields
       */
      validateHeaderFields( request, invalidFields );

      /**
       * validate Item list
       */
      if (CollectionUtils.isEmpty( request.getItems() )) {
        invalidFields.add( "Items" );
      }

    } else {
      invalidFields.add( "Order Request Object" );
    }

    return invalidFields;
  }

  /**
   * This method is used for validating header fields.
   * @param request
   * @param invalidFields
   * @return
   */
  public StringJoiner validateHeaderFields( OrderRequest request, StringJoiner invalidFields ) {
    /**
     * validate System Id
     */
    if (CommonUtils.isBlank( request.getSystemId() )) {
      invalidFields.add( "System Id" );
    }

    /**
     * validate Country
     */
    if (CommonUtils.isBlank( request.getCountry() )) {
      invalidFields.add( "Country" );
    }

    /**
     * validate User Id
     */
    if (CommonUtils.isBlank( request.getUserId() )) {
      invalidFields.add( "User Id" );
    }

    return invalidFields;
  }
}