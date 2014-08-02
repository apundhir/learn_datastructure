package org.mylearnings.table;
/*
 * key-value implementation
 * Assumptions:
 * 1. No null value is allowed
 * 2. get() returns null if key is not present
 * 3. put() overwrites old value if key is already present
 * 
 * Assumption for values: any generic type
 * Assumption for keys:
 * 1. Keys are comparable (use compareTo)
 * 2. Keys are generic type, (use equals to test equality)
 * 3. Keys are generic type, (use hashcode to scramble keys)
 * 
 * Use linkedlist based implementation
 * 
 */
public class SimpleTable<Key, Value> {

	public boolean contains(Key key){
		return get(key) != null;
	}
	
	public void delete(Key key){
		put(key, null);
	}
	
	
}
