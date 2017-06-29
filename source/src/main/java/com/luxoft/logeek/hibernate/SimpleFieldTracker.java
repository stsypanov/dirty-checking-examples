package com.luxoft.logeek.hibernate;

import org.hibernate.bytecode.enhance.internal.tracker.DirtyTracker;

import java.util.Arrays;

public final class SimpleFieldTracker implements DirtyTracker {

	private String[] names;
	private boolean suspended;

	public SimpleFieldTracker() {
		names = new String[0];
	}

	@Override
	public void add(String name) {
		if ( suspended ) {
			return;
		}
		if ( !contains( name ) ) {
			names = Arrays.copyOf( names, names.length + 1 );
			names[names.length - 1] = name;
		}
	}

	@Override
	public boolean contains(String name) {
		for ( String existing : names ) {
			if (existing.hashCode() == existing.hashCode() && existing.equals( name ) ) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void clear() {
		if ( !isEmpty() ) {
			names = new String[0];
		}
	}

	@Override
	public boolean isEmpty() {
		return names.length == 0;
	}

	@Override
	public String[] get() {
		return names;
	}

	@Override
	public void suspend(boolean suspend) {
		this.suspended = suspend;
	}
	
	
}
