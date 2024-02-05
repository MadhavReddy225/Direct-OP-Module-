package Direct_OP.Test;

import java.util.ArrayList;

import org.testng.annotations.Test;

import Direct.Base.ExcelReader;
import Direct.Base.KeywordsImpl;



public class LoginTest {
      @Test  
      public void logintest() throws Exception{
    		    
    		   ArrayList testData = ExcelReader.getTestData("C:\\Users\\Admin\\OneDrive\\Desktop\\Login Testcase1.xlsx");
    		   KeywordsImpl key = new KeywordsImpl();
    		   for (int i = 0; i < testData.size(); i++) {
    			   if (testData.get(i).equals("open")){
    				   key.open();
    				   
    			   }
    			   
    			if (testData.get(i).equals("url")) {
    				String urlLink= (String) testData.get(i+1);
    					key.url(urlLink);
    			}			
    			if (testData.get(i).equals("input")) {
    				String data = (String ) testData.get(i+1);
    				String keyName = (String) testData.get(i+2);
    				key.input(data,keyName);
    				
    		   }
    		   if(testData.get(i).equals("click")) {
    		 	  String keyName = (String) testData.get(i+2);
    		 	  key.click(keyName);
    		 	  
    		 	}
    	
    		   if (testData.get(i).equals("close")) {
    		 	  key.close();

    			}
    		   }
	 }
}
