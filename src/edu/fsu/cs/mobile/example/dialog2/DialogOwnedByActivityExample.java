package edu.fsu.cs.mobile.example.dialog2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DialogOwnedByActivityExample extends Activity {
	
	private final String DIALOG_TAG = "DIALOG_FRAGMENT";
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button button = (Button) findViewById(R.id.button1);
        
        button.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {

				MyDialogFragment.newInstance("This is a dialog!").show(getFragmentManager(), 
						DIALOG_TAG);
				
			}
		});
    }
}