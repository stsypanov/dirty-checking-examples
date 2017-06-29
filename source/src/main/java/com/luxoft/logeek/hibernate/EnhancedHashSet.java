package com.luxoft.logeek.hibernate;

import java.util.HashSet;

class EnhancedHashSet extends HashSet<String> {

	public EnhancedHashSet(String[] array) {
		super(Math.max(array.length + 1, 16));
		for (String e : array) add(e);
	}
}