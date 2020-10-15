
package com.demo.beans;

/**
 * The basic response object which will provide common response parameters
 * @author Hari
 */
public class BaseResponse {

  private String statusCode = "8000";

  private String statusMessage = "Not Implemented";

  /**
   * Default constructor for extending this class
   * @param statusCode
   * @param statusMessage
   */
  public BaseResponse() {
    // This is to enable extending with default constructor implementation
    this.statusCode = "8000";
    this.statusMessage = "Not Implemented";
  }

  /**
   * Convenient way for simple response creation
   * @param statusCode
   * @param statusMessage
   */
  public BaseResponse( String statusCode, String statusMessage ) {
    this.statusCode = statusCode;
    this.statusMessage = statusMessage;
  }

  public String getStatusCode() {
    return statusCode;
  }

  public void setStatusCode( String statusCode ) {
    this.statusCode = statusCode;
  }

  public String getStatusMessage() {
    return statusMessage;
  }

  public void setStatusMessage( String statusMessage ) {
    this.statusMessage = statusMessage;
  }

}
