package com.cg.payroll.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.easymock.EasyMock;
import org.junit.*;

import com.cg.payroll.beans.*;
import com.cg.payroll.daoservices.AssociateDAO;
import com.cg.payroll.exception.AssociateDetailNotfoundException;
import com.cg.payroll.services.*;

public class PayrollServicesTestEasyMock {
	private static PayrollServices payrollServices;
	private static AssociateDAO mockAssociateDao;
	
	@BeforeClass
	public static void setUpTestEnv() {
		mockAssociateDao = EasyMock.mock(AssociateDAO.class);
		payrollServices = new PayrollServicesImpl(mockAssociateDao);
	}
	
	@Before
	public void setUpMockData() {
		Associate associate1 = new Associate(101, 78000, "Satish", "Mahajan", "training", "manager", "dtdy7645", "satish@gamilcom", new Salary(35000,1800,1800) , new BankDetails(12345,"HDFC","abcd12434"));
		Associate associate2 = new Associate(102, 98000, "Ayush", "Mahajan", "training", "manager", "ytcf1234", "ayush@gamilcom", new Salary(55000,2800,3800) , new BankDetails(22345,"icici","icici12434"));
		Associate associate3 = new Associate(103, 88000, "SaAyush", "Mahajani", "training exc", "manager head", "zdcf1234", "saaayush@gamilcom", new Salary(65000,3800,4800) , new BankDetails(12355,"citi","citi12434"));
		
		ArrayList<Associate> associatesList = new ArrayList<Associate>();
		associatesList.add(associate1);
		associatesList.add(associate2);
		
		EasyMock.expect(mockAssociateDao.save(associate3)).andReturn(associate3);
		
		EasyMock.expect(mockAssociateDao.findOne(101)).andReturn(associate1);
		EasyMock.expect(mockAssociateDao.findOne(102)).andReturn(associate2);
		EasyMock.expect(mockAssociateDao.findOne(1234)).andReturn(null);
		EasyMock.expect(mockAssociateDao.findAll()).andReturn(associatesList);
		EasyMock.replay(mockAssociateDao);
	
	}
	
		@Test(expected=AssociateDetailNotfoundException.class)
		public void testGetAssociateDataforInvalidAssociateId() throws AssociateDetailNotfoundException{
			payrollServices.getAssociateDetails(1234);
			EasyMock.verify(mockAssociateDao.findOne(1234));
		}
		
		@Test
		public void testGetAssociateDataForValidAssociateId() throws AssociateDetailNotfoundException{
			Associate expectedAssociate = new Associate(101, 78000, "Satish", "Mahajan", "training", "manager", "dtdy7645", "satish@gamilcom", new Salary(35000,1800,1800) , new BankDetails(12345,"HDFC","abcd12434"));
			Associate actualAssociate = payrollServices.getAssociateDetails(101);
			assertEquals(expectedAssociate,actualAssociate);
			EasyMock.verify(mockAssociateDao.findOne(101));
		}
		
		@After
		public void tearDownTestMockData() {
			 EasyMock.resetToDefault(mockAssociateDao);
		}
}
