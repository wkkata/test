/**
 * 
 */
package org.kjmx.praycards.util;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * �����ַ�����utility
 * @author wkkata
 *
 */
public class StringUtil {
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	/**
	 * ��ȡ��ǰ��timestamp
	 * @return
	 */
	public static Timestamp getNowTimestamp(){
		
		Date date = new Date();
		
		return Timestamp.valueOf( sdf.format(date) );
	}
}
