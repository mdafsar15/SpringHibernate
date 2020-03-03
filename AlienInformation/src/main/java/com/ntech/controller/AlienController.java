package com.ntech.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.ModelAndView;

import com.ntech.DaoImpl.AlienDaoImpl;
import com.ntech.dto.AlienSaveForm;

@Controller
public class AlienController {
	
	@Autowired
	public AlienDaoImpl adi;
	
	@RequestMapping({"/","/index","/home"})
	public ModelAndView header()
	{
		ModelAndView mav=new ModelAndView("index");
		mav.addObject("title", "Home");
        mav.addObject("userClickHome", true);
		return mav;
	}
	
	@RequestMapping("/getSignUpForm")
	public ModelAndView signupform()
	{
		ModelAndView mav=new ModelAndView("index");
		mav.addObject("title", "Sign Up Form");
        mav.addObject("userClickSignUpForm", true);
		return mav;
	}
	@RequestMapping("/getLoginPage")
	public ModelAndView login()
	{
		ModelAndView mav=new ModelAndView("index");
		mav.addObject("title", "Login");
        mav.addObject("userClickLogin", true);
		return mav;
	}
	
	@RequestMapping("/getLogoutPage")
	public ModelAndView getLogoutPage()
	{
		ModelAndView mav=new ModelAndView("index");
		mav.addObject("title", "About Us");
        mav.addObject("userClickOnLogoutPage", true);
		return mav;
	}
	
	@RequestMapping("/getAboutPage")
	public ModelAndView getAboutPage()
	{
		ModelAndView mav=new ModelAndView("index");
		mav.addObject("title", "About Us");
        mav.addObject("userClickAbout", true);
		return mav;
	}
	
	@RequestMapping("/getContactUsPage")
	public ModelAndView getContactUsPage()
	{
		ModelAndView mav=new ModelAndView("index");
		mav.addObject("title", "Contact Us");
        mav.addObject("userClickContact", true);
		return mav;
	}
	
	@RequestMapping("/saveAlien")
	public ModelAndView saveAlien(@ModelAttribute("alien")AlienSaveForm as, BindingResult result)
	{
		
		if(result.hasErrors())
		{
			return new ModelAndView("signUpForm");
		}
		
		else
		{
			adi.saveAlien(as);
			ModelAndView mav=new ModelAndView("success");
			mav.addObject("lastInsertedId",as.getAlienId());
			return mav;
		}
		

	}
	
	@RequestMapping(value="/adminLoginAction")
	public ModelAndView adminLoginAction(AlienSaveForm ar, BindingResult result)
	{		
		
		ModelAndView mav3=new ModelAndView("index");
		;		String invalid="Plz enter valid Credential";
		AlienSaveForm userExists = adi.checkLogin(ar.getEmail(),ar.getPwd());	
				
				if(userExists!= null){
					ModelAndView mav=new ModelAndView("loginsuccess", "all",userExists);
					return mav;
				}else{
					ModelAndView mav2=new ModelAndView("login");
					mav2.addObject("inValidMsg",invalid);
					mav2.addObject("inValidMsg","	 <center> <div id=\"danger\" class=\"alert alert-danger\">\r\n" + 
							"    <strong>Invalid Plz Enter Valid Login Credential</strong></div></center>");
					return mav2;
				}
				
			}
	


	@RequestMapping(value = "/logout")
    public ModelAndView logout(HttpServletRequest request) {
        System.out.println("logout()");
        HttpSession httpSession = request.getSession();
        httpSession.invalidate();
        return new ModelAndView("logoutpage");
    }



	}
