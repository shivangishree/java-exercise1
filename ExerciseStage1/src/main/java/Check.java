
import java.util.*;

public class Check {

	public String chk(int a) {
		String s;
		if(a>=20 && a<=30) {
			s = a%2==0?"tom":"jerry";			
		}
		else {
			s= ("Not in range");
		}
		return s;
	}
	

}
