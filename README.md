# really-simple-recyclerview
A really simple implementation of reyclerview

All I wanted to do was to have a recyclerview that displayed an image an text.
I tried multiple libraries that were overly complicated or had errors when I followed their tutorials.
I have created many recyclerviews and always copied and pasted my past code and always told myself I would make a 
generic recyclerview implementation. So I created the easiest example I could.

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



Add these string to your application with your own custom values to override the defaults 
if you want a different size textview or imageview:

   <string name="really_simple_recyclerview_imageview_height">70dp</string>
   <string name="really_simple_recyclerview_imageview_width">match_parent</string>
   <string name="really_simple_recyclerview_imageview_weight">80</string>

   <string name="really_simple_recyclerview_textview_height">70dp</string>
   <string name="really_simple_recyclerview_textview_width">match_parent</string>
   <string name="really_simple_recyclerview_textview_weight">20</string>
