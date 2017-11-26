package com.cs.app.ApplicationService;

import java.util.ArrayList;
import java.util.List;

import com.cs.app.DaoPackages.EmployeeDao;
import com.cs.app.DaoPackages.OrganiationDao;


public class DaoService {

	private List<EmployeeDao> employeedaos = new ArrayList<EmployeeDao>();
	private List<OrganiationDao> organiationdaos = new ArrayList<OrganiationDao>();

	public List<EmployeeDao> getEmployeedao(int age) {		
		List<EmployeeDao> employeedaos1 = new ArrayList<EmployeeDao>();
		for(EmployeeDao emp : employeedaos ){
			if(emp.getAge()==age){
				employeedaos1.add(emp);
			}
		}		
		return employeedaos1;
	}
	
	public List<EmployeeDao> getEmployeedao() {
		return employeedaos;
	}

	public void setEmployeedao(EmployeeDao employeedao) {
		if (employeedao != null) {

		} else {
			EmployeeDao empdao1 = new EmployeeDao();
			empdao1.setFirstname("prakash");
			empdao1.setLastname("kumar");
			empdao1.setAge(25);
			employeedaos.add(empdao1);

			// 2nd
			EmployeeDao empdao2 = new EmployeeDao();
			empdao2.setFirstname("suraj");
			empdao2.setLastname("pancholi");
			empdao2.setAge(20);
			employeedaos.add(empdao2);
		}
	}

	public List<OrganiationDao> getOrganiationdao() {
		return organiationdaos;
	}

	public void setOrganiationdao(OrganiationDao organiationdao) {
		if (organiationdao != null) {

		} else {
			
			OrganiationDao orgdao = new OrganiationDao();
			orgdao.setOrname("Cognizant");
			orgdao.setOrgpin(12345);
			orgdao.setOrgadd("pune");
			
			OrganiationDao orgdao1 = new OrganiationDao();
			orgdao1.setOrname("Cognizant indian");
			orgdao1.setOrgpin(54321);
			orgdao1.setOrgadd("Banalore");			
			organiationdaos.add(orgdao);
			organiationdaos.add(orgdao1);			
		}

	}

}
