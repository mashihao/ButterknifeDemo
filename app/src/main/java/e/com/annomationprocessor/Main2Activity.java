package e.com.annomationprocessor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import me.shouheng.knife.annotation.BindView;
import me.shouheng.knife.annotation.OnClick;
import me.shouheng.knife.api.MyKnife;

public class Main2Activity extends AppCompatActivity {

    @BindView(id = R.id.button)
    Button button;

    @BindView(id = R.id.button2)
    Button button2;

    @OnClick(ids = {R.id.button})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:
                Toast.makeText(this, "hahaha", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    @OnClick(ids = {R.id.button2})
    public void onClick2(View view) {
        switch (view.getId()) {
            case R.id.button2:
                Toast.makeText(this, "222222", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyKnife.bind(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        MyKnife.unbind(this);
    }
}
