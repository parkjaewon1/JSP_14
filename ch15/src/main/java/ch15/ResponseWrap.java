package ch15;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
public class ResponseWrap extends HttpServletResponseWrapper{
	private HttpServletResponse response;
	private static StringWriter sw = new StringWriter();
	private static PrintWriter  pw = new PrintWriter(sw); 
	public ResponseWrap(HttpServletResponse response) {
		super(response);	this.response = response;
	}
	public void addCookie(Cookie cookie) {
		String value = cookie.getValue();
		String newValue = value+"-보바";
		cookie.setValue(newValue);
		response.addCookie(cookie);
	}
	// out.println을 변경해서 출력이 목적
	public PrintWriter getWriter() throws IOException {
		return pw;
	}
	public void replace() throws IOException {
		String str = sw.toString(); // StringWriter에 있는 문자를 String으로 변경
		String newStr = str.replace("비행기","강아지"); // 비행기를 찾아서 강아지로 변경
		PrintWriter out = response.getWriter();
		out.println(newStr);
	}
}