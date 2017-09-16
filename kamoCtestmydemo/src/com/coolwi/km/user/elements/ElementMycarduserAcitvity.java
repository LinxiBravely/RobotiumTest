package com.coolwi.km.user.elements;

import android.Manifest.permission;
import android.app.Activity;
import android.provider.ContactsContract.CommonDataKinds.Im;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.coolwi.km.user.test.myOperationFun;
import com.robotium.solo.Solo;

public class ElementMycarduserAcitvity {
	private Solo solo;
	private ImageView me_title_iv_f,me_title_iv_x;
	private LinearLayout me_rb_transaction_record;//交易记录
	private LinearLayout me_rb_red_packet;//我的优惠券
	private LinearLayout me_rb_in_kamo;//关于卡莫
	private LinearLayout me_rb_using_kamo;//使用帮助
	private LinearLayout me_rb_kamo_feedback;//意见反馈
	private LinearLayout me_rb_kamo_tc;//退出
	private TextView me_menber_name;//我的姓名
	public ElementMycarduserAcitvity(Solo solo){
		this.solo=solo;
	}
	public View clickById(String id) throws Exception{  	    
        Activity act=solo.getCurrentActivity();//锟斤拷取锟斤拷前Activity  
        int  id1=act.getResources().getIdentifier(id, "id", solo.getCurrentActivity().getPackageName());//锟斤拷取id  
        View view=solo.getView(id1);//锟矫碉拷View  
        return view;
//         solo.clickOnView(view);//锟斤拷锟�        
} 
	public void initView(){
		try {
			me_title_iv_f=(ImageView)clickById("me_title_iv_f");
			me_title_iv_x=(ImageView)clickById("me_title_iv_x");
			me_rb_red_packet=(LinearLayout)clickById("me_rb_red_packet");
			me_rb_in_kamo=(LinearLayout)clickById("me_rb_in_kamo");
			me_rb_kamo_feedback=(LinearLayout)clickById("me_rb_kamo_feedback");
			me_rb_using_kamo=(LinearLayout)clickById("me_rb_using_kamo");
			me_rb_kamo_tc=(LinearLayout)clickById("me_rb_kamo_tc");
			me_menber_name=(TextView)clickById("me_menber_name");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public  ImageView getme_title_iv_f() {
		return me_title_iv_f;
	}
	public ImageView getme_title_iv_x() {
		return me_title_iv_x;
		
	}
	public LinearLayout getme_rb_red_packet(){
		return me_rb_red_packet;	
	}
	public LinearLayout getme_rb_in_kamo(){
		return me_rb_in_kamo;	
	}
	public LinearLayout getme_rb_kamo_feedback(){
		return me_rb_kamo_feedback;	
	}
	public LinearLayout getme_rb_using_kamo(){
		return me_rb_using_kamo;	
	}
	public TextView getme_menber_name(){
		return me_menber_name;	
	}
}
