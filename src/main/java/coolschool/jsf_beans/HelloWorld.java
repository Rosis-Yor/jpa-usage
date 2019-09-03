package coolschool.jsf_beans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class HelloWorld {

	private String message = " Hello World from Web Dynamics ! " ;

	public String getMessage() {
		return message;
	}
}
