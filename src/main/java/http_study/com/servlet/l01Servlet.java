package http_study.com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// �ڹ� ������ ��Ĺ������ ����� �� ���� ���ҽ��� �ּҸ� �����Ѵ�.
// HttpServlet: ��Ĺ ���� ����� �� ���� ������ ���̺귯������ ����, ��Ĺ�� ������ ���� ���ҽ��� Ÿ��
// 1. �����(Ŭ���̾�Ʈ) ���������� url�� �����ּ�/l01serlet.do�� ȣ�� => ��û
// 2. ��û�� ���� ��Ĺ ������ L01Servlet�� ��ü�� �����ϰ� �������� html�� ��ȯ�ؼ� ������ �Ѵ�.
@WebServlet("/l01servlet.do")

public class l01Servlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// HttpServletRequest req ��û ��ü
		// HttpServletResponse resp ���� ��ü
		resp.setContentType("text/html; charset=UTF-8");
		resp.getWriter().append("<h1>Hello Servlet ���� ���ҽ�!" + (1000 / 3) + "</h1>");
	}
}
