package com.cg.payroll.controllers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.dom4j.DocumentException;

import com.cg.payroll.beans.Associate;
import com.cg.payroll.exception.AssociateDetailNotfoundException;
import com.cg.payroll.services.PayrollServices;
import com.cg.payroll.services.PayrollServicesImpl;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

@WebServlet("/calculateNetSalary")
public class CalculateNetSalary extends HttpServlet {
	 private static final String FILE_NAME = "D:\\itext.pdf";
	   Document document = new Document();

	private PayrollServices services;
	private static final long serialVersionUID = 1L;
	@Override
	public void init() throws ServletException
	{
		services=new PayrollServicesImpl();
	}
	private static void generatePDF(int netSalary,Associate associate) throws com.itextpdf.text.DocumentException, DocumentException {
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream(new File(FILE_NAME)));
            //open
            document.open();
            String str=Integer.toString(netSalary);
            Paragraph p = new Paragraph();
           // p.add(str);
            p.add("********************ASSOCIATE DETAILS *********************");
            p.add("\n-------------------------------------------");
            p.add("\nAssociate Id :  "+Integer.toString(associate.getAssociateId()));
           p.add("\nFirst Name  :"+associate.getFirstName());
           p.add("\nLast Name  :"+associate.getLastName());
           p.add("\nEmail Id  :"+associate.getEmailId());
           p.add("\nDepartment :"+associate.getDepartment());
           p.add("\nPanCard : "+associate.getPancard());     
           p.add("\nDesignation :"+associate.getDesignation());
           p.add("\n_________________________");        
           p.add("\nASSOCIATE SALARY :-");
           p.add("\n-------------------------------------------");
           p.add("\nBasic Salary: "+Integer.toString(associate.getSalary().getBasicSalary()));
           p.add("\nCompany Pf : "+Integer.toString(associate.getSalary().getCompanyPf()));
           p.add("\nConveyence Allowance : "+Integer.toString(associate.getSalary().getConveyenceAllowance()));
           p.add("\nEpf : "+Integer.toString(associate.getSalary().getEpf()));
         //  p.add("\nGross Salary : "+Integer.toString(associate.getSalary().getGrossSalary()));
           p.add("\nHra : "+Integer.toString(associate.getSalary().getHra()));
           p.add("\nMonthly Tax : "+Integer.toString(associate.getSalary().getMonthlyTax()));
           p.add("\nNet Salary : "+Integer.toString(associate.getSalary().getNetSalary()));
           p.add("\nOther Allowance : "+Integer.toString(associate.getSalary().getOtherAllowance()));
           p.add("\nPersonal Allowance : "+Integer.toString(associate.getSalary().getPersonalAllowance()));
           p.add("\n_________________________");
           p.add("\nASSOCIATE BANK DETAILS : -");
           p.add("\n-------------------------------------------");
           p.add("\nAccount Number : "+Integer.toString(associate.getBankDetails().getAccountNumber()));
           p.add("\nBank Name  : "+associate.getBankDetails().getBankName());
           p.add("\nIFSC CODE : "+associate.getBankDetails().getIfscCode());
           p.add("***************************************************************");
           
           
 
            //p.setAlignment(Element.ALIGN_CENTER);
            document.add(p);
            document.close();
            System.out.println("Done");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
int associateId=Integer.parseInt(request.getParameter("associateId"));
		
		int netSalary=0;
		try
		{
			netSalary=services.calculateNetSalary(associateId);
			request.setAttribute("netSalary", netSalary);
			request.getRequestDispatcher("associateCalculateNetSalarysuccess.jsp").forward(request, response);	
			Associate associate=services.getAssociateDetails(associateId);
			generatePDF(netSalary,associate);
		}catch (AssociateDetailNotfoundException | com.itextpdf.text.DocumentException | DocumentException e) {
			request.setAttribute("error", e.getMessage());
			request.getRequestDispatcher("associateCalculateNetSalaryerror.jsp").forward(request, response);	
		}

		
	}
	@Override
	public void destroy() 
	{
		services=null;
	}
}