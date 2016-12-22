/** 
* @ClassName: StringUtil
* @Description: TODO(这里用一句话描述这个类的作用)
* @Author skyfree skyfree1989@163.com
* @Date 2016年12月22日 下午1:56:49
*/
package com.world.test;

/**
 * @Title: StringUtil.java
 * @Package com.world.test
 * @Description: TODO(用一句话描述该文件做什么)
 * @Author skyfree skyfree1989@163.com
 * @Date 2016年12月22日 下午1:56:49
 * @Version Vx.0
 */
public class StringUtil {
	public static boolean isNullString(Object object) {
		if(null == object) {
			return true;
		}
		String str = object.toString().trim();
		return ("".equals(str) || "null".equals(str.toLowerCase()) ) ? true : false;
	}
	
	public static String replaceNull(Object object, String defaultVal){
		if(isNullString(object)){
			return defaultVal;
		}else{
			return object.toString().trim();
		}
	}
}
