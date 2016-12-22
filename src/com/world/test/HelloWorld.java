/** 
* @ClassName: HelloWorld
* @Description: TODO(这里用一句话描述这个类的作用)
* @Author skyfree skyfree1989@163.com
* @Date 2016年12月21日 下午8:15:56
*/
package com.world.test;

/**
 * @Title: HelloWorld.java
 * @Package com.world.test
 * @Description: TODO(测试GIT项目)
 * @Author skyfree skyfree1989@163.com
 * @Date 2016年12月21日 下午8:15:56
 * @Version Vx.0
 */
public class HelloWorld {
	public static void main(String[] args) {
		String strs = "java, c#, , google, qq, , jquery";
		String[] strArr = strs.split(",");
		for (String str : strArr) {
			System.out.println(StringUtil.isNullString(str) ? "null" : str);
		}
	}
}
