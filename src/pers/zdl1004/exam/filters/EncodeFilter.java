package pers.zdl1004.exam.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class EncodeFilter implements Filter {

	private String encode="";

	
	@Override
	public void destroy() {
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
						 FilterChain chain) throws IOException, ServletException {
	
		request.setCharacterEncoding(encode);
		response.setCharacterEncoding(encode);
	
		chain.doFilter(request, response);

	}

	@Override
	public void init(FilterConfig config) throws ServletException {
	
		encode = config.getInitParameter("encode");
		
	}

}
