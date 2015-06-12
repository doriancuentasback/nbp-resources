/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.demo;

import java.io.Serializable;

public class CounterBean implements Serializable{

	private int count;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void increment() {
		count++;
	}
}