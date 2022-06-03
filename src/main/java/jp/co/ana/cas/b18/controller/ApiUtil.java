package jp.co.ana.cas.b18.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.request.NativeWebRequest;

/**
 * The class ApiUtil.
 *
 * @author Reddysekarreddy Anigani
 *
 */
public class ApiUtil {

	/**
	 * Sets the example response.
	 *
	 * @param req         the req
	 * @param contentType the content type
	 * @param example     the example
	 */
	public static void setExampleResponse(NativeWebRequest req, String contentType, String example) {
		try {
			HttpServletResponse res = req.getNativeResponse(HttpServletResponse.class);
			if (res != null) {
				res.setCharacterEncoding("UTF-8");
				res.addHeader("Content-Type", contentType);
				res.getWriter().print(example);
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
