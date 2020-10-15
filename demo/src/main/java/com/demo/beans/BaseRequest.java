
package com.demo.beans;

/**
 * The basic request object which will provide common request parameters
 * @author Hari
 */
@SuppressWarnings( "serial" )
public class BaseRequest {
  private String systemId;

  private String userId;

  private String country;

  public String getSystemId() {
    return systemId;
  }

  public void setSystemId( String systemId ) {
    this.systemId = systemId;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId( String userId ) {
    this.userId = userId;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry( String country ) {
    this.country = country;
  }

}
