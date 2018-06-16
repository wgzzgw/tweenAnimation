package com.example.tweenanimation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button mButton = (Button) findViewById(R.id.button);
        // 步骤1:创建 需要设置动画的 视图View
        Animation translateAnimation = AnimationUtils.loadAnimation(this, R.anim.view_animation);
        // 步骤2:创建 动画对象 并传入设置的动画效果xml文件
        final Interpolator i=new BounceInterpolator();
        translateAnimation.setInterpolator(i);
        mButton.startAnimation(translateAnimation);
        // 步骤3:播放动画
        mButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
            }
        });

        Button mButton1 = (Button) findViewById(R.id.button2);
        // 步骤1:创建 需要设置动画的 视图View
        Animation animation=new TranslateAnimation(0,500,0,500);
        // 步骤2：创建平移动画的对象：平移动画对应的Animation子类为TranslateAnimation
        // 参数分别是：
        // 1. fromXDelta ：视图在水平方向x 移动的起始值
        // 2. toXDelta ：视图在水平方向x 移动的结束值
        // 3. fromYDelta ：视图在竖直方向y 移动的起始值
        // 4. toYDelta：视图在竖直方向y 移动的结束值
        animation.setDuration(3000);
        // 固定属性的设置都是在其属性前加“set”，如setDuration（）
        mButton1.startAnimation(animation);
        // 步骤3:播放动画

        Button mButton2 = (Button) findViewById(R.id.button3);
        // 步骤1:创建 需要设置动画的 视图View
        Animation scaleAnimation = AnimationUtils.loadAnimation(this, R.anim.view_animation1);
        // 步骤2:创建 动画对象 并传入设置的动画效果xml文件
        mButton2.startAnimation(scaleAnimation);
        // 步骤3:播放动画

        Button mButton3 = (Button) findViewById(R.id.button4);
        // 步骤1:创建 需要设置动画的 视图View

        Animation scaleAnimation1 = new ScaleAnimation(0,2,0,2,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
        // 步骤2：创建缩放动画的对象 & 设置动画效果：缩放动画对应的Animation子类为ScaleAnimation
        // 参数说明:
        // 1. fromX ：动画在水平方向X的结束缩放倍数
        // 2. toX ：动画在水平方向X的结束缩放倍数
        // 3. fromY ：动画开始前在竖直方向Y的起始缩放倍数
        // 4. toY：动画在竖直方向Y的结束缩放倍数
        // 5. pivotXType:缩放轴点的x坐标的模式
        // 6. pivotXValue:缩放轴点x坐标的相对值
        // 7. pivotYType:缩放轴点的y坐标的模式
        // 8. pivotYValue:缩放轴点y坐标的相对值

        // pivotXType = Animation.ABSOLUTE:缩放轴点的x坐标 =  View左上角的原点 在x方向 加上 pivotXValue数值的点(y方向同理)
        // pivotXType = Animation.RELATIVE_TO_SELF:缩放轴点的x坐标 = View左上角的原点 在x方向 加上 自身宽度乘上pivotXValue数值的值(y方向同理)
        // pivotXType = Animation.RELATIVE_TO_PARENT:缩放轴点的x坐标 = View左上角的原点 在x方向 加上 父控件宽度乘上pivotXValue数值的值 (y方向同理)
        scaleAnimation1.setDuration(3000);
        // 固定属性的设置都是在其属性前加“set”，如setDuration（）
        mButton3.startAnimation(scaleAnimation1);

        Button mButton4 = (Button) findViewById(R.id.button5);
        // 步骤1:创建 需要设置动画的 视图View
        Animation rotateAnimation = AnimationUtils.loadAnimation(this, R.anim.view_animation3);
        // 步骤2:创建 动画对象 并传入设置的动画效果xml文件
        mButton4.startAnimation(rotateAnimation);
        // 步骤3:播放动画

        Button mButton5 = (Button) findViewById(R.id.button6);
        // 步骤1:创建 需要设置动画的 视图View

        Animation rotateAnimation1 = new RotateAnimation(0,270,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
        // 步骤2：创建旋转动画的对象 & 设置动画效果：旋转动画对应的Animation子类为RotateAnimation
        // 参数说明:
        // 1. fromDegrees ：动画开始时 视图的旋转角度(正数 = 顺时针，负数 = 逆时针)
        // 2. toDegrees ：动画结束时 视图的旋转角度(正数 = 顺时针，负数 = 逆时针)
        // 3. pivotXType：旋转轴点的x坐标的模式
        // 4. pivotXValue：旋转轴点x坐标的相对值
        // 5. pivotYType：旋转轴点的y坐标的模式
        // 6. pivotYValue：旋转轴点y坐标的相对值

        // pivotXType = Animation.ABSOLUTE:旋转轴点的x坐标 =  View左上角的原点 在x方向 加上 pivotXValue数值的点(y方向同理)
        // pivotXType = Animation.RELATIVE_TO_SELF:旋转轴点的x坐标 = View左上角的原点 在x方向 加上 自身宽度乘上pivotXValue数值的值(y方向同理)
        // pivotXType = Animation.RELATIVE_TO_PARENT:旋转轴点的x坐标 = View左上角的原点 在x方向 加上 父控件宽度乘上pivotXValue数值的值 (y方向同理)


        rotateAnimation1.setDuration(3000);
        // 固定属性的设置都是在其属性前加“set”，如setDuration（）

        mButton5.startAnimation(rotateAnimation1);
        // 步骤3：播放动画

        Button mButton6 = (Button) findViewById(R.id.button7);
        // 步骤1:创建 需要设置动画的 视图View
        Animation alphaAnimation = AnimationUtils.loadAnimation(this, R.anim.view_animation2);
        // 步骤2:创建 动画对象 并传入设置的动画效果xml文件
        mButton6.startAnimation(alphaAnimation);
        // 步骤3:播放动画

        Button mButton7 = (Button) findViewById(R.id.button8);
        // 步骤1:创建 需要设置动画的 视图View
        Animation alphaAnimation1 = new AlphaAnimation(1,0);
        // 步骤2：创建透明度动画的对象 & 设置动画效果：透明度动画对应的Animation子类为AlphaAnimation
        // 参数说明:
        // 1. fromAlpha:动画开始时视图的透明度(取值范围: -1 ~ 1)
        // 2. toAlpha:动画结束时视图的透明度(取值范围: -1 ~ 1)
        alphaAnimation1.setDuration(3000);
        // 固定属性的设置都是在其属性前加“set”，如setDuration（）
        mButton7.startAnimation(alphaAnimation1);
        // 步骤3：播放动画

        Button mButton8 = (Button) findViewById(R.id.button9);
        // 步骤1:创建 需要设置动画的 视图View
        Animation setAnimation = AnimationUtils.loadAnimation(this, R.anim.view_animation4);
        // 步骤2:创建 动画对象 并传入设置的动画效果xml文件
        mButton8.startAnimation(setAnimation);
        // 步骤3:播放动画

        Button mButton9 = (Button) findViewById(R.id.button10);
        // 创建 需要设置动画的 视图View

        // 组合动画设置
        AnimationSet setAnimation1 = new AnimationSet(true);
        // 步骤1:创建组合动画对象(设置为true)


        // 步骤2:设置组合动画的属性
        // 步骤3:逐个创建子动画(方式同单个动画创建方式,此处不作过多描述)
        // 子动画1:旋转动画
        Animation rotate = new RotateAnimation(0,360,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
        rotate.setDuration(1000);
        rotate.setRepeatMode(Animation.RESTART);
        rotate.setRepeatCount(Animation.INFINITE);

        // 子动画2:平移动画
        Animation translate = new TranslateAnimation(TranslateAnimation.RELATIVE_TO_PARENT,-0.5f,
                TranslateAnimation.RELATIVE_TO_PARENT,0.5f,
                TranslateAnimation.RELATIVE_TO_SELF,0
                ,TranslateAnimation.RELATIVE_TO_SELF,0);
        translate.setDuration(10000);

        // 子动画3:透明度动画
        Animation alpha = new AlphaAnimation(1,0);
        alpha.setDuration(3000);
        alpha.setStartOffset(7000);

        // 子动画4:缩放动画
        Animation scale1 = new ScaleAnimation(1,0.5f,1,0.5f,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
        scale1.setDuration(1000);
        scale1.setStartOffset(4000);

        // 步骤4:将创建的子动画添加到组合动画里
        setAnimation1.addAnimation(alpha);
        setAnimation1.addAnimation(rotate);
        setAnimation1.addAnimation(translate);
        setAnimation1.addAnimation(scale1);

        mButton9.startAnimation(setAnimation1);
        // 步骤5:播放动画
        setAnimation1.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                // 动画开始时回调
                Log.d(TAG, "onAnimationStart: ");
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                // 动画结束时回调
                Log.d(TAG, "onAnimationEnd: ");
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                //动画重复执行的时候回调
                Log.d(TAG, "onAnimationRepeat: ");
            }
        });

       Button mButton10 = (Button) findViewById(R.id.button11);
        // 创建动画作用对象：此处以Button为例
        // 步骤1:创建 需要设置动画的 视图View
        Animation animation10=new TranslateAnimation(0,800,0,800);
        // 步骤2：创建平移动画的对象：平移动画对应的Animation子类为TranslateAnimation
        // 参数分别是：
        // 1. fromXDelta ：视图在水平方向x 移动的起始值
        // 2. toXDelta ：视图在水平方向x 移动的结束值
        // 3. fromYDelta ：视图在竖直方向y 移动的起始值
        // 4. toYDelta：视图在竖直方向y 移动的结束值
        animation10.setDuration(3000);
        // 固定属性的设置都是在其属性前加“set”，如setDuration（）
        mButton10.startAnimation(animation10);
        mButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
                // 自定义 从右向左滑动的效果
                overridePendingTransition(R.anim.in_from_right, R.anim.out_to_left);
            /*    // 淡入淡出的动画效果
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);*/
                // 从左向右滑动的效果
                //即被启动的活动是从左边进来的，启动它的活动从右边出去的效果
            /*    overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);*/
// 采用overridePendingTransition（int enterAnim, int exitAnim）进行设置
// enterAnim：从Activity a跳转到Activity b，进入b时的动画效果资源ID
// exitAnim：从Activity a跳转到Activity b，离开a时的动画效果资源Id

// 特别注意
// overridePendingTransition（）必须要在startActivity(intent)后被调用才能生效
            }
        });
    }
}
