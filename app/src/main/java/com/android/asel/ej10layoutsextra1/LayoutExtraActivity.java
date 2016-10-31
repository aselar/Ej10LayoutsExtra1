package com.android.asel.ej10layoutsextra1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;

import org.w3c.dom.Text;

public class LayoutExtraActivity extends AppCompatActivity {

    private TextView textViewTextoLargo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_extra);

        textViewTextoLargo = (TextView) findViewById(R.id.textViewTextoLargo);

        textViewTextoLargo.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        textViewTextoLargo.setSingleLine(true);
        textViewTextoLargo.setMarqueeRepeatLimit(5);
        textViewTextoLargo.setSelected(true);
        

    }
}
