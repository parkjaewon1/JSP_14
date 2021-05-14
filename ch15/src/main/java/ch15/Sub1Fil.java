package ch15;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
// sub1폴더에 있는 web프로그램 실행할 때 작동
/* @WebFilter("/sub1/*") */
@WebFilter(urlPatterns = {"/sub1/*","/sub2/*"})
public class Sub1Fil implements Filter {
	public void destroy() {	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("Sub1에서 사용전");
		chain.doFilter(request, response);
		System.out.println("Sub1에서 사용후");
	}
	public void init(FilterConfig fConfig) throws ServletException {	}
}