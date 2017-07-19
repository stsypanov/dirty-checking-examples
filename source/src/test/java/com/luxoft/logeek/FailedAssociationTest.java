package com.luxoft.logeek;

import com.luxoft.logeek.entity.association.Child;
import com.luxoft.logeek.entity.association.Parent;
import com.luxoft.logeek.repository.ParentRepository;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class FailedAssociationTest extends TestBase {
	
	@Autowired 
	private ParentRepository parentRepository;
	
	private Parent parent;
	private Long parentId;

	@Override
	@Before
	public void setUp() throws Exception {
		super.setUp();
		
		parent = parentRepository.save(new Parent());
		
		List<Child> children = new ArrayList<>();
		for (long i = 0; i < 10; i++) {
			Child child = new Child(parent);
			children.add(child);
		}

		parent.setChildren(children);
		parent = parentRepository.save(parent);
		
		
		List<Child> newChildren = new ArrayList<>();
		for (long i = 0; i < 10; i++) {
			Child child = new Child(parent);
			newChildren.add(child);
		}

		parent.setChildren(newChildren);
	}

	@Test
	public void name() throws Exception {
		parentRepository.save(parent);
	}
}
