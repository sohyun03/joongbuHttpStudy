package http_study.com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 자바 문서를 톰캣서버가 실행될 때 동적 리소스로 주소를 생성한다.
// HttpServlet: 톰캣 서버 등록할 때 같이 참조된 라이브러리에서 제공, 톰캣이 생성할 동적 리소스의 타입
// 1. 사용자(클라이언트) 브라우저에서 url로 서버주소/l01serlet.do를 호출 => 요청
// 2. 요청을 받은 톰캣 서버가 L01Servlet를 객체로 생성하고 브라우저에 html로 변환해서 응답을 한다.
@WebServlet("/l01servlet.do")

public class l01Servlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// HttpServletRequest req 요청 객체
		// HttpServletResponse resp 응답 객체
		resp.setContentType("text/html; charset=UTF-8");
		resp.getWriter().append("<h1>Hello Servlet 동적 리소스!" + (1000 / 3) + "</h1>");
	}
}
