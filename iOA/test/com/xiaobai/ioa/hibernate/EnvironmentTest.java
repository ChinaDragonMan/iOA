package com.xiaobai.ioa.hibernate;

import org.junit.Test;

import com.xiaobai.ioa.model.po.Department;
import com.xiaobai.ioa.model.po.DepartmentHome;

/**
 * 
 * <p>Description:hibernate启动环境测试</p>
 * @author 2018年1月17日 by carver
 * 2018年1月17日
 */
public class EnvironmentTest
{
	/**
	 * <p>caller:<p/>
	 *<p>functionDescription:<p/>	
	 * <p>processDescription:<p/>
	 * @author 2018年1月17日 by carver
	 */
	@Test
	public void testEnviroment() 
	{
		 DepartmentHome departmentHome = new DepartmentHome();
		 Department department = departmentHome.findById(1);
		 System.out.println(department.getDname()+"---"+department.getDescription());
		 
		 
		 
	}

}
