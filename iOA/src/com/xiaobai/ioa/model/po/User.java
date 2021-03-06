package com.xiaobai.ioa.model.po;
// Generated 2018-1-17 10:26:22 by Hibernate Tools 5.2.6.Final

import java.util.HashSet;
import java.util.Set;

/**
 * User generated by hbm2java
 */
public class User implements java.io.Serializable
{

	private long uid;
	private Department department;
	private String email;
	private String username;
	private String password;
	private String phone;
	private String sex;
	private Set posts = new HashSet(0);

	public User()
	{
	}

	public User(long uid)
	{
		this.uid = uid;
	}

	public User(long uid, Department department, String email, String username, String password, String phone,
			String sex, Set posts)
	{
		this.uid = uid;
		this.department = department;
		this.email = email;
		this.username = username;
		this.password = password;
		this.phone = phone;
		this.sex = sex;
		this.posts = posts;
	}

	public long getUid()
	{
		return this.uid;
	}

	public void setUid(long uid)
	{
		this.uid = uid;
	}

	public Department getDepartment()
	{
		return this.department;
	}

	public void setDepartment(Department department)
	{
		this.department = department;
	}

	public String getEmail()
	{
		return this.email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getUsername()
	{
		return this.username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public String getPassword()
	{
		return this.password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getPhone()
	{
		return this.phone;
	}

	public void setPhone(String phone)
	{
		this.phone = phone;
	}

	public String getSex()
	{
		return this.sex;
	}

	public void setSex(String sex)
	{
		this.sex = sex;
	}

	public Set getPosts()
	{
		return this.posts;
	}

	public void setPosts(Set posts)
	{
		this.posts = posts;
	}

}
