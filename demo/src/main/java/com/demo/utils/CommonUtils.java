
package com.demo.utils;

import java.util.Collection;

/**
 * @author Hari
 */
public class CommonUtils {
  /**
   * @param str
   * @return
   */
  public static boolean isBlank( String str ) {
    return ( str == null ) || ( "".equals( str.trim() ) );
  }

  /**
   * @param str
   * @return
   */
  public static boolean isNotBlank( String str ) {
    return !isBlank( str );
  }

  /**
   * @param obj
   * @return
   */
  public static boolean isBlank( Object obj ) {
    return obj == null;
  }

  /**
   * @param obj
   * @return
   */
  public static boolean isNotBlank( Object obj ) {
    return !isBlank( obj );
  }

  /**
   * @param obj
   * @return
   */
  public static boolean isEmptyCollection( Collection<?> obj ) {
    return ( obj == null ) || ( obj.isEmpty() );
  }

  /**
   * @param obj
   * @return
   */
  public static boolean isNotEmptyCollection( Collection<?> obj ) {
    return !isEmptyCollection( obj );
  }
  
}