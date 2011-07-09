/**
 * 
 */
package org.kjmx.praycards.util;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 处理字符串的utility
 * @author wkkata
 *
 */
public class StringUtil {
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	/**
	 * 获取当前的timestamp
	 * @return
	 */
	public static Timestamp getNowTimestamp(){
		
		Date date = new Date();
		
		return Timestamp.valueOf( sdf.format(date) );
	}
}
