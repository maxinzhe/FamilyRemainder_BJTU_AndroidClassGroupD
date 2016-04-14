package com.example.letao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class FindNearActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_near);
        GridView gridview = (GridView) findViewById(R.id.gridview);

        //生成动态数组，并且转入数据
        ArrayList<HashMap<String, Object>> lstImageItem = new ArrayList<HashMap<String, Object>>();
            HashMap<String, Object> map = new HashMap<String, Object>();
            map.put("ItemImage", R.drawable.chess);
            map.put("ItemText", "棋牌");
        lstImageItem.add(map);
        map = new HashMap<String, Object>();

        map.put("ItemImage", R.drawable.dance);
        map.put("ItemText", "广场舞");
        lstImageItem.add(map);
        map = new HashMap<String, Object>();

        map.put("ItemImage", R.drawable.flower);
        map.put("ItemText", "花草");
        lstImageItem.add(map);

        map = new HashMap<String, Object>();

        map.put("ItemImage", R.drawable.opera);
        map.put("ItemText", "戏剧");
        lstImageItem.add(map);

        map = new HashMap<String, Object>();

        map.put("ItemImage", R.drawable.paint);
        map.put("ItemText", "书画");
        lstImageItem.add(map);

        map = new HashMap<String, Object>();

        map.put("ItemImage", R.drawable.patient);
        map.put("ItemText", "病友");
            lstImageItem.add(map);

        //生成适配器的ImageItem <====> 动态数组的元素，两者一一对应
        SimpleAdapter saImageItems = new SimpleAdapter(this, //没什么解释
                lstImageItem,//数据来源
                R.layout.finditem,//night_item的XML实现

                //动态数组与ImageItem对应的子项
                new String[]{"ItemImage", "ItemText"},

                //ImageItem的XML文件里面的一个ImageView,两个TextView ID
                new int[]{R.id.ItemImage, R.id.ItemText});
        //添加并且显示
        gridview.setAdapter(saImageItems);

        Button bt_more = (Button) this.findViewById(R.id.bt_more);
        bt_more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        //添加消息处理
//        gridview.setOnItemClickListener(new ItemClickListener());


//    //当AdapterView被单击(触摸屏或者键盘)，则返回的Item单击事件
//    class ItemClickListener implements AdapterView.OnItemClickListener {
//        public void onItemClick(AdapterView<?> arg0,//The AdapterView where the click happened
//                                View arg1,//The view within the AdapterView that was clicked
//                                int arg2,//The position of the view in the adapter
//                                long arg3//The row id of the item that was clicked
//        ) {
//            //在本例中arg2=arg3
//            HashMap<String, Object> item = (HashMap<String, Object>) arg0.getItemAtPosition(arg2);
//            //显示所选Item的ItemText
//            setTitle((String) item.get("ItemText"));
//        }

        ListView nearlist = (ListView) this.findViewById(R.id.nearlist);

    }

}