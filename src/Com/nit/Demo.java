package Com.nit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
	    List<RBIACC> SBIList = Arrays.asList(
	    		new RBIACC("Ruby",3666),
	    		new RBIACC("Kinnu",3677),
	    		new RBIACC("Ruby",3666),
	    		new RBIACC("Kinnu",3677)
	    		
	    		);
	    List<RBIACC> ICICList = Arrays.asList(
	    		new RBIACC("So",3666),
	    		new RBIACC("S1",3677),
	    		new RBIACC("S2",3666),
	    		new RBIACC("S3",3677)
	    		
	    		);
	    
	    
	    List<List> totalList = new ArrayList<List>();
	    totalList.add(SBIList);
	    totalList.add(ICICList);
	    
	    for(int i=0;i<totalList.size();i++) {
			List bankList = totalList.get(i);
			
			for(int j=0;j<bankList.size();j++) {
				System.out.println(bankList.get(j));
			}
			
		}
	    
	    
	    		

	}

}
