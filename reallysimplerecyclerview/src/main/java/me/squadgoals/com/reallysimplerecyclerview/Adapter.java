package me.squadgoals.com.reallysimplerecyclerview;

import android.graphics.Bitmap;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by ret70 on 1/12/2016.
 */
public class Adapter  extends RecyclerView.Adapter<Adapter.ParentViewHolder>
{

    List<Model> list;

    int curSize;
    int start = 0;



    public Adapter(Map<String,Bitmap> map)
    {
        curSize = map.size();
        this.list = fillModel(map);
    }

    @Override
    public ParentViewHolder onCreateViewHolder(ViewGroup viewGroup, int i)
    {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_view, viewGroup, false);
        return new ParentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ParentViewHolder parentViewHolder, int i)
    {
        parentViewHolder.textView.setText((String) list.get(i).getText());
        parentViewHolder.imageView.setImageBitmap((Bitmap) list.get(i).getImage());
    }


    public void addItem(List<Model> items)
    {
        int lastKnownSize = items.size();
        for (int i = 0; i < items.size(); i++) {
            this.list.add(items.get(i));
        }

        notifyItemRangeInserted(lastKnownSize, items.size());
        //     notifyItemInserted(urls.size()-1);

    }


    @Override
    public int getItemCount()
    {
        return this.list.size();
    }

    class ParentViewHolder extends RecyclerView.ViewHolder
    {
        ImageView imageView;
        TextView textView;

        public ParentViewHolder(View itemView)
        {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.really_simple_recyclerview_textview);
            imageView = (ImageView) itemView.findViewById(R.id.really_simple_recyclerview_imageview);

        }
    }

    public ArrayList fillModel(Map<String, Bitmap> map)
    {
        ArrayList<Model> modelList = new ArrayList<>();
        for(Map.Entry entry: map.entrySet())
        {
           modelList.add(new Model((String)entry.getKey(),(Bitmap)entry.getValue()));

        }
        return modelList;
    }


    private class Model
    {
        private String text;
        private Bitmap image;

       public Model(String text, Bitmap image)
        {
            this.text=text;
            this.image=image;
        }
        public String getText()
        {
            return text;
        }

        public void setText(String text)
        {
            this.text = text;
        }

        public Bitmap getImage()
        {
            return image;
        }

        public void setImage(Bitmap image)
        {
            this.image = image;
        }
    }

}