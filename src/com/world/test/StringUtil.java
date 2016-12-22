package com.world.test;

/**
 * @Title: StringUtil.java
 * @Package com.world.test
 * @Description: TODO(字符串处理工具类)
 * @Author gitsky163@163.com
 * @Date 2016年12月22日 下午2:20:45
 * @Version Vx.0
 */
public class StringUtil {
	/**
	 * @Method: isNullString
	 * @Description: TODO(判断制定对象是否为空)
	 * @Author gitsky163@163.com
	 * @Date 2016年12月22日 下午2:21:20
	 * @param object
	 * @return
	 */
	public static boolean isNullString(Object object) {
		if(null == object) {
			return true;
		}
		String str = object.toString().trim();
		return ("".equals(str) || "null".equals(str.toLowerCase()) ) ? true : false;
	}
	/**
	 * @Method: replaceNull
	 * @Description: TODO(对空对象进行字符串返回处理)
	 * @Author gitsky163@163.com
	 * @Date 2016年12月22日 下午2:21:38
	 * @param object
	 * @param defaultVal
	 * @return
	 */
	public static String replaceNull(Object object, String defaultVal){
		if(isNullString(object)){
			return defaultVal;
		}else{
			return object.toString().trim();
		}
	}
}
