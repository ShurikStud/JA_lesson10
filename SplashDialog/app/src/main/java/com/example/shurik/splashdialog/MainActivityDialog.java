package com.example.shurik.splashdialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by shurik on 03.11.2017.
 */

public class MainActivityDialog extends Dialog implements View.OnClickListener{

    private MainActivity activity;

    private Button buttonOk;
    private ImageView imageView;

    public MainActivityDialog(@NonNull Context context) {
        super(context);

        activity    = (MainActivity) context;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setCanceledOnTouchOutside(false);
        getWindow().setBackgroundDrawableResource(android.R.color.transparent);


        setContentView(R.layout.dialog_main_activity);

        buttonOk    = (Button) findViewById(R.id.dialog_main_activity_button_ok);
        buttonOk.setOnClickListener(this);

        imageView   = (ImageView) findViewById(R.id.dialog_main_activity_image_view);
        imageView.setImageResource(R.mipmap.ic_launcher_round);

    }

    @Override
    public void onClick(View v) {
        dismiss();
    }
}
