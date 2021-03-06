package com.keon.sample.test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={
			"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml", 
			"file:src/main/webapp/WEB-INF/spring/db-context.xml"})
public abstract class SpringTest {

}
