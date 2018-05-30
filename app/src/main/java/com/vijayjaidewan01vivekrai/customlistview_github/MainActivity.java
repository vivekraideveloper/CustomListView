    package com.vijayjaidewan01vivekrai.customlistview_github;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

    public class MainActivity extends AppCompatActivity {
    private ListView listView;
    String text[] = {"Aestro", "Blender","Cupcake"};
    Integer image[] = {R.drawable.android, R.drawable.android_b, R.drawable.android_a};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list_view);
        CustomAdapter adapter = new CustomAdapter(MainActivity.this,image, text );
        listView.setAdapter(adapter);

    }
}
