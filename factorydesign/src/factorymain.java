import com.phone.IOS;
import com.phone.OS;
import com.phone.operatingsystemfactory;
import com.phone.windows;


public class factorymain {

	public static void main(String a[] ) {
	operatingsystemfactory osf = new operatingsystemfactory();	
     OS obj = osf.getInstance("hugjhgf");
     obj.spec();
	}

}
