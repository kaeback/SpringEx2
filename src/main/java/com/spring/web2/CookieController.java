package com.spring.web2;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * ��Ű ��� ����
 */
@Controller
public class CookieController {
	/**
	 * ��Ű ����
	 */
	@RequestMapping(value = "cookie1", method = RequestMethod.GET)
	public String cookie1(HttpServletResponse response) {
		// ��Ű ����
		Cookie cookie1 = new Cookie("id", "abc");
		Cookie cookie2 = new Cookie("num", "123");
		// Ŭ���̾�Ʈ ��Ű ����
		response.addCookie(cookie1);
		response.addCookie(cookie2);
		
		return "redirect:/";
	}
	
	/**
	 * ��Ű ����
	 */
	@RequestMapping(value = "cookie2", method = RequestMethod.GET)
	public String cookie2(HttpServletResponse response) {
		// ���� �̸����� ���� �ð��� 0�� ��Ű ����
		Cookie cookie1 = new Cookie("id", null);
		cookie1.setMaxAge(0);
		Cookie cookie2 = new Cookie("num", null);
		cookie2.setMaxAge(0);
		// Ŭ���̾�Ʈ�� �����Ͽ� ���� ��
		response.addCookie(cookie1);
		response.addCookie(cookie2);
		
		return "redirect:/";
	}
	
	/**
	 * ��� ��Ű �б�
	 */
	@RequestMapping(value = "cookie3", method = RequestMethod.GET)
	public String cookie3(HttpServletRequest request) {
		// Ŭ���̾�Ʈ�� ��� ��Ű�� �迭�� �о��
		Cookie[] cks = request.getCookies();
		
		for (Cookie cookie : cks) {
			System.out.println("�̸� : " + cookie.getName() + ", �� : " + cookie.getValue());
		}
		
		return "redirect:";
	}
	
	/**
	 * annotation�� �̿��Ͽ� Ư�� ��Ű �б�
	 */
	@RequestMapping(value = "cookie4", method = RequestMethod.GET)
	public String cookie4(@CookieValue(value = "id", defaultValue = "none") String id, 
						@CookieValue(value = "num", defaultValue = "0") int num) {
		
		// �ش� �̸��� ���� ��Ű�� ���� �о�´�.
		System.out.println("id = " + id);
		System.out.println("num = " + num);
		
		return "redirect:/";
	}
}
