/** 
 * <pre>项目名称:maven-day1 
 * 文件名称:StringUUID.java 
 * 包名:com.jk.util 
 * 创建日期:2018年8月7日上午11:55:16 
 * Copyright (c) 2018, 634369607@qq.com All Rights Reserved.</pre> 
 */  
package com.jk.utils;

import java.util.UUID;

/** 
 * <pre>项目名称：maven-day1    
 * 类名称：StringUUID    
 * 类描述：    
 * 创建人：史航启   
 * 创建时间：2018年8月7日 上午11:55:16    
 * 修改人：史航启      
 * 修改时间：2018年8月7日 上午11:55:16    
 * 修改备注：       
 * @version </pre>    
 */
public class StringUUID {

	public static String StringUtil() {
	return UUID.randomUUID().toString().replaceAll("-", "");
	}
}
