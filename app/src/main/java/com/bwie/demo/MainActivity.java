package com.bwie.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.widget.Toast;


import com.squareup.okhttp.Request;

import com.zhy.http.okhttp.OkHttpUtils;


import com.zhy.http.okhttp.callback.StringCallback;

public
class
MainActivity extends AppCompatActivity {

    private String path="http://ic.snssdk.com/2/article/v25/stream/?count=20&min_behot_time=1457659690&bd_latitude=4.9E-324&bd_longitude=4.9E-324&bd_loc_time=1457672153&loc_mode=5&lac=4527&cid=28883&iid=3839760160&device_id=12246291682&ac=wifi&channel=baidu&aid=13&app_name=news_article&version_code=460&device_platform=android&device_type=iToolsAVM&os_api=19&os_version=4.4.4&uuid=352284045861006";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getadate();
    }

    private void getadate() {

        /**
         * OkHttp,GET请求
         */
        OkHttpUtils.get().url(path).build().execute(new StringCallback() {
            @Override
            public void onError(Request request, Exception e) {
            }
            @Override
            public void onResponse(String response) {
                Toast.makeText(MainActivity.this,response,Toast.LENGTH_SHORT).show();
            }
        });
        /**
         * OkHttp,POST请求
         */
        /*OkHttpUtils.post().url(path).addParams("openudid","84c1c7b192991cc6").build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Request request, Exception e) {
                    }
                    @Override
                    public void onResponse(String response) {
                        Toast.makeText(MainActivity.this,response,Toast.LENGTH_SHORT).show();
                    }
                });*/

    }
}
