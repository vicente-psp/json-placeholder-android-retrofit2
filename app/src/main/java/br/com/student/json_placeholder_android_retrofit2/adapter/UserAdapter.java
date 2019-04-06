package br.com.student.json_placeholder_android_retrofit2.adapter;

import java.util.ArrayList;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import br.com.student.json_placeholder_android_retrofit2.R;
import br.com.student.json_placeholder_android_retrofit2.model.User;

public class UserAdapter extends BaseAdapter {
	private Context context;
	private ArrayList<User> lista;

	public UserAdapter(Context context, ArrayList<User> lista){
		this.context = context;
		this.lista = lista;
	}

	@Override
	public int getCount() {
		return lista.size();
	}

	@Override
	public Object getItem(int position) {
		return lista.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View view, ViewGroup viewGroup) {

		User user = lista.get(position);
		View layout;

		if(view == null){
			LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			layout = inflater.inflate(R.layout.user, null);
		}
		else{
			layout = view;
		}


//		TextView modelo = (TextView) layout.findViewById(R.id.t1);
//		modelo.setText(user.getModelo());
//
//		TextView marca = (TextView) layout.findViewById(R.id.t2);
//		marca.setText(carro.getMarca());
//
//		ImageView iv = (ImageView) layout.findViewById(R.id.iv);
//		iv.setImageResource(carro.getCarroImagem(position));

		if(position % 2 == 0){
			layout.setBackgroundColor(Color.YELLOW);
		}

		return layout;
	}
}