package cn.com.karl.music;



import android.util.Log;

public class Logs {
	public static final String tag = "tag";
	public static boolean flag = true; // if==true ��ʾ��־; else �ر���־.

	public static void v(String msg) {
		if (flag) {
			Log.v(tag, msg);
		}
	}
	
	public static void i(String msg) {
		if (flag) {
			Log.i(tag, msg);
		}
	}
}
