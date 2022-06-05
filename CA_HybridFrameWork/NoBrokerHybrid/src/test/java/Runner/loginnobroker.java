package Runner;


import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Hybrid.EMI;
import Hybrid.AC;
import Hybrid.rentPage;
import Hybrid.FB;
import Hybrid.Login;
import Hybrid.privacypage;
import Hybrid.gettext;
import Hybrid.sitemap;
import Hybrid.menu;
import Hybrid.AvoidBrokers;

public class loginnobroker extends Baseclass {

	@Test(priority=1)
	public void loginApp() throws InterruptedException
	
	{   
		log.info("Testcase-1 execution start");
		logger =report.createTest("login app");
		Login lopin= PageFactory.initElements(driver,Login.class);
		logger.info("stating Apllication");
		 lopin.LoginToCrm();
		 log.info("Successfully Login");
		   logger.pass("login page");
		   log.info("Testcase-1 is successfully executed");
    }
	
  @Test(priority=2)
   public void searchpapp() throws InterruptedException
	
	{   
	  log.info("Testcase-2 execution start");
	  logger=report.createTest("loginpage");
	  menu lopi= PageFactory.initElements(driver,menu.class);
		 lopi.signtobrokerr();
		 log.info("click on menu page");
		 logger.pass("login done");
		  log.info("Testcase-2 is successfully executed");
		             
    }
  
	@Test(priority=3)
	 public void menuappoo() throws InterruptedException
		
		{    
		log.info("Testcase-3 execution start");
		Reporter.log("menu Done", true);

		 logger=report.createTest("serachbox");

		 gettext lopi4= PageFactory.initElements(driver,gettext.class);
			 lopi4.searcho();
			 log.info("Successfully done of getting text");
			 logger.pass("searching done");
			 log.info("Testcase-3 is successfully executed");
			            
	    }
	
	@Test(priority=4)
	 public void searapp() throws InterruptedException
		
	 {   
		log.info("Testcase-4 execution start");
		Reporter.log("searching Done", true);

		logger=report.createTest("Emicalculartor");

		AC lopi5= PageFactory.initElements(driver,AC.class);
		logger.info("searching for bed");
			 lopi5.serching("Hyderabad,Telengana");
			 log.info("Successfully went to Emi calculator");
			 logger.pass("searching done");
			 log.info("Testcase-4 is successfully executed");
			 			         
	    }
	
	@Test(priority=6)
	 public void aboutaa() throws InterruptedException
		
	 { 	
		log.info("Testcase-5 execution start");
		Reporter.log("rentapp Done", true);
		logger=report.createTest("rentapp");
		     rentPage lopi6= PageFactory.initElements(driver,rentPage.class);
		      Thread.sleep(10000);

			 lopi6.bedlogin();
			 
			 
			 
			 log.info("Successfully went to rent");
			 logger.pass("booking done");
			 log.info("Testcase-5 is successfully executed");

	    }

    @Test(priority=7)
	 public void rentalagr() throws InterruptedException
		
		{   
    	log.info("Testcase-6 execution start");
    	Reporter.log("assertions Done", true);
    	     logger=report.createTest("rentagreement");
		     EMI lopi7= PageFactory.initElements(driver,EMI.class);
		     logger.info("comparison");
		    
		   		     
             lopi7.assersearcho();
             Thread.sleep(4000);
                        Thread.sleep(10000);

			 log.info("Successfully Assertions ");
			 logger.pass("agrement done");
			 log.info("Testcase-6 is successfully executed");
			
	    }
    
	 @Test(priority=8)
	 public void loancart() throws InterruptedException
		
		{  
		 log.info("Testcase-7 execution start");
		 logger=report.createTest("facebookpage");
		     FB lopi8= PageFactory.initElements(driver,FB.class);
		     
		     Thread.sleep(4000);
			 lopi8.tvpageoo();
			 
			 log.info("Successfully Tvappcart");
			 logger.pass("searching for TV is pass");
			 log.info("Testcase-7 is successfully executed");
			     
	    }

	@Test(priority=5)
	 public void studyapp() throws InterruptedException
		
		{ 
		 log.info("Testcase-8 execution start");
		 logger=report.createTest("Nobrokerapp");
		     AvoidBrokers lopi9= PageFactory.initElements(driver,AvoidBrokers.class);
			 lopi9.studypageo();
			 log.info("Successfully now broker app");
			 logger.pass("No broker app done");
			 log.info("Testcase-8 is successfully executed");
     
	    }
	 
	   @Test(priority=9)
	 public void siteapp() throws InterruptedException
		
		{ 
		 log.info("Testcase-9 execution start");
		 logger=report.createTest("sitepage");
		     sitemap lopia= PageFactory.initElements(driver,sitemap.class);
			 lopia.aboutu();
			 log.info("Successfully get site location ");
			 logger.pass("done with sitepage");
			 log.info("Testcase-9 is successfully executed");
  
	    }
	 
	 @Test(priority=10)
	 public void infoapp() throws InterruptedException
		
		{ 
		 log.info("Testcase-10 execution start");
		 logger=report.createTest("moreinfo");

		      privacypage lopioo= PageFactory.initElements(driver,privacypage.class);
		      logger.info("getall the text");
			 lopioo.moruee();
			 log.info("Successfully Infoapp");
			 logger.pass("done and back to eclipse");
			 log.info("Testcase-10 is successfully executed");
			 
	    }

}
