package edu.fsu.cs.mobile.example.dialog2;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

public class MyDialogFragment extends DialogFragment {
	public static MyDialogFragment newInstance(String message) {
		MyDialogFragment fragment = new MyDialogFragment();
		Bundle args = new Bundle();
		args.putString("message", message);
		fragment.setArguments(args);
		return fragment;
		
		
	}
	
	
	@Override
	public Dialog onCreateDialog(Bundle savedInstanceState) {
		String message = getArguments().getString("title");
		
		return new AlertDialog.Builder(getActivity())
			.setMessage(message)
			.setPositiveButton("OK", new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
					dialog.dismiss();
				}
			})
			.create();
	}
}
