package com.example.uts183303030016;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.annotation.SuppressLint;

@SuppressLint("NewApi") public class Fragmentbdtr extends Fragment{
	protected static final TextView eseq1 = null;
	EditText editbangundatar;
	Button btnbangundatar;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		View rootView = inflater.inflate(R.layout.fragment_bdtr, container, false);
		
		editbangundatar = (EditText)rootView.findViewById(R.id.etbdtr);
		btnbangundatar = (Button)rootView.findViewById(R.id.btnbdtr);
		
		btnbangundatar.setOnClickListener(new View.OnClickListener() {	
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String ans1 = editbangundatar.getText().toString();
				int answer = Integer.parseInt(editbangundatar.getText().toString());
				if(answer == 16){
					
					Toast.makeText(getActivity(), "True", Toast.LENGTH_LONG).show();
				}
				else{
					Toast.makeText(getActivity(), "Maaf, jawaban anda salah", Toast.LENGTH_LONG).show();
				}
			}
		});
		
		
		
		return rootView;
	}
}

