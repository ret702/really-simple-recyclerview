package me.squadgoals.com.reallysimplerecyclerview;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.Map;

/**
 * Created by ret70 on 1/30/2018.
 */

public class SetAdapter
{
    public SetAdapter(Context context, Map<String,Bitmap> map)
    {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false);
        RecyclerView recyclerView = (RecyclerView) ((Activity) context).findViewById(R.id.really_simple_recyclerview);
        recyclerView.setLayoutManager(linearLayoutManager);
        Adapter adapter = new Adapter(map);
        recyclerView.setAdapter(adapter);
    }

}
