package sg.edu.rp.c346.id20045524.demosimplelistviewexamtips;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvExamTips;
    String[] examTipsArray =
    { "Don't just read the code, code it as much as possible during each practical session",
      "Seek help from the lecturer ASAP, don't wait till you lost in the jungle",
      "Prepare your template source code for each topic",
      "Create a few empty Android projects to speed up your coding during the exam",
      "Ensure that your Android Studio is up and running before the exam"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvExamTips = findViewById(R.id.listViewExamTips);

        //ArrayAdapter, taking the String array, examTipsArray as an input.
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, //where
                android.R.layout.simple_list_item_1, //how
                examTipsArray); //what

        //binding of data source to ListView
        lvExamTips.setAdapter(adapter);
    }
}

