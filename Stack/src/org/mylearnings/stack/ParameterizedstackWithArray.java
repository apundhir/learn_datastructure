package org.mylearnings.stack;

import java.util.Iterator;

public class ParameterizedstackWithArray<Item> implements Iterable<Item>{
	private Item[] s;
	private int N = 0;

	@SuppressWarnings("unchecked")
	public ParameterizedstackWithArray(int capacity) {
		// Java does not allow to create generic arrays
		// s = new Item[capacity];
		s = (Item[]) new Object[capacity];
	}

	public boolean isEmpty() {
		return N == 0;
	}

	public void push(Item item) {
		s[N++] = item;
	}

	public Item pop() {
		return s[--N];
	}

	@Override
	public Iterator<Item> iterator() {
		return new ArrayIterator();
	}
	
	private class ArrayIterator implements Iterator<Item>{
		private int i = N;
		
		@Override
		public boolean hasNext() {
			return i > 0;
		}

		@Override
		public Item next() {
			return s[--i];
		}

		@Override
		public void remove() {
		// Not supported
		}
		
	}
}
