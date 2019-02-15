package e.com.annomationprocessor;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import me.shouheng.knife.annotation.BindView;
import me.shouheng.knife.annotation.OnClick;
import me.shouheng.knife.api.MyKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(id = R.id.button)
    Button button;

    @BindView(id = R.id.button2)
    Button button2;

    @OnClick(ids = {R.id.button, R.id.button2})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:
                Toast.makeText(this, "111111", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, Main2Activity.class));
                break;
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
    }
}
