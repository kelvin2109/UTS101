package com.example.uts183303030016;



import android.os.Bundle;
import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class MainActivity extends Activity {
	private DrawerLayout mDrawerLayout;
	private ListView mDrawerList;
	private ActionBarDrawerToggle mDrawerToggle;
	private String mTitle="";

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        mTitle = "Drawer Menu";
        getActionBar().setTitle(mTitle);
        
        mDrawerLayout=(DrawerLayout)findViewById(R.id.drawer_layout);
        mDrawerList=(ListView)findViewById(R.id.drawerlist);
        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, 
        		R.drawable.menu,
        		R.drawable.menu,
        		R.drawable.menu){
        	public void onDrawerClosed(View view){
        		getActionBar().setTitle(mTitle);
        		invalidateOptionsMenu();
        	}
        	public void onDrawerOpened(View drawerView){
        		getActionBar().setTitle("Drawer Menu");
        		invalidateOptionsMenu();
        	}
        	
        };
        mDrawerLayout.setDrawerListener(mDrawerToggle);
        
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
        		getBaseContext(), R.layout.drawerlist,
        		getResources().getStringArray(R.array.menus));
        mDrawerList.setAdapter(adapter);
        getActionBar().setHomeButtonEnabled(true);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        
        mDrawerList.setOnItemClickListener(new OnItemClickListener(){
        	public void onItemClick(AdapterView<?> parent, View view, int position, long id){
        		String[] menuItems = getResources().getStringArray(R.array.menus);
        		mTitle = menuItems[position];
        		if(mTitle.equals("Profile")){
        			FragmentProfile fragmentprofile = new FragmentProfile();
        			FragmentManager fragmentManager = getFragmentManager();
        			FragmentTransaction ft = fragmentManager.beginTransaction();
        			ft.replace(R.id.content_frame, fragmentprofile);
        			ft.commit();
        		}
        		
        		else if(mTitle.equals("Mini Questions")){
        			FragmentMiniquestions fragmentminiquestions = new FragmentMiniquestions();
        			FragmentManager fragmentManager = getFragmentManager();
        			FragmentTransaction ft = fragmentManager.beginTransaction();
        			ft.replace(R.id.content_frame, fragmentminiquestions);
        			ft.commit();
        		}
        		
        		else if(mTitle.equals("Math Questions")){
        			FragmentMathquestion fragmentmathquestion  = new FragmentMathquestion ();
        			FragmentManager fragmentManager = getFragmentManager();
        			FragmentTransaction ft = fragmentManager.beginTransaction();
        			ft.replace(R.id.content_frame, fragmentmathquestion );
        			ft.commit();
        		}
        		
        		else if (mTitle.equals("Exit")){
        			finish();
        		}
        		mDrawerLayout.closeDrawer(mDrawerList);
        	}
        });
        
        FragmentProfile fragmentprofile = new FragmentProfile();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction ft = fragmentManager.beginTransaction();
        ft.replace(R.id.content_frame, fragmentprofile);
        ft.commit();
    }
    
    @Override
    protected void onPostCreate(Bundle savedInstanceState){
    	super.onPostCreate(savedInstanceState);
    	mDrawerToggle.syncState();
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
    	if(mDrawerToggle.onOptionsItemSelected(item)){
    		return true;
    	}
    	return super.onOptionsItemSelected(item);
    }
    
    @Override
    public boolean onPrepareOptionsMenu(Menu menu){
    	boolean drawerOpen = mDrawerLayout.isDrawerOpen(mDrawerList);
    	
    	menu.findItem(R.id.action_settings).setVisible(!drawerOpen);
    	return super.onPrepareOptionsMenu(menu);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}

