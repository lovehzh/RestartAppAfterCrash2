package restart.app.com;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Administrator on 2017/4/20.
 */

public class ThridActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thrid);
//        Thread.setDefaultUncaughtExceptionHandler(new MyExceptionHandler(this));
//
//        if (getIntent().getBooleanExtra("crash", false)) {
//            Toast.makeText(this, "App restarted after crash", Toast.LENGTH_SHORT).show();
//        }
    }

    public void crashMe(View v) {
        throw new NullPointerException();
    }

    public void goBack(View v) {
        finish();
    }
}
