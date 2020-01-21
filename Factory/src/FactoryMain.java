import com.phone.Android;
import com.phone.OS;
import com.phone.OSFactoryManager;

public class FactoryMain {

	
	public static void main(String args[]) {
		
		OSFactoryManager ofm = new OSFactoryManager();
		
		OS obj = ofm.getInstance("OPEN");
		
		obj.spec();
		
	}
	
}
