package com.example.uts183303030016;


import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

@TargetApi(Build.VERSION_CODES.HONEYCOMB) public class FragmentMiniquestions extends Fragment{
	EditText editminiq1, editminiq2, editminiq3;
	Button buttonminiq1, buttonminiq2, buttonminiq3;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		View rootView = inflater.inflate(R.layout.fragment_miniquestions, container, false);
		
		editminiq1 = (EditText)rootView.findViewById(R.id.etminiq1);
		editminiq2 = (EditText)rootView.findViewById(R.id.etminiq2);
		editminiq3 = (EditText)rootView.findViewById(R.id.etminiq3);
		buttonminiq1 = (Button)rootView.findViewById(R.id.btnminiq1);
		buttonminiq2 = (Button)rootView.findViewById(R.id.btnminiq2);
		buttonminiq3 = (Button)rootView.findViewById(R.id.btnminiq3);
		
		buttonminiq1.setOnClickListener(new View.OnClickListener() {
			@SuppressLint("NewApi") @Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String answer1 = editminiq1.getText().toString();
				if(answer1.equals("ya") || answer1.equals("ya") || answer1.equals("ya")){
					Toast.makeText(getActivity(), "oh", Toast.LENGTH_LONG).show();
				}
				else if(answer1.equals("tidak") || answer1.equals("tidak") || answer1.equals("tidak")){
					Toast.makeText(getActivity(), "tentu saja", Toast.LENGTH_LONG).show();
				}
			}
		});
		
		buttonminiq2.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String answer2 = editminiq2.getText().toString();
				if(answer2.equals("ya") || answer2.equals("ya") || answer2.equals("ya")){
					Toast.makeText(getActivity(), "good ",Toast.LENGTH_LONG).show();
				}
				else if(answer2.equals("tidak") || answer2.equals("tidak") || answer2.equals("tidak")){
					Toast.makeText(getActivity(), "kenapa tidak bekerja ? :) ", Toast.LENGTH_LONG ).show();
				}
			}
		});
		
		buttonminiq3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String answer3 = editminiq2.getText().toString();
				if(answer3.equals("ya") || answer3.equals("ya") || answer3.equals("ya")){
					Toast.makeText(getActivity(), "tentu saja ",Toast.LENGTH_LONG).show();
				}
				else if(answer3.equals("tidak") || answer3.equals("tidak") || answer3.equals("tidak")){
					Toast.makeText(getActivity(), " good job.thank you ", Toast.LENGTH_LONG ).show();
				}
			}
		});
		
		return rootView;
	}
}

