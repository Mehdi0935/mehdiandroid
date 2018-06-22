package ir.faranesh.mehdiandroid;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class menu extends ListActivity {

    String myClass[]={"MainActivity","calc","Class2"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setListAdapter(new ArrayAdapter<String>(menu.this,android.R.layout.simple_list_item_1 , myClass));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        String which_Class = myClass[position];

        try{
            Class ourclass = Class.forName("ir.faranesh.mehdiandroid."+ which_Class);

            Intent openClass = new Intent(menu.this , ourclass);
            startActivity(openClass);



        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
