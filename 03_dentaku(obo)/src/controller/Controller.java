package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Calculation;
import model.Constant;

/**
 * Servlet implementation class Controller
 */
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Controller() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		// 受け取り
		String num01_STR = request.getParameter("num01");
		String num02_STR = request.getParameter("num02");
		String ope = request.getParameter("ope");

		// 型変換用
		// 20150607 小数点対応int→double start
		//double num01_DOUBLE = 0;
		//double num02DOUBLE = 0;
		// 20150607 小数点対応int→double end
		// 20150705 小数点対応double→decimal start
		BigDecimal num01_DECIMAL = new BigDecimal("0.00");
		BigDecimal num02_DECIMAL = new BigDecimal("0.00");
		// 20150705 小数点点対応double→decimal start

		// セッション
		HttpSession session = request.getSession();
		if(num01_STR != null){
			// 20150607 小数点対応int→double start
			//num01_DOUBLE = Double.parseDouble(num01_STR);
			// 20150607 小数点対応int→double end
			// 20150705 小数点対応double→decimal start
			num01_DECIMAL = new BigDecimal(num01_STR);
			System.out.println("num01_DECIMAL " + num01_DECIMAL);
			// 20150705 小数点対応double→decimal end
			session.setAttribute(num01_STR, num01_STR);
		}
		if(num02_STR != null){
			// 20150607 小数点対応int→double start
			//num02DOUBLE = Double.parseDouble(num02_STR);
			// 20150607 小数点対応int→double end
			// 20150705 小数点対応double→decimal start
			num02_DECIMAL = new BigDecimal(num02_STR);
			System.out.println("num02_DECIMAL " + num02_DECIMAL);
			// 20150705 小数点対応double→decimal end
			session.setAttribute(num02_STR, num02_STR);
		}

		// インスタンス生成
		Constant con = new Constant();
		Calculation cal = new Calculation();

		// 計算クラスへ値を渡す
		//cal.cal(num01_DOUBLE, ope, num02DOUBLE);

		// 20150705 小数点対応double→decimal start
		cal.cal(num01_DECIMAL, ope, num02_DECIMAL);
		// 20150705 小数点対応double→decimal end

		// 画面表示
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");

		// 20150705 小数点対応double→decimal start
/*		out.println(num01_DOUBLE);
		out.println(ope);
		out.println(num02DOUBLE);
		out.println(" = " + con.getNUM_DOUBLE_ANSWER());*/

		out.println(num01_DECIMAL);
		out.println(ope);
		out.println(num02_DECIMAL);
		out.println(" = " + con.getNUM_DECIMAL_ANSWER());
		// 20150705 小数点対応double→decimal end
		out.println("</body></html>");

	}

}
