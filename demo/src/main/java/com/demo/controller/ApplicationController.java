
package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.beans.BaseResponse;
import com.demo.beans.OrderRequest;
import com.demo.business.ApplicationBusiness;

/**
 * @author Hari
 */
@RestController
public class ApplicationController {

  @Autowired
  private ApplicationBusiness business;

  /**
   * This method is used for calculating order total.
   * @param request
   * @return
   */
  @PostMapping( "/order" )
  public BaseResponse order( @RequestBody OrderRequest request ) {
    return business.order( request );
  }

}
