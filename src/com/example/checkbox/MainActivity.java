package com.example.checkbox;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.CompoundButton.OnCheckedChangeListener;

public class MainActivity extends Activity implements OnCheckedChangeListener {

	CheckBox cb,cb1,cb2;
	int count = 0;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        init();
        
    }


	private void init() {
		cb = (CheckBox) findViewById(R.id.cb);
		cb1 = (CheckBox) findViewById(R.id.cb1);
		cb2 = (CheckBox) findViewById(R.id.cb2);
		
		cb.setOnCheckedChangeListener(this);
		cb1.setOnCheckedChangeListener(this);
		cb2.setOnCheckedChangeListener(this);
		
	}

	@Override
	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
		/*if(isChecked){
			count++;
		}else{
			count--;
		}*/
		String checkedValue = "";
		if(cb.isChecked()){
			checkedValue = cb.getText().toString() + " ";
		}
		if(cb1.isChecked()){
			checkedValue += cb1.getText().toString() + " ";
		}
		if(cb2.isChecked()){
			checkedValue += cb2.getText().toString() + " ";
		}
		
		if(checkedValue.isEmpty()){
			checkedValue = "Nothing is checked.";
		}
		
		Toast.makeText(this, checkedValue, Toast.LENGTH_LONG).show();
	}
    
}
