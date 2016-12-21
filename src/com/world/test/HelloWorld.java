/** 
* @ClassName: HelloWorld
* @Description: TODO(这里用一句话描述这个类的作用)
* @Author skyfree skyfree1989@163.com
* @Date 2016年12月21日 下午8:15:56
*/
package com.world.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title: HelloWorld.java
 * @Package com.world.test
 * @Description: TODO(用一句话描述该文件做什么)
 * @Author skyfree skyfree1989@163.com
 * @Date 2016年12月21日 下午8:15:56
 * @Version Vx.0
 */
public class HelloWorld {
	public static void main(String[] args) {
		List<Object> list = new ArrayList<Object>();
		list.add("AAA");
		System.out.println("list集合个数：" + list.size());
	}
}
