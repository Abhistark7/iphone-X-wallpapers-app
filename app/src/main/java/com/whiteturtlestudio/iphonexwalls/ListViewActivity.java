package com.whiteturtlestudio.iphonexwalls;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class ListViewActivity extends AppCompatActivity {

    public static String[] eatFoodyImages = {
            "https://firebasestorage.googleapis.com/v0/b/galaxy-s9-wallpapers.appspot.com/o/december.jpg?alt=media&token=053eca04-267a-47e0-8ce1-e81b77dfca52",
            "https://firebasestorage.googleapis.com/v0/b/galaxy-s9-wallpapers.appspot.com/o/february.jpg?alt=media&token=1384243f-8a67-4003-b753-e9d9183d77ad",
            "https://firebasestorage.googleapis.com/v0/b/galaxy-s9-wallpapers.appspot.com/o/january.jpg?alt=media&token=0bc8dfc2-1654-4df5-8e20-2859af895656",
            "https://firebasestorage.googleapis.com/v0/b/galaxy-s9-wallpapers.appspot.com/o/never%20settle.jpg?alt=media&token=62c2c0a8-d886-43f6-b9c9-5946b3377dfe",
            "https://firebasestorage.googleapis.com/v0/b/galaxy-s9-wallpapers.appspot.com/o/december.jpg?alt=media&token=053eca04-267a-47e0-8ce1-e81b77dfca52",
            "https://firebasestorage.googleapis.com/v0/b/galaxy-s9-wallpapers.appspot.com/o/february.jpg?alt=media&token=1384243f-8a67-4003-b753-e9d9183d77ad",
            "https://firebasestorage.googleapis.com/v0/b/galaxy-s9-wallpapers.appspot.com/o/january.jpg?alt=media&token=0bc8dfc2-1654-4df5-8e20-2859af895656",
            "https://firebasestorage.googleapis.com/v0/b/galaxy-s9-wallpapers.appspot.com/o/never%20settle.jpg?alt=media&token=62c2c0a8-d886-43f6-b9c9-5946b3377dfe",
            "https://firebasestorage.googleapis.com/v0/b/galaxy-s9-wallpapers.appspot.com/o/december.jpg?alt=media&token=053eca04-267a-47e0-8ce1-e81b77dfca52",
            "https://firebasestorage.googleapis.com/v0/b/galaxy-s9-wallpapers.appspot.com/o/february.jpg?alt=media&token=1384243f-8a67-4003-b753-e9d9183d77ad",
            "https://firebasestorage.googleapis.com/v0/b/galaxy-s9-wallpapers.appspot.com/o/january.jpg?alt=media&token=0bc8dfc2-1654-4df5-8e20-2859af895656",
            "https://firebasestorage.googleapis.com/v0/b/galaxy-s9-wallpapers.appspot.com/o/never%20settle.jpg?alt=media&token=62c2c0a8-d886-43f6-b9c9-5946b3377dfe"
    };

    private Context context = ListViewActivity.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        ListView listView = (ListView) findViewById(R.id.usage_example_listview);
        listView.setAdapter(
                new SimpleImageListAdapter(
                        ListViewActivity.this,
                        eatFoodyImages
                )
        );
    }


}