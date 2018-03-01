package com.example.android.p3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int question_counter;
    String name;
    int age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = (ImageView) findViewById(R.id.first_page);
        imageView.setImageResource(R.drawable.first_page);
    }

    public void Next(View view) {
        Button button = (Button) findViewById(R.id.next);
        button.setVisibility(View.INVISIBLE);
        ImageView imageView1 = (ImageView) findViewById(R.id.first_page);
        imageView1.setVisibility(View.INVISIBLE);

    }

    public void submit(View view) {
        EditText nameField = (EditText) findViewById(R.id.name_field);
        name = nameField.getText().toString();
        nameField.setVisibility(View.INVISIBLE);


        CheckBox ten = (CheckBox) findViewById(R.id.ten);
        boolean tenBoolean = ten.isChecked();
        if (tenBoolean) age = 1;
        ten.setVisibility(View.INVISIBLE);

        CheckBox twenty = (CheckBox) findViewById(R.id.twenty);
        boolean twentyBoolean = twenty.isChecked();
        if (twentyBoolean) age = 2;
        twenty.setVisibility(View.INVISIBLE);

        CheckBox thirty = (CheckBox) findViewById(R.id.thirty);
        boolean thirtyBoolean = thirty.isChecked();
        if (thirtyBoolean) age = 3;
        thirty.setVisibility(View.INVISIBLE);

        TextView textViewAge = (TextView)findViewById(R.id.age_field);
        textViewAge.setVisibility(View.INVISIBLE);

        Button button1 = (Button) findViewById(R.id.yes);
        button1.setVisibility(View.VISIBLE);

        Button button2 = (Button) findViewById(R.id.no);
        button2.setVisibility(View.VISIBLE);

        Button button_submit = (Button)findViewById(R.id.submit);
        button_submit.setVisibility(View.INVISIBLE);

        TextView textView = (TextView) findViewById(R.id.question);
        textView.setText("你会因为身份的关系去拒绝爱你的人吗");
        question_counter = 1;
        textView.setTextSize(20);
    }


    public void YES(View view) {
        if (question_counter == 15) {
            resultE();
        }
        if (question_counter == 14) {
            question15();
        }
        if (question_counter == 13) {
            resultB();
        }
        if (question_counter == 12) {
            question13();
        }
        if (question_counter == 11) {
            question12();
        }
        if (question_counter == 10) {
            question11();
        }
        if (question_counter == 9) {
            question10();
        }
        if (question_counter == 8) {
            question9();
        }
        if (question_counter == 7) {
            question8();
        }
        if (question_counter == 6) {
            question7();
        }
        if (question_counter == 5) {
            question6();
        }
        if (question_counter == 4) {
            question5();
        }
        if (question_counter == 3) {
            question4();
        }
        if (question_counter == 2) {
            question3();
        }
        if (question_counter == 1) {
            question2();
        }

    }

    public void NO(View view) {
        if (question_counter == 15) {
            resultD();
        }
        if (question_counter == 14) {
            resultC();
        }
        if (question_counter == 13) {
            question14();
        }
        if (question_counter == 12) {
            resultA();
        }
        if (question_counter == 11) {
            question13();
        }
        if (question_counter == 10) {
            question12();
        }
        if (question_counter == 9) {
            question11();
        }
        if (question_counter == 8) {
            question10();
        }
        if (question_counter == 7) {
            question9();
        }
        if (question_counter == 6) {
            question8();
        }
        if (question_counter == 5) {
            question7();
        }
        if (question_counter == 4) {
            question6();
        }
        if (question_counter == 3) {
            question5();
        }
        if (question_counter == 2) {
            question4();
        }
        if (question_counter == 1) {
            question3();
        }

    }

    private void question2() {
        TextView textView = (TextView) findViewById(R.id.question);
        textView.setText("\"相敬如宾\"是你追求的爱情吗？");
        question_counter = 2;
    }

    private void question3() {
        TextView textView = (TextView) findViewById(R.id.question);
        textView.setText("你觉得分手了以后旧情人可以做朋友吗？");
        question_counter = 3;
    }

    private void question4() {
        TextView textView = (TextView) findViewById(R.id.question);
        textView.setText("分手时，你曾经求TA，挽留TA？");
        question_counter = 4;
    }

    private void question5() {
        TextView textView = (TextView) findViewById(R.id.question);
        textView.setText("你会因为TA始终无法走入自己的心而终止爱情吗？");
        question_counter = 5;
    }

    private void question6() {
        TextView textView = (TextView) findViewById(R.id.question);
        textView.setText("你认为主动追来的感情可以长久吗？");
        question_counter = 6;
    }

    private void question7() {
        TextView textView = (TextView) findViewById(R.id.question);
        textView.setText("你相信爱情吗？");
        question_counter = 7;
    }

    private void question8() {
        TextView textView = (TextView) findViewById(R.id.question);
        textView.setText("你分得清爱与喜欢的差别吗？");
        question_counter = 8;
    }

    private void question9() {
        TextView textView = (TextView) findViewById(R.id.question);
        textView.setText("你有没有过常年偷偷喜欢一个异性朋友？");
        question_counter = 9;
    }

    private void question10() {
        TextView textView = (TextView) findViewById(R.id.question);
        textView.setText("你有看爱情相关的书籍或电影而流泪吗？");
        question_counter = 10;
    }

    private void question11() {
        TextView textView = (TextView) findViewById(R.id.question);
        textView.setText("你是否有失去过自我的生活？");
        question_counter = 11;
    }

    private void question12() {
        TextView textView = (TextView) findViewById(R.id.question);
        textView.setText("你认为婚姻是一种经济行为吗？");
        question_counter = 12;
    }

    private void question13() {
        TextView textView = (TextView) findViewById(R.id.question);
        textView.setText("你觉得在感情里有对错吗？");
        question_counter = 13;
    }

    private void question14() {
        TextView textView = (TextView) findViewById(R.id.question);
        textView.setText("热恋期的你会时不时对未来悲观吗？");
        question_counter = 14;
    }

    private void question15() {
        TextView textView = (TextView) findViewById(R.id.question);
        textView.setText("你觉得背叛可能是身不由己的吗？");
        question_counter = 15;
    }


    private String age(int age) {
        String result = "";
        if (age == 1) {
            result = "你年级尚小，即使遇到一些困难也理所应当，相信你一定会找到真爱。";
        }
        if (age == 2) {
            result = "不过，无论感情上发生过什么，就算到了该结婚的年纪也不要着急，不要将就，相信你的另一半就在不远的未来朝你走来。";
        }
        if (age == 3) {
            result = "相信你很有可能已经成家立业，不过不管遇到什么事情，你还有爱你需要你照顾的年迈的父母，还有将你作为精神依靠的孩子，他们都是你生活的动力和色彩，加油。";
        }
        return result;
    }

    private void resultA() {
        TextView textViewResult = (TextView) findViewById(R.id.question);
        textViewResult.setText("测试结果");
        textViewResult.setTextSize(40);
        TextView textView = (TextView) findViewById(R.id.result);
        String compare = age(age);

        textView.setText(name + "：" + "你的爱是一种痴迷的爱。\n你的爱像崇拜，把对方捧在手心里，含在嘴里。" +
                "你的爱情是一种期待，你在秋天精心播种下种子，殷切的等待能有棵大树被你种出来。" +
                "你的爱仿佛水一般，爆发的时候是洪潮雄壮澎湃，柔情时细雨滴滴润万物，你的爱渴望被爱。你的爱是痴迷的爱，爱得勇敢。" +
                "但是曾经一位诗人也说过，爱情是盲目的，你的爱仿佛也有这样的悲哀。" + compare);
        Button button1 = (Button) findViewById(R.id.yes);
        Button button2 = (Button) findViewById(R.id.no);
        button1.setVisibility(View.INVISIBLE);
        button2.setVisibility(View.INVISIBLE);
    }

    private void resultB() {
        TextView textViewResult = (TextView) findViewById(R.id.question);
        textViewResult.setText("测试结果");
        textViewResult.setTextSize(40);
        String compare = age(age);
        TextView textView = (TextView) findViewById(R.id.result);
        textView.setText(name + "：" + "你的爱是一种隐忍的爱。\n你总是下意识地把爱当成一种罪过，你的爱的履历于是永远是行走在长着荆棘的山路。" +
                "心如果没有翅膀，爱就是一种受伤。" +
                "执着的你伤痕累累，却仍然不肯用弯刀去剜坏掉的伤口。" +
                "隐忍的爱终究会像夏天太阳下没人吃的西瓜，腐烂发臭。" +
                "如果爱得不勇敢，爱就往往成为陪葬。" + compare);
        Button button1 = (Button) findViewById(R.id.yes);
        Button button2 = (Button) findViewById(R.id.no);
        button1.setVisibility(View.INVISIBLE);
        button2.setVisibility(View.INVISIBLE);
    }

    private void resultC() {
        TextView textViewResult = (TextView) findViewById(R.id.question);
        textViewResult.setText("测试结果");
        textViewResult.setTextSize(40);
        String compare = age(age);
        TextView textView = (TextView) findViewById(R.id.result);
        textView.setText(name + "：" + "你的爱是一种纯纯的爱。\n你的爱仿佛清冽的甘泉，可以治疗无数疾病，是健康的根基。" +
                "再多阴谋比不上一颗单纯的心。" +
                "你的爱简单，没有一丝垢染，像白云一样自由自在。" +
                "你的爱唤醒良知，它永生。" +
                "虽然它也脆弱，但它的力量有着绕梁三日的渗透力。" + compare);
        Button button1 = (Button) findViewById(R.id.yes);
        Button button2 = (Button) findViewById(R.id.no);
        button1.setVisibility(View.INVISIBLE);
        button2.setVisibility(View.INVISIBLE);
    }

    private void resultD() {
        TextView textViewResult = (TextView) findViewById(R.id.question);
        textViewResult.setText("测试结果");
        textViewResult.setTextSize(40);
        String compare = age(age);
        TextView textView = (TextView) findViewById(R.id.result);
        textView.setText(name + "：" + "你的爱是一种大度的爱。\n你的爱始终是那么体贴，你的心永远先想到对方。" +
                "可是这样一来，你就变成了爱的守护神，永远回不到爱人的座位了。" +
                "在你心里，你早就给自己做了一个设防，已经准备好了不要得到这份爱。" +
                "因为已经退出战场，所以，做什么都是隔着玻璃。" +
                "说白了，是退让的爱。" + compare);
        Button button1 = (Button) findViewById(R.id.yes);
        Button button2 = (Button) findViewById(R.id.no);
        button1.setVisibility(View.INVISIBLE);
        button2.setVisibility(View.INVISIBLE);
    }

    private void resultE() {
        TextView textViewResult = (TextView) findViewById(R.id.question);
        textViewResult.setText("测试结果");
        textViewResult.setTextSize(40);
        String compare = age(age);
        TextView textView = (TextView) findViewById(R.id.result);
        textView.setText(name + "：" + "你的爱是一种绝望的爱。\n如果说盲目的爱是种无奈，始终带有理智的爱就是种绝望了。" +
                "你爱得绝望是因为你是种带有一颗戒备之心。" +
                "你对人性太了解，晶莹剔透一颗心，" +
                "天生的心思巧妙，三言两语便可以夺得城池，雄视四方的不外乎你这样的人。" +
                "只是，因为你不能全心的投入爱情，错失真爱最容易。" + compare);
        Button button1 = (Button) findViewById(R.id.yes);
        Button button2 = (Button) findViewById(R.id.no);
        button1.setVisibility(View.INVISIBLE);
        button2.setVisibility(View.INVISIBLE);
    }

}
