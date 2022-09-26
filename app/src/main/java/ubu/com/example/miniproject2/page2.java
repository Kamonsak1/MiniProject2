package ubu.com.example.miniproject2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class page2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        Intent intent = getIntent();
        String Namefriend = intent.getStringExtra("Friend");
        String ImgName = intent.getStringExtra("ImgFriend");

        ImageView imageView = (ImageView) findViewById(R.id.imageView5);
        switch (ImgName){
            case "friend1": imageView.setImageResource(R.drawable.friend1); break;
            case "friend2": imageView.setImageResource(R.drawable.friend2); break;
            case "friend3": imageView.setImageResource(R.drawable.friend3); break;
            case "friend4": imageView.setImageResource(R.drawable.friend4); break;
            case "friend5": imageView.setImageResource(R.drawable.friend5); break;
            default: imageView.setImageResource(R.drawable.friend6);
        }
        TextView textView = (TextView)  findViewById(R.id.textView);
        textView.setText(Namefriend);
    }
}