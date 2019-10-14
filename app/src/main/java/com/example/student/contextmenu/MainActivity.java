package com.example.student.contextmenu;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button;
    ConstraintLayout manhinh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button  = (Button)findViewById(R.id.button);
        manhinh = (ConstraintLayout)findViewById(R.id.manhinh);

        //dang ky view cho context menu
        registerForContextMenu(button);


    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.context_menu,menu);
        menu.setHeaderTitle("Show context menu");
        menu.setHeaderIcon(R.mipmap.ic_launcher);
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (item.getItemId()){
            case R.id.id_red: manhinh.setBackgroundColor(getResources().getColor(R.color.clred));
                break;
            case R.id.id_green: button.setTextColor(getResources().getColor(R.color.clrgreen));
                break;
            case R.id.id_blue: button.setTextColor(getResources().getColor(R.color.clrble));
                break;
                default:button.setTextColor(getResources().getColor(R.color.clred));
                        break;
        }
        return super.onContextItemSelected(item);
    }
}
