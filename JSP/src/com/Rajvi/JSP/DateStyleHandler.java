package com.Rajvi.JSP;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class DateStyleHandler extends SimpleTagSupport{
	
	private JspContext jspContext;
	
	public void setJspContext(JspContext c) {this.jspContext = c;}
	
	public void doTag() throws JspException {
		try {
			SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
			Date date = new Date();
			String dateStyle = format.format(date);
			jspContext.getOut().println(dateStyle);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
