/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package org.shop.api.capabilities;

import demo.Customer;

public interface SaveableEntityCapability {

    public void save(Customer customer) throws Exception;
    
}