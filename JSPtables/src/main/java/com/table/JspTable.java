package com.table;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;

public class JspTable extends TagSupport {
	
	public int number;
	public int start;
	public int end;
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public void setStart(int start) {
		this.start = start;
	}
	
	public void setEnd(int end) {
		this.end = end;
	}
	
	public int doStartTag() throws JspException{
		
		try {
			JspWriter print = pageContext.getOut();
			print.println("<h1> Multiplication Table" + "</h1>");
			for(int i=start;i<=end;i++) {
				print.println(number+" * "+i +" = "+(number*i));
				print.println("<br>");
			}
		}
		catch(Exception e ){
			e.printStackTrace();
		}
		
		return SKIP_BODY;
	}
}
