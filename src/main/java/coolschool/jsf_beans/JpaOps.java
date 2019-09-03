package coolschool.jsf_beans;

import javax.annotation.Resource;
import javax.enterprise.context.RequestScoped;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.NotSupportedException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.UserTransaction;

@Named
@RequestScoped
public class JpaOps {

	
	@PersistenceContext
	private EntityManager eMng;
	
	@Resource
	private UserTransaction userTr;
	
	public String updateDatabase() {
		
		String retVal = "confirmation";
		
		Employee e1 = new Employee();
		
		
		e1.setName("Lenio");
		e1.setAge(26);
		e1.setLocation("Coventry");
		e1.setGender("k");
		
		try {
			
			
			userTr.begin();
			eMng.persist(e1);
			userTr.commit();
		}
		catch (HeuristicMixedException |
                HeuristicRollbackException |
                IllegalStateException |
                NotSupportedException |
                RollbackException |
                SecurityException |
                SystemException e) {
			
			
			retVal = "error";
            e.printStackTrace();
		}
		
		return retVal;
	}
}
