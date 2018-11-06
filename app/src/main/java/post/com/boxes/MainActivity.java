package post.com.boxes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private EditText edWidth;
    private EditText edLength;
    private EditText edHeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
    }

    public void findViews(){
        edWidth = findViewById(R.id.ed_width);
        edLength = findViewById(R.id.ed_length);
        edHeight = findViewById(R.id.ed_height);
    }

    public void check(View view){
        String w = edWidth.getText().toString();
        String l = edLength.getText().toString();
        String h = edHeight.getText().toString();
        float width = Float.parseFloat(w);
        float length = Float.parseFloat(l);
        float height = Float.parseFloat(h);

        if(width <= 14 && length <= 23 && height <= 13){
            Intent intent = new Intent(this,ResultActivity.class);
            startActivity(intent);
        }
    }



}
