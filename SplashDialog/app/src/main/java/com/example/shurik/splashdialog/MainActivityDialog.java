package com.example.shurik.splashdialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.Button;

/**
 * Created by shurik on 03.11.2017.
 */

public class MainActivityDialog extends Dialog implements View.OnClickListener{

    private MainActivity activity;

    private Button buttonOk;

    public MainActivityDialog(@NonNull Context context) {
        super(context);

        activity    = (MainActivity) context;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.dialog_main_activity);

        buttonOk    = (Button) findViewById(R.id.dialog_main_activity_button_ok);
        buttonOk.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        dismiss();
    }
}
