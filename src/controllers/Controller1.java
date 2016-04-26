package controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import data.EmpDAO;
import data.Employee;





@Controller
public class Controller1 {
	
	@Autowired
	private EmpDAO empDao;
	
	
	

//	  @RequestMapping("initPage.do")
//	    public ModelAndView initIndex() {
//	        ModelAndView mv = new ModelAndView();
//	        mv.addObject("Employee", new Employee());
//	        mv.setViewName("index.jsp");
//	        return mv;
//	    }
	
	@RequestMapping("listPage.do")
	public ModelAndView showAll(){
		
		ArrayList<ArrayList<Employee>> employees = empDao.showAll();
		
		System.out.println(employees);
		
		

		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("listPage.jsp");
		

		mv.addObject("listing", employees);

		return mv;
		
	}
	
	
	
	

	
	//passes object to new page and pre fills form with object states 
		@RequestMapping("editEmp.do")
		public ModelAndView editDiscrep(String id ) {
			
			Employee e;
			e = empDao.getEmployeeById(id);
			
		
			ModelAndView mv = new ModelAndView("editEmp.jsp", "employee", e);
			return mv;
			
		}
		
		
		@RequestMapping("updateEmp.do")
		public ModelAndView updateEmp(Employee emp){
			ModelAndView mv = new ModelAndView();
			
			empDao.updateEmployee(emp);
			ArrayList<ArrayList<Employee>> employees = empDao.showAll();
			
			mv.setViewName("listPage.jsp");
			
			mv.addObject("listing", employees);
			
//			empDao.updateEmployee(emp);
			
			
			System.out.println(emp);
			
			return mv;
			
			
		}
		
		
		
		
		@RequestMapping("addEmp.do")
		public ModelAndView addEmp(Employee emp){
			ModelAndView mv = new ModelAndView();
			mv.addObject("Employee", new Employee());
			mv.setViewName("index.jsp");
			empDao.addEmployee(emp);
			
			System.out.println(emp);
			
			
			return mv;
			
			
		}

		@RequestMapping("deleteEmp.do")
		public ModelAndView deleteEmp(String id){
			ModelAndView mv = new ModelAndView();
			
			System.out.println("in controller");
			System.out.println(id);
	
			mv.setViewName("listPage.jsp");
			empDao.deleteEmployee(id);
			mv.addObject("listing", empDao.showAll());
			
			
			
			
			return mv;
			
			
		}
		
		
		
		
//	
//	
//		@RequestMapping(path = "updateDisc.do", method = RequestMethod.POST)
//		public ModelAndView updateDiscrep(Discrepancy updatedDisc) {
//			
//			System.out.println("inside controller update");
//			
//			discrep.updateDisc(updatedDisc);
//			ModelAndView mv = new ModelAndView();
//			
//			mv.setViewName("index.jsp");
//			mv.addObject("aircraftStatus", discrep.getAircraftStatus() );
//			mv.addObject("discrepancyList", discrep.showAll());
//			
//			return mv;
//			
//		}
	
	
	
	
//	@RequestMapping("index.do")
//	public ModelAndView processData() {
//		ModelAndView mv = new ModelAndView();
//		
//		mv.setViewName("index.jsp");
//		
//		mv.addObject("discrepancyList", discrep.showAll());
//		return mv;
//		
//	}
	
	
	
	
	
	
	
	
}
