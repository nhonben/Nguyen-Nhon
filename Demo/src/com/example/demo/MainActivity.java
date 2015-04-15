package com.example.demo;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //lấy về các thành phần trong main.xml thông qua id
        final EditText edit = (EditText) findViewById(R.id.editText);
        final TextView text = (TextView) findViewById(R.id.textView);
        final Button button = (Button) findViewById(R.id.button);
        //thiết lập xử lí cho sự kiện nhấn nút
        button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				text.setText(edit.getText().toString());
				edit.setText("");
				
			}

			
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
