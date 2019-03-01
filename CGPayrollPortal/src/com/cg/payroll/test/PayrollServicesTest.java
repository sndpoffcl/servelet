package com.cg.payroll.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.payroll.beans.Associate;
import com.cg.payroll.beans.BankDetails;
import com.cg.payroll.beans.Salary;
import com.cg.payroll.exception.AssociateDetailNotfoundException;
import com.cg.payroll.services.PayrollServices;
import com.cg.payroll.services.PayrollServicesImpl;




public class PayrollServicesTest {
	
//	private static PayrollServices services;
//	
//	@BeforeClass
//	public static void setUpTestEnv() {
//		services = new PayrollServicesImpl();
//	}
//	
//	@Before
//	public void setUpTestData() {
//		Associate associate1 = new Associate(101, 78000, "Satish", "Mahajan", "training", "manager", "dtdy7645", "satish@gamilcom", new Salary(35000,1800,1800) , new BankDetails(12345,"HDFC","abcd12434"));
//		Associate associate2 = new Associate(102, 98000, "Ayush", "Mahajan", "training", "manager", "ytcf1234", "ayush@gamilcom", new Salary(55000,2800,3800) , new BankDetails(22345,"icici","icici12434"));
//		
//		PayrollDBUtil.associates.put(associate1.getAssociateId(), associate1);
//		PayrollDBUtil.associates.put(associate2.getAssociateId(), associate2);
//		
//		PayrollDBUtil.ASSOCIATE_ID_COUNTER = 102;
//	} 
//	
//	@Test(expected=AssociateDetailNotfoundException.class)
//	public void testGetAssociateDetailsForInvalidAssociateId() throws AssociateDetailNotfoundException{
//		services.getAssociateDetails(12345);
//	}
//	
//	@Test
//	public void testGetAssociateDetailsForValidAssociateId() throws AssociateDetailNotfoundException{
//		Associate expectedAssociate = new Associate(102, 98000, "Ayush", "Mahajan", "training", "manager", "ytcf1234", "ayush@gamilcom", new Salary(55000,2800,3800) , new BankDetails(22345,"icici","icici12434"));
//		Associate actualAssociate = services.getAssociateDetails(102);
//		Assert.assertEquals(expectedAssociate, actualAssociate);
//	}
//	
//	@Test
//	public void testAcceptAssociateDetailsForValidData() {
//		int expectedId= 103;
//		int actualId = services.acceptAssociateDetails("ABC", "pqr", "sandeep@sinha.com", "ytp", "CON", "abcd1234", 12345, 45678, 1234, 1234, 12345678, "citi", "citi1234");
//		Assert.assertEquals(expectedId, actualId);
//	}
//	
//	@Test(expected=AssociateDetailNotfoundException.class)
//	public void testCalculateNetSalaryForInvalidAssociateId() throws AssociateDetailNotfoundException{
//		services.calculateNetSalary(1234);
//	}
//	
//	@Test
//	public void testCalculateNetSalaryForValidAssociateId() throws AssociateDetailNotfoundException{
//		int expectedNetSalary = 964260;
//		int actualNetSalary = services.calculateNetSalary(102);
//		Assert.assertEquals(expectedNetSalary, actualNetSalary);
//	}
//	
//	@After
//	public void tearDownTestData() {
//		PayrollDBUtil.associates.clear();
//		PayrollDBUtil.ASSOCIATE_ID_COUNTER=100;
//	}
//	
//	@AfterClass
//	public static void tearDownTestEnv() {
//		services = null ;
//	}
//	
}
