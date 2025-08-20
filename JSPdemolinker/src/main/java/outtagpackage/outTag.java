package outtagpackage;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;

//@SuppressWarnings("serial")
public class outTag  extends TagSupport{
	
	public int doStartTag() throws JspException {
		
		try {
			JspWriter out = pageContext.getOut();
			out.println("<h1>This is my Content</h1>");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return SKIP_BODY;
	}
}
