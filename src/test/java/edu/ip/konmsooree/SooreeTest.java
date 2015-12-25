package edu.ip.konmsooree;

import junit.framework.TestCase;

public class SooreeTest extends TestCase {
	//Sooree sooree=new Sooree();

	protected void setUp() throws Exception {
		super.setUp();
		//sooree=new Sooree();
	}
	
	public void testKooser(){
		assertTrue(Sooree.kooser("aaaaa").equals("Aaaaa51"));
	}
}
