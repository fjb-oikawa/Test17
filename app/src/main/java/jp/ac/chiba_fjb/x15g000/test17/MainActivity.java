package jp.ac.chiba_fjb.x15g000.test17;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        View view = findViewById(R.id.include2);
//        TextView textView = (TextView) view.findViewById(R.id.textView);
//        textView.setText("テキスト設定");

        LinearLayout output = (LinearLayout) findViewById(R.id.output);

        LinearLayout layout;
        layout = (LinearLayout) getLayoutInflater().inflate(R.layout.layout1,null);
        output.addView(layout);
        layout = (LinearLayout) getLayoutInflater().inflate(R.layout.layout1,null);
        output.addView(layout);
        layout = (LinearLayout) getLayoutInflater().inflate(R.layout.layout1,null);
        output.addView(layout);
        layout = (LinearLayout) getLayoutInflater().inflate(R.layout.layout1,null);
        output.addView(layout);

        layout.removeAllViews();

    }
}
