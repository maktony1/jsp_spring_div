package edu.bit.ex;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.bit.ex.dao.BDao;
import edu.bit.ex.dto.BDto;

public class ListController implements Controller{
	
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("ListController ½ÇÇà");
		BDao dao = new BDao();
		ArrayList<BDto> dtos = dao.list();
		
		request.setAttribute("list", dtos);
		return "list";
	}

}
