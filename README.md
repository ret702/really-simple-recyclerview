# really-simple-recyclerview
A really simple implementation of recyclerview

A really simple implementation of a recyclerview without all the bells and whistles and without the headache

How to use:
        
Include this recyclerview in your layout:

        <include
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        layout="@layout/really_simple_recyclerview_layout" />
        
Create a HashMap with the keys as the text you would like , and the values as the bitmaps you would like, i.e:
        
        Map<String,Bitmap> objects = new HashMap<>();
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher);
        objects.put("test",bitmap);

Then just call: 

      SetAdapter adapter= new SetAdapter(this,objects);
      
And voila!



Add these string names to your application with your own custom values to override the defaults 
if you want a different size textview or imageview:


  really_simple_recyclerview_imageview_height </br>
  really_simple_recyclerview_imageview_width</br>
  really_simple_recyclerview_imageview_weight</br>

  really_simple_recyclerview_textview_height</br>
  really_simple_recyclerview_textview_width</br>
  really_simple_recyclerview_textview_weight</br>
