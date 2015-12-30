package cn.com.karl.music;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TabHost;

public class MainActivity extends TabActivity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);// 隐藏标题
	/*	this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);*/

		setContentView(R.layout.main);
		
		
	/*	if (null != MusicActivity.player && MusicActivity.player.isPlaying()) {
			Intent intent = new Intent(this, MusicActivity.class);
			intent.putExtra("id", MusicActivity._id);
			startActivity(intent);
		}
*/
		Resources res = getResources();
		TabHost tabHost = getTabHost();
		TabHost.TabSpec spec;
		Intent intent;

		intent = new Intent().setClass(this, ItemActivity.class);
		spec = tabHost.newTabSpec("音乐列表")
				.setIndicator("音乐列表", res.getDrawable(R.drawable.item))
				.setContent(intent);
		tabHost.addTab(spec);

		intent = new Intent().setClass(this, ArtistActivity.class);
		spec = tabHost.newTabSpec("艺术家")
				.setIndicator("艺术家", res.getDrawable(R.drawable.artist))
				.setContent(intent);
		tabHost.addTab(spec);

		intent = new Intent().setClass(this, AlbumsActivity.class);
		spec = tabHost.newTabSpec("专辑")
				.setIndicator("专辑", res.getDrawable(R.drawable.album))
				.setContent(intent);
		tabHost.addTab(spec);

		intent = new Intent().setClass(this, SongsActivity.class);
		spec = tabHost.newTabSpec("最近播放")
				.setIndicator("最近播放", res.getDrawable(R.drawable.album))
				.setContent(intent);
		tabHost.addTab(spec);
		
		
		tabHost.setCurrentTab(0);//设置当前Tab列表为第1列。
		//tabHost.setCurrentTab(1);设置当前Tab列表为第2列。

	}
}