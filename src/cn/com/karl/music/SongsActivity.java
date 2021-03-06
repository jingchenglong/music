package cn.com.karl.music;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import cn.com.karl.domain.Music;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;

//�������
public class SongsActivity extends Activity {
	public static ArrayList<Music> listMusic = new ArrayList<Music>();
	private ListView songsList;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.songs);

		songsList = (ListView) this.findViewById(R.id.songs_list);

	}

	@Override
	protected void onStart() {
		MusicItemAdapter adapter = new MusicItemAdapter();
		songsList.setAdapter(adapter);

		super.onStart();
	}

	private class MusicItemAdapter extends BaseAdapter {

		@Override
		public int getCount() {
			return listMusic.size();
		}

		@Override
		public Object getItem(int arg0) {
			return listMusic.get(arg0);
		}

		@Override
		public long getItemId(int position) {
			return position;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			if (convertView == null) {
				convertView = LayoutInflater.from(getApplicationContext())
						.inflate(R.layout.musiclist, null);
			}
			Music m = listMusic.get(position);
			TextView textName = (TextView) convertView
					.findViewById(R.id.music_list_singer);
			textName.setText(m.getSinger());
			TextView music_singer = (TextView) convertView
					.findViewById(R.id.music_list_name);
			music_singer.setText(m.getTitle());

			ImageView img = (ImageView) convertView
					.findViewById(R.id.item_image);
			img.setBackgroundResource(R.drawable.item);
			return convertView;
		}

	}
}
