package com.cg.payroll.services;
import java.util.List;

import com.cg.payroll.beans.Associate;
import com.cg.payroll.exception.*;

public interface PayrollServices {
	int acceptAssociateDetails(Associate associate);
	int calculateNetSalary(int associateId) throws AssociateDetailNotfoundException;
	Associate getAssociateDetails(int associateId)throws AssociateDetailNotfoundException;

	List<Associate> getAllAssociatesDetails();
}
