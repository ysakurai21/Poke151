package com.mycompany.Poke151;

import java.util.HashMap;
import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.content.res.Resources;
import android.widget.SearchView.*;
import android.content.*;

public class MainActivity extends Activity
{
	
	private static final String MATCH_HIRAGANA = "[\\u3040-\\u309F]+$";
	private static final String MATCH_KATAKANA  = "[\\u30A0-\\u30FF]+$";
	
	HashMap<String, String> name_map = new HashMap<String, String>();
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.table);
		
		Button btn = (Button)findViewById(R.id.button);
		btn.setOnClickListener(new OnClickListener(){
			
			public void onClick(View v){
			//get text
			EditText text_box = (EditText)findViewById(R.id.text_box);
			
			String inp_text = text_box.getText().toString();
			
				if (inp_text.matches(MATCH_HIRAGANA)){
				Utils ul = new Utils();
				inp_text = ul.KanaHenkan(inp_text);
				Toast toast_1 = Toast.makeText(MainActivity.this, inp_text, Toast.LENGTH_LONG);
				toast_1.show();
				
				}else if (!inp_text.matches(MATCH_HIRAGANA) && !inp_text.matches(MATCH_KATAKANA)){
				Toast toast = Toast.makeText(MainActivity.this, "カタカナ、又はひらがなで入力してください。", Toast.LENGTH_LONG);
				toast.show();
			}
			
			if(inp_text.equals("フシギダネ")){
				findViewById(R.id.POKE001).setVisibility(View.VISIBLE);
				findViewById(R.id.NAME001).setVisibility(View.VISIBLE);
			}
					
			
			}
		});
    }
		

}
