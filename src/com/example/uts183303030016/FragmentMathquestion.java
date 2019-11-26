package com.example.uts183303030016;
import android.annotation.TargetApi;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

@TargetApi(Build.VERSION_CODES.HONEYCOMB) public class FragmentMathquestion extends Fragment{
	ListView lmathq1;
	String[] menumate = {"dasar aritmatika", "bangun datar", "baris dan deret"};
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		View rootView = inflater.inflate(R.layout.fragment_mathquestions, container, false);
		
		lmathq1 = (ListView)rootView.findViewById(R.id.lvmathq1);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_list_item_1, menumate);
		lmathq1.setAdapter(adapter);
		lmathq1.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				if(arg2 == 0){
					Toast.makeText(getActivity(), "bukan jatah saya.", Toast.LENGTH_LONG).show();
				}
				else if(arg2 == 1){
					Fragmentbdtr fragmentbdtr = new Fragmentbdtr();
					FragmentManager fragmentManager = getFragmentManager();
        			FragmentTransaction ft = fragmentManager.beginTransaction();
        			ft.replace(R.id.content_frame, fragmentbdtr);
        			ft.commit();
				}
				else if(arg2 == 2){
					Toast.makeText(getActivity(), "bukan jatah saya.", Toast.LENGTH_LONG).show();
				}
			}
		});
		
		return rootView;
	}
}