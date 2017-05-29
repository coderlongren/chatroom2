package cn.coderlongren.listener;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpSession;

import cn.coderlongren.vo.User;

/***
 * 
 * 
 * <p>Title:</p>
 * <p>Description: 监听session的创建 </p>
 * <p>Company:</p> 
 * @author code龙
 * @date
 * @version 1.0
 */
public class MyServletContextListener implements ServletContextListener{
	// ServletContext对象创建 下面这个方法就会执行
	// ServletContextEvent事件对象. 监听器对象---》ServletContext对象.(事件源)
	public void contextInitialized(ServletContextEvent sce) {
		Map<User,HttpSession> userMap = new HashMap<User,HttpSession>();
		sce.getServletContext().setAttribute("userMap", userMap);
	}
	
	public void contextDestroyed(ServletContextEvent sce) {
		
	}



}
