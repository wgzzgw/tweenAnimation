package com.example.tweenanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private static final String TAG = "Main2Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button t1=(Button) findViewById(R.id.text1);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: ");
                finish();
            }
        });
        String[] data={"1","2","3","4","5"};
        ListView listView=(ListView)findViewById(R.id.listView1);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(Main2Activity.this,android.R.layout.simple_list_item_1,
                data);
        listView.setAdapter(arrayAdapter);
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.view_animation5);
        // 加载子元素的出场动画

        LayoutAnimationController controller = new LayoutAnimationController(animation);
        controller.setDelay(0.5f);
        controller.setOrder(LayoutAnimationController.ORDER_REVERSE);
        // 设置LayoutAnimation的属性

        listView.setLayoutAnimation(controller);
        // 为ListView设置LayoutAnimation的属性
    }

    @Override
    public void finish() {
        super.finish();
        // 从右向左滑动的效果
        overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
// 采用overridePendingTransition（int enterAnim, int exitAnim）进行设置
// enterAnim：从Activity a跳转到Activity b，进入b时的动画效果资源ID
// exitAnim：从Activity a跳转到Activity b，离开a时的动画效果资源Id

// 特别注意
// overridePendingTransition（）必须要在finish()后被调用才能生效
    }
}
