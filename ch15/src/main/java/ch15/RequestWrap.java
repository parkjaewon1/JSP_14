package ch15;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
public class RequestWrap extends HttpServletRequestWrapper{
	private HttpServletRequest request;
	public RequestWrap(HttpServletRequest request) {
		super(request);
		this.request = request;
	}
	public String getParameter(String name) {
		String value = request.getParameter(name);
		return value+" 에이 바보!!";
	}
	public String[] getParameterValues(String name) {
		String[] value = request.getParameterValues(name);
		if (value == null || value.length ==0) return null;
		String[] newValue = new String[value.length];
		for (int i =0; i < value.length; i++) {
			newValue[i] = value[i]+" 맛있어";
		}
		return newValue;
	}
}