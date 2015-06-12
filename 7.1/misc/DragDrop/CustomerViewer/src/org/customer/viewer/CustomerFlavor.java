/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.customer.viewer;

import java.awt.datatransfer.DataFlavor;
import org.customer.domain.Customer;

public class CustomerFlavor extends DataFlavor{

    public static final DataFlavor CUSTOMER_FLAVOR = new CustomerFlavor();

    public CustomerFlavor() {
         super(Customer.class, "Customer");
    }

}
