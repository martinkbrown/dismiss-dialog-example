package edu.fsu.cs.mobile.example.dialog2;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DialogOwnedByActivityExample extends Activity {
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button button = (Button) findViewById(R.id.button1);
        
        button.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {

				showDialog(0);
				
			}
		});
    }
    
    @Override
    protected Dialog onCreateDialog(int id) {
    	
    	// I don't have a switch statement because there's only one
    	// dialog that I have in this app
    	
    	Dialog dialog = null;
    	Builder builder = new AlertDialog.Builder(this);
    	builder.setMessage("This is a dialog!");
    	builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				
				dialog.dismiss();
				
			}
		});
    	
    	dialog = builder.create();
    	
    	return dialog;
    	
    }
}