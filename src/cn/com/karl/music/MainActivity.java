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
		requestWindowFeature(Window.FEATURE_NO_TITLE);// ���ر���
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
		spec = tabHost.newTabSpec("�����б�")
				.setIndicator("�����б�", res.getDrawable(R.drawable.item))
				.setContent(intent);
		tabHost.addTab(spec);

		intent = new Intent().setClass(this, ArtistActivity.class);
		spec = tabHost.newTabSpec("������")
				.setIndicator("������", res.getDrawable(R.drawable.artist))
				.setContent(intent);
		tabHost.addTab(spec);

		intent = new Intent().setClass(this, AlbumsActivity.class);
		spec = tabHost.newTabSpec("ר��")
				.setIndicator("ר��", res.getDrawable(R.drawable.album))
				.setContent(intent);
		tabHost.addTab(spec);

		intent = new Intent().setClass(this, SongsActivity.class);
		spec = tabHost.newTabSpec("�������")
				.setIndicator("�������", res.getDrawable(R.drawable.album))
				.setContent(intent);
		tabHost.addTab(spec);
		
		
		tabHost.setCurrentTab(0);//���õ�ǰTab�б�Ϊ��1�С�
		//tabHost.setCurrentTab(1);���õ�ǰTab�б�Ϊ��2�С�

	}
}