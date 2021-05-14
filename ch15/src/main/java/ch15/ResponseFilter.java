package ch15;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;
@WebFilter("/sub6/*")
public class ResponseFilter implements Filter {
	public void destroy() {	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		ResponseWrap rw = new ResponseWrap((HttpServletResponse)response);
		chain.doFilter(request, rw);
		rw.replace();
	}
	public void init(FilterConfig fConfig) throws ServletException {	}
}